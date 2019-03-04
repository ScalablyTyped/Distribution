package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRecord extends js.Object {
  var Passwords: activexDashInteropLib.SafeArray[java.lang.String]
  var UserName: java.lang.String
}

object UserRecord {
  @scala.inline
  def apply(Passwords: activexDashInteropLib.SafeArray[java.lang.String], UserName: java.lang.String): UserRecord = {
    val __obj = js.Dynamic.literal(Passwords = Passwords, UserName = UserName)
  
    __obj.asInstanceOf[UserRecord]
  }
}

