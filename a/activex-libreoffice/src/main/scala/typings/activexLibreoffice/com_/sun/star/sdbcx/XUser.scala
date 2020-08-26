package typings.activexLibreoffice.com_.sun.star.sdbcx

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows for changing a users password. */
@js.native
trait XUser extends XAuthorizable {
  /**
    * allows modifying a user password.
    * @param oldPassword the old password to be reset
    * @param newPassword the new password
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def changePassword(oldPassword: String, newPassword: String): Unit = js.native
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
  @scala.inline
  implicit class XUserOps[Self <: XUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChangePassword(value: (String, String) => Unit): Self = this.set("changePassword", js.Any.fromFunction2(value))
  }
  
}

