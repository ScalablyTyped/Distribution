package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows for changing a users password. */
trait XUser extends XAuthorizable {
  /**
    * allows modifying a user password.
    * @param oldPassword the old password to be reset
    * @param newPassword the new password
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def changePassword(oldPassword: java.lang.String, newPassword: java.lang.String): scala.Unit
}

object XUser {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    changePassword: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    getGrantablePrivileges: js.Function2[java.lang.String, scala.Double, scala.Double],
    getPrivileges: js.Function2[java.lang.String, scala.Double, scala.Double],
    grantPrivileges: js.Function3[java.lang.String, scala.Double, scala.Double, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    revokePrivileges: js.Function3[java.lang.String, scala.Double, scala.Double, scala.Unit]
  ): XUser = {
    val __obj = js.Dynamic.literal(acquire = acquire, changePassword = changePassword, getGrantablePrivileges = getGrantablePrivileges, getPrivileges = getPrivileges, grantPrivileges = grantPrivileges, queryInterface = queryInterface, release = release, revokePrivileges = revokePrivileges)
  
    __obj.asInstanceOf[XUser]
  }
}

