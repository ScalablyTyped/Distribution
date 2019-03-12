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
    acquire: () => scala.Unit,
    add: (java.lang.String, java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], XInteractionHandler) => scala.Unit,
    addPersistent: (java.lang.String, java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], XInteractionHandler) => scala.Unit,
    addUrl: (java.lang.String, scala.Boolean) => scala.Unit,
    allowPersistentStoring: scala.Boolean => scala.Boolean,
    authorizateWithMasterPassword: XInteractionHandler => scala.Boolean,
    changeMasterPassword: XInteractionHandler => scala.Boolean,
    find: (java.lang.String, XInteractionHandler) => UrlRecord,
    findForName: (java.lang.String, java.lang.String, XInteractionHandler) => UrlRecord,
    findUrl: java.lang.String => java.lang.String,
    getAllPersistent: XInteractionHandler => stdLib.SafeArray[UrlRecord],
    getUrls: scala.Boolean => stdLib.SafeArray[java.lang.String],
    hasMasterPassword: () => scala.Boolean,
    isDefaultMasterPasswordUsed: () => scala.Boolean,
    isPersistentStoringAllowed: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    remove: (java.lang.String, java.lang.String) => scala.Unit,
    removeAllPersistent: () => scala.Unit,
    removeMasterPassword: () => scala.Unit,
    removePersistent: (java.lang.String, java.lang.String) => scala.Unit,
    removeUrl: java.lang.String => scala.Unit,
    useDefaultMasterPassword: XInteractionHandler => scala.Boolean
  ): XPasswordContainer2 = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), add = js.Any.fromFunction4(add), addPersistent = js.Any.fromFunction4(addPersistent), addUrl = js.Any.fromFunction2(addUrl), allowPersistentStoring = js.Any.fromFunction1(allowPersistentStoring), authorizateWithMasterPassword = js.Any.fromFunction1(authorizateWithMasterPassword), changeMasterPassword = js.Any.fromFunction1(changeMasterPassword), find = js.Any.fromFunction2(find), findForName = js.Any.fromFunction3(findForName), findUrl = js.Any.fromFunction1(findUrl), getAllPersistent = js.Any.fromFunction1(getAllPersistent), getUrls = js.Any.fromFunction1(getUrls), hasMasterPassword = js.Any.fromFunction0(hasMasterPassword), isDefaultMasterPasswordUsed = js.Any.fromFunction0(isDefaultMasterPasswordUsed), isPersistentStoringAllowed = js.Any.fromFunction0(isPersistentStoringAllowed), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction2(remove), removeAllPersistent = js.Any.fromFunction0(removeAllPersistent), removeMasterPassword = js.Any.fromFunction0(removeMasterPassword), removePersistent = js.Any.fromFunction2(removePersistent), removeUrl = js.Any.fromFunction1(removeUrl), useDefaultMasterPassword = js.Any.fromFunction1(useDefaultMasterPassword))
  
    __obj.asInstanceOf[XPasswordContainer2]
  }
}

