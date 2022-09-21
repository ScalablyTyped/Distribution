package typings.activexLibreoffice.com_.sun.star.configuration.backend

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Handles access to a stratum consisting of a single layer in a configuration data repository
  *
  * The interface provides timestamp-checking capabilities for efficient caching.
  * @see com.sun.star.util.XTimeStamped
  * @see com.sun.star.configuration.backend.XSchemaSupplier
  * @see com.sun.star.configuration.backend.XMultiLayerStratum
  * @since OOo 1.1.2
  */
trait XSingleLayerStratum
  extends StObject
     with XInterface {
  
  /**
    * retrieves the layer data for a component, if newer than indicated.
    *
    * A timestamp can be provided, which is used to indicate a point in time. The layer should be returned only if is modified since that time.
    * @param aComponent The name of the component to access.
    * @param aTimestamp a timestamp for the layer.  An empty timestamp indicates, that the layer should be retrieved irrespective of its modification time.  T
    * @returns a {@link Layer} object providing access to the layer data, `NULL` if the layer is newer than indicated by the timestamp.
    * @see com.sun.star.util.XTimeStamped
    * @throws com::sun::star::lang::IllegalArgumentException if the component identifier is invalid or if the timestamp is invalid.
    * @throws com::sun::star::configuration::backend::BackendAccessException if an error occurs while accessing the data.
    */
  def getLayer(aComponent: String, aTimestamp: String): XLayer
  
  /**
    * retrieves a writable representation of the layer for a component.
    * @param aComponent The name of the component to access.
    * @returns an {@link UpdatableLayer} object providing write access to the layer
    * @throws com::sun::star::lang::IllegalArgumentException if the component identifier is invalid.
    * @throws com::sun::star::lang::NoSupportException if the implementation does not support updates.
    * @throws com::sun::star::configuration::backend::BackendAccessException if an error occurs while accessing the data.
    */
  def getUpdatableLayer(aComponent: String): XUpdatableLayer
}
object XSingleLayerStratum {
  
  inline def apply(
    acquire: () => Unit,
    getLayer: (String, String) => XLayer,
    getUpdatableLayer: String => XUpdatableLayer,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XSingleLayerStratum = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getLayer = js.Any.fromFunction2(getLayer), getUpdatableLayer = js.Any.fromFunction1(getUpdatableLayer), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSingleLayerStratum]
  }
  
  extension [Self <: XSingleLayerStratum](x: Self) {
    
    inline def setGetLayer(value: (String, String) => XLayer): Self = StObject.set(x, "getLayer", js.Any.fromFunction2(value))
    
    inline def setGetUpdatableLayer(value: String => XUpdatableLayer): Self = StObject.set(x, "getUpdatableLayer", js.Any.fromFunction1(value))
  }
}
