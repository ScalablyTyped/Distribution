package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * supports password caching for security mechanisms which use passwords as credentials or as an input to credential creation but don't have an external
  * method to cache these passwords.
  * @since OOo 1.1.2
  */
trait XSSOPasswordCache
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * adds a username/password combination to the cache.
    *
    * If an entry for the specified username already exists in the cache, it will be overwritten.
    * @param UserName the user name to add
    * @param Password the associated password
    * @param Persist indicates whether or not the username/password combination should be persisted
    */
  def addPassword(UserName: java.lang.String, Password: java.lang.String, Persist: scala.Boolean): scala.Unit
  /**
    * retrieves a password for a given user from the cache.
    *
    * Non persistent cache is searched first, followed by the persistent cache ( if it exists ).
    * @param UserName the name of the user whose password should be retrieved
    * @param Persist indicates whether or not the password is persistent
    * @returns the required password
    */
  def getPassword(UserName: java.lang.String, Persist: js.Array[scala.Boolean]): java.lang.String
  /**
    * removes a password from the cache
    * @param UserName the name of the user whose password should be removed.
    * @param RemovePersist indicates whether or not the password should also be removed, if present, from persistent cache.
    */
  def removePassword(UserName: java.lang.String, RemovePersist: scala.Boolean): scala.Unit
}

object XSSOPasswordCache {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addPassword: js.Function3[java.lang.String, java.lang.String, scala.Boolean, scala.Unit],
    getPassword: js.Function2[java.lang.String, js.Array[scala.Boolean], java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePassword: js.Function2[java.lang.String, scala.Boolean, scala.Unit]
  ): XSSOPasswordCache = {
    val __obj = js.Dynamic.literal(acquire = acquire, addPassword = addPassword, getPassword = getPassword, queryInterface = queryInterface, release = release, removePassword = removePassword)
  
    __obj.asInstanceOf[XSSOPasswordCache]
  }
}

