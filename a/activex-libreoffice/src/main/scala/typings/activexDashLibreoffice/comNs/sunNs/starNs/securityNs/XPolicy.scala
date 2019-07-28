package typings.activexDashLibreoffice.comNs.sunNs.starNs.securityNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for getting sets of permissions of a specified user or the default permissions if no user is given.
  * @see com.sun.star.security.Policy
  * @since OOo 1.1.2
  */
trait XPolicy extends XInterface {
  /**
    * Gets the default permissions granted to all users.
    * @returns default permissions
    */
  val DefaultPermissions: SafeArray[_]
  /**
    * Gets the default permissions granted to all users.
    * @returns default permissions
    */
  def getDefaultPermissions(): SafeArray[_]
  /**
    * Gets the permissions of the specified user excluding the default permissions granted to all users.
    * @param userId user id
    * @returns permissions of the specified user
    */
  def getPermissions(userId: String): SafeArray[_]
  /** Refreshes the policy configuration. */
  def refresh(): Unit
}

object XPolicy {
  @scala.inline
  def apply(
    DefaultPermissions: SafeArray[_],
    acquire: () => Unit,
    getDefaultPermissions: () => SafeArray[_],
    getPermissions: String => SafeArray[_],
    queryInterface: `type` => js.Any,
    refresh: () => Unit,
    release: () => Unit
  ): XPolicy = {
    val __obj = js.Dynamic.literal(DefaultPermissions = DefaultPermissions, acquire = js.Any.fromFunction0(acquire), getDefaultPermissions = js.Any.fromFunction0(getDefaultPermissions), getPermissions = js.Any.fromFunction1(getPermissions), queryInterface = js.Any.fromFunction1(queryInterface), refresh = js.Any.fromFunction0(refresh), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XPolicy]
  }
}

