package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.securityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for getting sets of permissions of a specified user or the default permissions if no user is given.
  * @see com.sun.star.security.Policy
  * @since OOo 1.1.2
  */
trait XPolicy
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Gets the default permissions granted to all users.
    * @returns default permissions
    */
  val DefaultPermissions: activexDashInteropLib.SafeArray[_]
  /**
    * Gets the default permissions granted to all users.
    * @returns default permissions
    */
  def getDefaultPermissions(): activexDashInteropLib.SafeArray[_]
  /**
    * Gets the permissions of the specified user excluding the default permissions granted to all users.
    * @param userId user id
    * @returns permissions of the specified user
    */
  def getPermissions(userId: java.lang.String): activexDashInteropLib.SafeArray[_]
  /** Refreshes the policy configuration. */
  def refresh(): scala.Unit
}

