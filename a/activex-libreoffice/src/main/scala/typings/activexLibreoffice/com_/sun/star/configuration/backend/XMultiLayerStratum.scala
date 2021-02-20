package typings.activexLibreoffice.com_.sun.star.configuration.backend

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Handles access to a stratum consisting of multiple layers in a single configuration data repository
  *
  * The interface provides access to data for multiple entities and timestamp-checking capabilities for efficient caching.
  * @see com.sun.star.configuration.backend.XBackendEntities
  * @see com.sun.star.util.XTimeStamped
  * @see com.sun.star.configuration.backend.XSchemaSupplier
  * @see com.sun.star.configuration.backend.XSingleLayerStratum
  * @since OOo 1.1.2
  */
@js.native
trait XMultiLayerStratum extends XInterface {
  
  /**
    * retrieves a layer associated to a layer id, if newer than indicated.
    *
    * A timestamp can be provided, which is used to indicate a point in time. The layer should be returned only if is modified since that time.
    * @param aLayerId identifier of the layers to be accessed.{@link Layer} ids can be obtained from {@link XMultiLayerStratum.listLayerIds()} or {@link XMult
    * @param aTimestamp a timestamp for the layer.  An empty timestamp indicates, that the layer should be retrieved irrespective of its modification time.  T
    * @returns a {@link Layer} object providing access to the layer data, `NULL` if the layer is newer than indicated by the timestamp.
    * @see com.sun.star.util.XTimeStamped
    * @throws com::sun::star::lang::IllegalArgumentException if the layer id is invalid or if the timestamp is invalid
    * @throws com::sun::star::configuration::backend::BackendAccessException if an error occurs while accessing the data.
    */
  def getLayer(aLayerId: String, aTimestamp: String): XLayer = js.native
  
  /**
    * retrieves the layers associated to a series of layer ids, if newer than indicated.
    *
    * A timestamp can be provided, which is used to indicate a point in time. Only layers that are modified since that time should be returned. The same
    * timestamp is used for all layers.
    * @param aLayerIds identifiers of the layers to be accessed.{@link Layer} ids can be obtained from {@link XMultiLayerStratum.listLayerIds()} .
    * @param aTimestamp a timestamp for all of the layers. An empty timestamp indicates, that the layers should be retrieved irrespective of their modificatio
    * @returns a list of {@link Layer} objects providing access to the layer data. The list has the same length as aLayerIds. Each layer object is associated to
    * @see com.sun.star.util.XTimeStamped
    * @throws com::sun::star::lang::IllegalArgumentException if one of the layer ids is invalid or if the timestamp is invalid
    * @throws com::sun::star::configuration::backend::BackendAccessException if an error occurs while accessing the data.
    */
  def getLayers(aLayerIds: SeqEquiv[String], aTimestamp: String): SafeArray[XLayer] = js.native
  
  /**
    * retrieves the layers associated to a series of layer ids, if newer than indicated for each layer.
    *
    * For each layer an individual timestamp can be provided, which is used to indicate the last known version of the layer. Only layers that are modified
    * since that time should be returned.
    * @param aLayerIds identifiers of the layers to be accessed.{@link Layer} ids can be obtained from {@link XMultiLayerStratum.listLayerIds()} .
    * @param aTimestamps timestamps for each of the layers.  This list must have the same length as aLayerIds. Timestamps are matched to layer ids by their po
    * @returns a list of {@link Layer} objects providing access to the layer data. The list has the same length as aLayerIds. Each layer object is associated to
    * @see com.sun.star.util.XTimeStamped
    * @throws com::sun::star::lang::IllegalArgumentException if one of the layer ids is invalid or if one of the timestamps is invalid or if the lengths of the
    * @throws com::sun::star::configuration::backend::BackendAccessException if an error occurs while accessing the data.
    */
  def getMultipleLayers(aLayerIds: SeqEquiv[String], aTimestamps: SeqEquiv[String]): SafeArray[XLayer] = js.native
  
