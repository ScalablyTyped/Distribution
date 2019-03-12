package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait XMultiLayerStratum
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
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
  def getLayer(aLayerId: java.lang.String, aTimestamp: java.lang.String): XLayer
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
  def getLayers(
    aLayerIds: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String],
    aTimestamp: java.lang.String
  ): stdLib.SafeArray[XLayer]
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
  def getMultipleLayers(
    aLayerIds: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String],
    aTimestamps: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]
  ): stdLib.SafeArray[XLayer]
  /**
    * retrieves a writable representation of the layer associated to a layer id.
    * @param aLayerId identifier of the layer to be accessed for writing. A layer id for writing can be obtained from {@link XMultiLayerStratum.getUpdateLayer
    * @returns an {@link UpdatableLayer} object providing write access to the layer
    * @throws com::sun::star::lang::IllegalArgumentException if the layer id is invalid.
    * @throws com::sun::star::lang::NoSupportException if the implementation does not support updates.
    * @throws com::sun::star::configuration::backend::BackendAccessException if an error occurs while accessing the data.
    */
  def getUpdatableLayer(aLayerId: java.lang.String): XUpdatableLayer
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
  def getUpdateLayerId(aComponent: java.lang.String, aEntity: java.lang.String): java.lang.String
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
  def listLayerIds(aComponent: java.lang.String, aEntity: java.lang.String): stdLib.SafeArray[java.lang.String]
}

object XMultiLayerStratum {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    getLayer: (java.lang.String, java.lang.String) => XLayer,
    getLayers: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], java.lang.String) => stdLib.SafeArray[XLayer],
    getMultipleLayers: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]) => stdLib.SafeArray[XLayer],
    getUpdatableLayer: java.lang.String => XUpdatableLayer,
    getUpdateLayerId: (java.lang.String, java.lang.String) => java.lang.String,
    listLayerIds: (java.lang.String, java.lang.String) => stdLib.SafeArray[java.lang.String],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XMultiLayerStratum = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getLayer = js.Any.fromFunction2(getLayer), getLayers = js.Any.fromFunction2(getLayers), getMultipleLayers = js.Any.fromFunction2(getMultipleLayers), getUpdatableLayer = js.Any.fromFunction1(getUpdatableLayer), getUpdateLayerId = js.Any.fromFunction2(getUpdateLayerId), listLayerIds = js.Any.fromFunction2(listLayerIds), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XMultiLayerStratum]
  }
}

