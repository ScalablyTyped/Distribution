package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcxNs

import typings.activexDashLibreoffice.`type`
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
  def changePassword(oldPassword: String, newPassword: String): Unit
}

object XUser {
  @scala.inline
  def apply(
    acquire: () => Unit,
    changePassword: (String, String) => Unit,
    getGrantablePrivileges: (String, Double) => Double,
    getPrivileges: (String, Double) => Double,
    grantPrivileges: (String, Double, Double) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    revokePrivileges: (String, Double, Double) => Unit
  ): XUser = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), changePassword = js.Any.fromFunction2(changePassword), getGrantablePrivileges = js.Any.fromFunction2(getGrantablePrivileges), getPrivileges = js.Any.fromFunction2(getPrivileges), grantPrivileges = js.Any.fromFunction3(grantPrivileges), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), revokePrivileges = js.Any.fromFunction3(revokePrivileges))
  
    __obj.asInstanceOf[XUser]
  }
}

