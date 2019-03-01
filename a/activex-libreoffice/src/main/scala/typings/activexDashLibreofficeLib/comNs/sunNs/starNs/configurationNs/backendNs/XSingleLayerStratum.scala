package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
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
  def getLayer(aComponent: java.lang.String, aTimestamp: java.lang.String): XLayer
  /**
    * retrieves a writable representation of the layer for a component.
    * @param aComponent The name of the component to access.
    * @returns an {@link UpdatableLayer} object providing write access to the layer
    * @throws com::sun::star::lang::IllegalArgumentException if the component identifier is invalid.
    * @throws com::sun::star::lang::NoSupportException if the implementation does not support updates.
    * @throws com::sun::star::configuration::backend::BackendAccessException if an error occurs while accessing the data.
    */
  def getUpdatableLayer(aComponent: java.lang.String): XUpdatableLayer
}

object XSingleLayerStratum {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getLayer: js.Function2[java.lang.String, java.lang.String, XLayer],
    getUpdatableLayer: js.Function1[java.lang.String, XUpdatableLayer],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XSingleLayerStratum = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getLayer")(getLayer)
    __obj.updateDynamic("getUpdatableLayer")(getUpdatableLayer)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XSingleLayerStratum]
  }
}

