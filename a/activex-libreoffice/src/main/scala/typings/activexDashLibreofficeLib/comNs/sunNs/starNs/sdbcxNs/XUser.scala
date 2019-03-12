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
    acquire: () => scala.Unit,
    changePassword: (java.lang.String, java.lang.String) => scala.Unit,
    getGrantablePrivileges: (java.lang.String, scala.Double) => scala.Double,
    getPrivileges: (java.lang.String, scala.Double) => scala.Double,
    grantPrivileges: (java.lang.String, scala.Double, scala.Double) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    revokePrivileges: (java.lang.String, scala.Double, scala.Double) => scala.Unit
  ): XUser = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), changePassword = js.Any.fromFunction2(changePassword), getGrantablePrivileges = js.Any.fromFunction2(getGrantablePrivileges), getPrivileges = js.Any.fromFunction2(getPrivileges), grantPrivileges = js.Any.fromFunction3(grantPrivileges), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), revokePrivileges = js.Any.fromFunction3(revokePrivileges))
  
    __obj.asInstanceOf[XUser]
  }
}

