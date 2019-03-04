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
    acquire: js.Function0[scala.Unit],
    getAdminEntity: js.Function0[java.lang.String],
    getLayer: js.Function2[java.lang.String, java.lang.String, XLayer],
    getLayers: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      java.lang.String, 
      activexDashInteropLib.SafeArray[XLayer]
    ],
    getMultipleLayers: js.Function2[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      activexDashInteropLib.SafeArray[XLayer]
    ],
    getOwnerEntity: js.Function0[java.lang.String],
    getUpdatableLayer: js.Function1[java.lang.String, XUpdatableLayer],
    getUpdateLayerId: js.Function2[java.lang.String, java.lang.String, java.lang.String],
    isEqualEntity: js.Function2[java.lang.String, java.lang.String, scala.Boolean],
    listLayerIds: js.Function2[
      java.lang.String, 
      java.lang.String, 
      activexDashInteropLib.SafeArray[java.lang.String]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    supportsEntity: js.Function1[java.lang.String, scala.Boolean]
  ): MultiLayerStratum = {
    val __obj = js.Dynamic.literal(AdminEntity = AdminEntity, OwnerEntity = OwnerEntity, acquire = acquire, getAdminEntity = getAdminEntity, getLayer = getLayer, getLayers = getLayers, getMultipleLayers = getMultipleLayers, getOwnerEntity = getOwnerEntity, getUpdatableLayer = getUpdatableLayer, getUpdateLayerId = getUpdateLayerId, isEqualEntity = isEqualEntity, listLayerIds = listLayerIds, queryInterface = queryInterface, release = release, supportsEntity = supportsEntity)
  
    __obj.asInstanceOf[MultiLayerStratum]
  }
}

