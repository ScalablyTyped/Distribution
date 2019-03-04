package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * implements {@link Backend} provides access to a configuration database composed of one or more storage backends containing settings used by software
  * modules.
  */
trait MultiStratumBackend
  extends Backend
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization

object MultiStratumBackend {
  @scala.inline
  def apply(
    AdminEntity: java.lang.String,
    OwnerEntity: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getAdminEntity: js.Function0[java.lang.String],
    getComponentSchema: js.Function1[java.lang.String, XSchema],
    getOwnUpdateHandler: js.Function1[java.lang.String, XUpdateHandler],
    getOwnerEntity: js.Function0[java.lang.String],
    getUpdateHandler: js.Function2[java.lang.String, java.lang.String, XUpdateHandler],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    isEqualEntity: js.Function2[java.lang.String, java.lang.String, scala.Boolean],
    listLayers: js.Function2[java.lang.String, java.lang.String, activexDashInteropLib.SafeArray[XLayer]],
    listOwnLayers: js.Function1[java.lang.String, activexDashInteropLib.SafeArray[XLayer]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    supportsEntity: js.Function1[java.lang.String, scala.Boolean]
  ): MultiStratumBackend = {
    val __obj = js.Dynamic.literal(AdminEntity = AdminEntity, OwnerEntity = OwnerEntity, acquire = acquire, getAdminEntity = getAdminEntity, getComponentSchema = getComponentSchema, getOwnUpdateHandler = getOwnUpdateHandler, getOwnerEntity = getOwnerEntity, getUpdateHandler = getUpdateHandler, initialize = initialize, isEqualEntity = isEqualEntity, listLayers = listLayers, listOwnLayers = listOwnLayers, queryInterface = queryInterface, release = release, supportsEntity = supportsEntity)
  
    __obj.asInstanceOf[MultiStratumBackend]
  }
}