  /**
    * retrieves a writable representation of the layer associated to a layer id.
    * @param aLayerId identifier of the layer to be accessed for writing. A layer id for writing can be obtained from {@link XMultiLayerStratum.getUpdateLayer
    * @returns an {@link UpdatableLayer} object providing write access to the layer
    * @throws com::sun::star::lang::IllegalArgumentException if the layer id is invalid.
    * @throws com::sun::star::lang::NoSupportException if the implementation does not support updates.
    * @throws com::sun::star::configuration::backend::BackendAccessException if an error occurs while accessing the data.
    */
  def getUpdatableLayer(aLayerId: String): XUpdatableLayer = js.native
  
  /**
    * identifies the layer which should be modified to update data of a component on behalf of an entity.
    *
    * The layer id returned is one of the layer ids obtained from {@link XMultiLayerStratum.listLayerIds()} for the same component and entity.
    * @param aComponent The name of the component to access.
    * @param aEntity The name of an entity on behalf of which data will be accessed.
    * @returns a layer identifier that can be used to obtain an {@link UpdatableLayer} object.
    * @see com.sun.star.configuration.backend.XMultiLayerStratum.getUpdatableLayer()
    * @see com.sun.star.configuration.backend.XBackendEntities
    * @throws com::sun::star::lang::IllegalArgumentException if the component identifier is invalid or if the entity doesn't exist.
    * @throws com::sun::star::lang::NoSupportException if the implementation does not support updates.
    * @throws com::sun::star::configuration::backend::BackendAccessException if an error occurs while accessing the data.
    */
  def getUpdateLayerId(aComponent: String, aEntity: String): String = js.native
  
  /**
    * identifies the layers within this stratum which should be read and merged to determine data of a component for an entity
    * @param aComponent The name of the component to access.
    * @param aEntity The name of an entity on behalf of which data will be accessed.
    * @returns a list of layer identifiers that can be used to retrieve {@link Layer} objects. The list is ordered by priority. Typically the most general layer
    * @see com.sun.star.configuration.backend.XMultiLayerStratum.getLayer()
    * @see com.sun.star.configuration.backend.XMultiLayerStratum.getLayers()
    * @see com.sun.star.configuration.backend.XMultiLayerStratum.getMultipleLayers()
    * @see com.sun.star.configuration.backend.XBackendEntities
    * @throws com::sun::star::lang::IllegalArgumentException if the component identifier is invalid or if the entity doesn't exist.
    * @throws com::sun::star::configuration::backend::BackendAccessException if an error occurs while accessing the data.
    */
  def listLayerIds(aComponent: String, aEntity: String): SafeArray[String] = js.native
}
object XMultiLayerStratum {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    getLayer: (String, String) => XLayer,
    getLayers: (SeqEquiv[String], String) => SafeArray[XLayer],
    getMultipleLayers: (SeqEquiv[String], SeqEquiv[String]) => SafeArray[XLayer],
    getUpdatableLayer: String => XUpdatableLayer,
    getUpdateLayerId: (String, String) => String,
    listLayerIds: (String, String) => SafeArray[String],
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XMultiLayerStratum = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getLayer = js.Any.fromFunction2(getLayer), getLayers = js.Any.fromFunction2(getLayers), getMultipleLayers = js.Any.fromFunction2(getMultipleLayers), getUpdatableLayer = js.Any.fromFunction1(getUpdatableLayer), getUpdateLayerId = js.Any.fromFunction2(getUpdateLayerId), listLayerIds = js.Any.fromFunction2(listLayerIds), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XMultiLayerStratum]
  }
  
  @scala.inline
  implicit class XMultiLayerStratumMutableBuilder[Self <: XMultiLayerStratum] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetLayer(value: (String, String) => XLayer): Self = StObject.set(x, "getLayer", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetLayers(value: (SeqEquiv[String], String) => SafeArray[XLayer]): Self = StObject.set(x, "getLayers", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetMultipleLayers(value: (SeqEquiv[String], SeqEquiv[String]) => SafeArray[XLayer]): Self = StObject.set(x, "getMultipleLayers", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetUpdatableLayer(value: String => XUpdatableLayer): Self = StObject.set(x, "getUpdatableLayer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetUpdateLayerId(value: (String, String) => String): Self = StObject.set(x, "getUpdateLayerId", js.Any.fromFunction2(value))
    
    @scala.inline
    def setListLayerIds(value: (String, String) => SafeArray[String]): Self = StObject.set(x, "listLayerIds", js.Any.fromFunction2(value))
  }
}
