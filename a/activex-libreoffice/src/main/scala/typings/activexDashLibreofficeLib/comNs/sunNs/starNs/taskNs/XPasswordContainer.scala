package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Allows to save passwords with URL-pattern, to use them later. */
trait XPasswordContainer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Save passwords in to the container.
    * @param Url URL-pattern, that will be used later to retrieve passwords.
    * @param UserName The username.
    * @param Passwords The password-list.
    * @param Handler The handler to get super password to en/decrypt passwords
    */
  def add(
    Url: java.lang.String,
    UserName: java.lang.String,
    Passwords: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String],
    Handler: XInteractionHandler
  ): scala.Unit
  /**
    * Save passwords in to the container, and store them in the file.
    * @param Url URL-pattern, that will be used later to retrieve passwords.
    * @param UserName The username.
    * @param Passwords The password-list.
    * @param Handler The handler to get super password to en/decrypt passwords
    */
  def addPersistent(
    Url: java.lang.String,
    UserName: java.lang.String,
    Passwords: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String],
    Handler: XInteractionHandler
  ): scala.Unit
  /**
    * Find users with passwords for the url pattern.
    * @param Url URL-pattern to retrieve password for.
    * @param Handler The handler to get super password to en/decrypt passwords
    * @returns Best matched url-pattern with user-records list.
    */
  def find(Url: java.lang.String, Handler: XInteractionHandler): UrlRecord
  /**
    * Find passwords for the url pattern and username.
    * @param Url URL-pattern to retrieve passwords for.
    * @param UserName Username to retrieve passwords for.
    * @param Handler The handler to get super password to en/decrypt passwords
    * @returns Best matched url-pattern for the username.
    */
  def findForName(Url: java.lang.String, UserName: java.lang.String, Handler: XInteractionHandler): UrlRecord
  /**
    * Get all records from the file.
    * @returns List of url-records.
    */
  def getAllPersistent(Handler: XInteractionHandler): stdLib.SafeArray[UrlRecord]
  /**
    * Remove passwords for the url pattern and username.
    * @param Url URL-pattern to remove passwords for.
    * @param UserName Username to remove passwords for.
    */
  def remove(Url: java.lang.String, UserName: java.lang.String): scala.Unit
  /** Clean the file. */
  def removeAllPersistent(): scala.Unit
  /**
    * Remove passwords for the url pattern and username from the file.
    * @param Url URL-pattern to remove passwords for.
    * @param UserName Username to remove passwords for.
    */
  def removePersistent(Url: java.lang.String, UserName: java.lang.String): scala.Unit
}

object XPasswordContainer {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    add: (java.lang.String, java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], XInteractionHandler) => scala.Unit,
    addPersistent: (java.lang.String, java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], XInteractionHandler) => scala.Unit,
    find: (java.lang.String, XInteractionHandler) => UrlRecord,
    findForName: (java.lang.String, java.lang.String, XInteractionHandler) => UrlRecord,
    getAllPersistent: XInteractionHandler => stdLib.SafeArray[UrlRecord],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    remove: (java.lang.String, java.lang.String) => scala.Unit,
    removeAllPersistent: () => scala.Unit,
    removePersistent: (java.lang.String, java.lang.String) => scala.Unit
  ): XPasswordContainer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), add = js.Any.fromFunction4(add), addPersistent = js.Any.fromFunction4(addPersistent), find = js.Any.fromFunction2(find), findForName = js.Any.fromFunction3(findForName), getAllPersistent = js.Any.fromFunction1(getAllPersistent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), remove = js.Any.fromFunction2(remove), removeAllPersistent = js.Any.fromFunction0(removeAllPersistent), removePersistent = js.Any.fromFunction2(removePersistent))
  
    __obj.asInstanceOf[XPasswordContainer]
  }
}

