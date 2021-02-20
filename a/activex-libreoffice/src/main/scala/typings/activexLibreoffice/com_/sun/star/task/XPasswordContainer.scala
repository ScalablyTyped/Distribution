package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Allows to save passwords with URL-pattern, to use them later. */
@js.native
trait XPasswordContainer extends XInterface {
  
  /**
    * Save passwords in to the container.
    * @param Url URL-pattern, that will be used later to retrieve passwords.
    * @param UserName The username.
    * @param Passwords The password-list.
    * @param Handler The handler to get super password to en/decrypt passwords
    */
  def add(Url: String, UserName: String, Passwords: SeqEquiv[String], Handler: XInteractionHandler): Unit = js.native
  
  /**
    * Save passwords in to the container, and store them in the file.
    * @param Url URL-pattern, that will be used later to retrieve passwords.
    * @param UserName The username.
    * @param Passwords The password-list.
    * @param Handler The handler to get super password to en/decrypt passwords
    */
  def addPersistent(Url: String, UserName: String, Passwords: SeqEquiv[String], Handler: XInteractionHandler): Unit = js.native
  
  /**
    * Find users with passwords for the url pattern.
    * @param Url URL-pattern to retrieve password for.
    * @param Handler The handler to get super password to en/decrypt passwords
    * @returns Best matched url-pattern with user-records list.
    */
  def find(Url: String, Handler: XInteractionHandler): UrlRecord = js.native
  
  /**
    * Find passwords for the url pattern and username.
    * @param Url URL-pattern to retrieve passwords for.
    * @param UserName Username to retrieve passwords for.
    * @param Handler The handler to get super password to en/decrypt passwords
    * @returns Best matched url-pattern for the username.
    */
  def findForName(Url: String, UserName: String, Handler: XInteractionHandler): UrlRecord = js.native
  
  /**
    * Get all records from the file.
    * @returns List of url-records.
    */
  def getAllPersistent(Handler: XInteractionHandler): SafeArray[UrlRecord] = js.native
  
  /**
    * Remove passwords for the url pattern and username.
    * @param Url URL-pattern to remove passwords for.
    * @param UserName Username to remove passwords for.
    */
  def remove(Url: String, UserName: String): Unit = js.native
  
  /** Clean the file. */
  def removeAllPersistent(): Unit = js.native
  
  /**
    * Remove passwords for the url pattern and username from the file.
    * @param Url URL-pattern to remove passwords for.
    * @param UserName Username to remove passwords for.
    */
  def removePersistent(Url: String, UserName: String): Unit = js.native
}
object XPasswordContainer {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    add: (String, String, SeqEquiv[String], XInteractionHandler) => Unit,
    addPersistent: (String, String, SeqEquiv[String], XInteractionHandler) => Unit,
    find: (String, XInteractionHandler) => UrlRecord,
    findForName: (String, String, XInteractionHandler) => UrlRecord,
    getAllPersistent: XInteractionHandler => SafeArray[UrlRecord],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    remove: (String, String) => Unit,
    removeAllPersistent: () => Unit,
    removePersistent: (String, String) => Unit
  ): XPasswordContainer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), add = js.Any.fromFunction4(add), addPersistent = js.Any.fromFunction4(addPersistent), find = js.Any.fromFunction2(find), findForName = js.Any.fromFunction3(findForName), getAllPersistent = js.Any.fromFunction1(getAllPersistent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction2(remove), removeAllPersistent = js.Any.fromFunction0(removeAllPersistent), removePersistent = js.Any.fromFunction2(removePersistent))
    __obj.asInstanceOf[XPasswordContainer]
  }
  
  @scala.inline
  implicit class XPasswordContainerMutableBuilder[Self <: XPasswordContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (String, String, SeqEquiv[String], XInteractionHandler) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction4(value))
    
    @scala.inline
    def setAddPersistent(value: (String, String, SeqEquiv[String], XInteractionHandler) => Unit): Self = StObject.set(x, "addPersistent", js.Any.fromFunction4(value))
    
    @scala.inline
    def setFind(value: (String, XInteractionHandler) => UrlRecord): Self = StObject.set(x, "find", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFindForName(value: (String, String, XInteractionHandler) => UrlRecord): Self = StObject.set(x, "findForName", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetAllPersistent(value: XInteractionHandler => SafeArray[UrlRecord]): Self = StObject.set(x, "getAllPersistent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: (String, String) => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveAllPersistent(value: () => Unit): Self = StObject.set(x, "removeAllPersistent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemovePersistent(value: (String, String) => Unit): Self = StObject.set(x, "removePersistent", js.Any.fromFunction2(value))
  }
}
