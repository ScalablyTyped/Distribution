package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides a unified interface for the {@link PasswordContainer} service to implement.
  * @since LibreOffice 4.0
  */
trait XPasswordContainer2
  extends StObject
     with XPasswordContainer
     with XMasterPasswordHandling2
     with XUrlContainer
object XPasswordContainer2 {
  
  inline def apply(
    acquire: () => Unit,
    add: (String, String, SeqEquiv[String], XInteractionHandler) => Unit,
    addPersistent: (String, String, SeqEquiv[String], XInteractionHandler) => Unit,
    addUrl: (String, Boolean) => Unit,
    allowPersistentStoring: Boolean => Boolean,
    authorizateWithMasterPassword: XInteractionHandler => Boolean,
    changeMasterPassword: XInteractionHandler => Boolean,
    find: (String, XInteractionHandler) => UrlRecord,
    findForName: (String, String, XInteractionHandler) => UrlRecord,
    findUrl: String => String,
    getAllPersistent: XInteractionHandler => SafeArray[UrlRecord],
    getUrls: Boolean => SafeArray[String],
    hasMasterPassword: () => Boolean,
    isDefaultMasterPasswordUsed: () => Boolean,
    isPersistentStoringAllowed: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    remove: (String, String) => Unit,
    removeAllPersistent: () => Unit,
    removeMasterPassword: () => Unit,
    removePersistent: (String, String) => Unit,
    removeUrl: String => Unit,
    useDefaultMasterPassword: XInteractionHandler => Boolean
  ): XPasswordContainer2 = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), add = js.Any.fromFunction4(add), addPersistent = js.Any.fromFunction4(addPersistent), addUrl = js.Any.fromFunction2(addUrl), allowPersistentStoring = js.Any.fromFunction1(allowPersistentStoring), authorizateWithMasterPassword = js.Any.fromFunction1(authorizateWithMasterPassword), changeMasterPassword = js.Any.fromFunction1(changeMasterPassword), find = js.Any.fromFunction2(find), findForName = js.Any.fromFunction3(findForName), findUrl = js.Any.fromFunction1(findUrl), getAllPersistent = js.Any.fromFunction1(getAllPersistent), getUrls = js.Any.fromFunction1(getUrls), hasMasterPassword = js.Any.fromFunction0(hasMasterPassword), isDefaultMasterPasswordUsed = js.Any.fromFunction0(isDefaultMasterPasswordUsed), isPersistentStoringAllowed = js.Any.fromFunction0(isPersistentStoringAllowed), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction2(remove), removeAllPersistent = js.Any.fromFunction0(removeAllPersistent), removeMasterPassword = js.Any.fromFunction0(removeMasterPassword), removePersistent = js.Any.fromFunction2(removePersistent), removeUrl = js.Any.fromFunction1(removeUrl), useDefaultMasterPassword = js.Any.fromFunction1(useDefaultMasterPassword))
    __obj.asInstanceOf[XPasswordContainer2]
  }
}
