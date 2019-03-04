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
    val __obj = js.Dynamic.literal(acquire = acquire, add = add, addPersistent = addPersistent, addUrl = addUrl, allowPersistentStoring = allowPersistentStoring, authorizateWithMasterPassword = authorizateWithMasterPassword, changeMasterPassword = changeMasterPassword, find = find, findForName = findForName, findUrl = findUrl, getAllPersistent = getAllPersistent, getUrls = getUrls, hasMasterPassword = hasMasterPassword, isDefaultMasterPasswordUsed = isDefaultMasterPasswordUsed, isPersistentStoringAllowed = isPersistentStoringAllowed, queryInterface = queryInterface, release = release, remove = remove, removeAllPersistent = removeAllPersistent, removeMasterPassword = removeMasterPassword, removePersistent = removePersistent, removeUrl = removeUrl, useDefaultMasterPassword = useDefaultMasterPassword)
  
    __obj.asInstanceOf[XPasswordContainer2]
  }
}

