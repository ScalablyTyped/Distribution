package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a unified interface for the {@link PasswordContainer} service to implement.
  * @since LibreOffice 4.0
  */
trait XPasswordContainer2
  extends XMasterPasswordHandling2
     with XPasswordContainer
     with XUrlContainer

object XPasswordContainer2 {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    add: js.Function4[
      java.lang.String, 
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      XInteractionHandler, 
      scala.Unit
    ],
    addPersistent: js.Function4[
      java.lang.String, 
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], 
      XInteractionHandler, 
      scala.Unit
    ],
    addUrl: js.Function2[java.lang.String, scala.Boolean, scala.Unit],
    allowPersistentStoring: js.Function1[scala.Boolean, scala.Boolean],
    authorizateWithMasterPassword: js.Function1[XInteractionHandler, scala.Boolean],
    changeMasterPassword: js.Function1[XInteractionHandler, scala.Boolean],
    find: js.Function2[java.lang.String, XInteractionHandler, UrlRecord],
    findForName: js.Function3[java.lang.String, java.lang.String, XInteractionHandler, UrlRecord],
    findUrl: js.Function1[java.lang.String, java.lang.String],
    getAllPersistent: js.Function1[XInteractionHandler, activexDashInteropLib.SafeArray[UrlRecord]],
    getUrls: js.Function1[scala.Boolean, activexDashInteropLib.SafeArray[java.lang.String]],
    hasMasterPassword: js.Function0[scala.Boolean],
    isDefaultMasterPasswordUsed: js.Function0[scala.Boolean],
    isPersistentStoringAllowed: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    remove: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    removeAllPersistent: js.Function0[scala.Unit],
    removeMasterPassword: js.Function0[scala.Unit],
    removePersistent: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    removeUrl: js.Function1[java.lang.String, scala.Unit],
    useDefaultMasterPassword: js.Function1[XInteractionHandler, scala.Boolean]
  ): XPasswordContainer2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("add")(add)
    __obj.updateDynamic("addPersistent")(addPersistent)
    __obj.updateDynamic("addUrl")(addUrl)
    __obj.updateDynamic("allowPersistentStoring")(allowPersistentStoring)
    __obj.updateDynamic("authorizateWithMasterPassword")(authorizateWithMasterPassword)
    __obj.updateDynamic("changeMasterPassword")(changeMasterPassword)
    __obj.updateDynamic("find")(find)
    __obj.updateDynamic("findForName")(findForName)
    __obj.updateDynamic("findUrl")(findUrl)
    __obj.updateDynamic("getAllPersistent")(getAllPersistent)
    __obj.updateDynamic("getUrls")(getUrls)
    __obj.updateDynamic("hasMasterPassword")(hasMasterPassword)
    __obj.updateDynamic("isDefaultMasterPasswordUsed")(isDefaultMasterPasswordUsed)
    __obj.updateDynamic("isPersistentStoringAllowed")(isPersistentStoringAllowed)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("removeAllPersistent")(removeAllPersistent)
    __obj.updateDynamic("removeMasterPassword")(removeMasterPassword)
    __obj.updateDynamic("removePersistent")(removePersistent)
    __obj.updateDynamic("removeUrl")(removeUrl)
    __obj.updateDynamic("useDefaultMasterPassword")(useDefaultMasterPassword)
    __obj.asInstanceOf[XPasswordContainer2]
  }
}

