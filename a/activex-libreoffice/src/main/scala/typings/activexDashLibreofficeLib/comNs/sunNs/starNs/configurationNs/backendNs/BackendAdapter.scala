package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.configurationNs.backendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * implements {@link Backend} retrieving data from a {@link SingleBackend} .
  * @since OOo 1.1.2
  */
trait BackendAdapter
  extends Backend
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization

object BackendAdapter {
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
  ): BackendAdapter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AdminEntity")(AdminEntity)
    __obj.updateDynamic("OwnerEntity")(OwnerEntity)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getAdminEntity")(getAdminEntity)
    __obj.updateDynamic("getComponentSchema")(getComponentSchema)
    __obj.updateDynamic("getOwnUpdateHandler")(getOwnUpdateHandler)
    __obj.updateDynamic("getOwnerEntity")(getOwnerEntity)
    __obj.updateDynamic("getUpdateHandler")(getUpdateHandler)
    __obj.updateDynamic("initialize")(initialize)
    __obj.updateDynamic("isEqualEntity")(isEqualEntity)
    __obj.updateDynamic("listLayers")(listLayers)
    __obj.updateDynamic("listOwnLayers")(listOwnLayers)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("supportsEntity")(supportsEntity)
    __obj.asInstanceOf[BackendAdapter]
  }
}

