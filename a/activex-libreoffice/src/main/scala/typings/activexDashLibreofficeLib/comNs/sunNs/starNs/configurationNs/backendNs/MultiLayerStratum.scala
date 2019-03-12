package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to a singe layer of configuration data */
trait MultiLayerStratum
  extends XMultiLayerStratum
     with XBackendEntities

object MultiLayerStratum {
  @scala.inline
  def apply(
    AdminEntity: java.lang.String,
    OwnerEntity: java.lang.String,
    acquire: () => scala.Unit,
    getAdminEntity: () => java.lang.String,
    getLayer: (java.lang.String, java.lang.String) => XLayer,
    getLayers: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], java.lang.String) => stdLib.SafeArray[XLayer],
    getMultipleLayers: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]) => stdLib.SafeArray[XLayer],
    getOwnerEntity: () => java.lang.String,
    getUpdatableLayer: java.lang.String => XUpdatableLayer,
    getUpdateLayerId: (java.lang.String, java.lang.String) => java.lang.String,
    isEqualEntity: (java.lang.String, java.lang.String) => scala.Boolean,
    listLayerIds: (java.lang.String, java.lang.String) => stdLib.SafeArray[java.lang.String],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    supportsEntity: java.lang.String => scala.Boolean
  ): MultiLayerStratum = {
    val __obj = js.Dynamic.literal(AdminEntity = AdminEntity, OwnerEntity = OwnerEntity, acquire = js.Any.fromFunction0(acquire), getAdminEntity = js.Any.fromFunction0(getAdminEntity), getLayer = js.Any.fromFunction2(getLayer), getLayers = js.Any.fromFunction2(getLayers), getMultipleLayers = js.Any.fromFunction2(getMultipleLayers), getOwnerEntity = js.Any.fromFunction0(getOwnerEntity), getUpdatableLayer = js.Any.fromFunction1(getUpdatableLayer), getUpdateLayerId = js.Any.fromFunction2(getUpdateLayerId), isEqualEntity = js.Any.fromFunction2(isEqualEntity), listLayerIds = js.Any.fromFunction2(listLayerIds), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), supportsEntity = js.Any.fromFunction1(supportsEntity))
  
    __obj.asInstanceOf[MultiLayerStratum]
  }
}

