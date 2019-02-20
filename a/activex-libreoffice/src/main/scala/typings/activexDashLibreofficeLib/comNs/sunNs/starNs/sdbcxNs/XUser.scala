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

