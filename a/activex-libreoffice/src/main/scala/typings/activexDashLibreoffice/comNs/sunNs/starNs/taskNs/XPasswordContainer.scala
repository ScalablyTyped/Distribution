package typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Allows to save passwords with URL-pattern, to use them later. */
trait XPasswordContainer extends XInterface {
  /**
    * Save passwords in to the container.
    * @param Url URL-pattern, that will be used later to retrieve passwords.
    * @param UserName The username.
    * @param Passwords The password-list.
    * @param Handler The handler to get super password to en/decrypt passwords
    */
  def add(Url: String, UserName: String, Passwords: SeqEquiv[String], Handler: XInteractionHandler): Unit
  /**
    * Save passwords in to the container, and store them in the file.
    * @param Url URL-pattern, that will be used later to retrieve passwords.
    * @param UserName The username.
    * @param Passwords The password-list.
    * @param Handler The handler to get super password to en/decrypt passwords
    */
  def addPersistent(Url: String, UserName: String, Passwords: SeqEquiv[String], Handler: XInteractionHandler): Unit
  /**
    * Find users with passwords for the url pattern.
    * @param Url URL-pattern to retrieve password for.
    * @param Handler The handler to get super password to en/decrypt passwords
    * @returns Best matched url-pattern with user-records list.
    */
  def find(Url: String, Handler: XInteractionHandler): UrlRecord
  /**
    * Find passwords for the url pattern and username.
    * @param Url URL-pattern to retrieve passwords for.
    * @param UserName Username to retrieve passwords for.
    * @param Handler The handler to get super password to en/decrypt passwords
    * @returns Best matched url-pattern for the username.
    */
  def findForName(Url: String, UserName: String, Handler: XInteractionHandler): UrlRecord
  /**
    * Get all records from the file.
    * @returns List of url-records.
    */
  def getAllPersistent(Handler: XInteractionHandler): SafeArray[UrlRecord]
  /**
    * Remove passwords for the url pattern and username.
    * @param Url URL-pattern to remove passwords for.
    * @param UserName Username to remove passwords for.
    */
  def remove(Url: String, UserName: String): Unit
  /** Clean the file. */
  def removeAllPersistent(): Unit
  /**
    * Remove passwords for the url pattern and username from the file.
    * @param Url URL-pattern to remove passwords for.
    * @param UserName Username to remove passwords for.
    */
  def removePersistent(Url: String, UserName: String): Unit
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
}

