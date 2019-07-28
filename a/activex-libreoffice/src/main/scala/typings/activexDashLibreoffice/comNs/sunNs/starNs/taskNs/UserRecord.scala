package typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs

import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserRecord extends js.Object {
  var Passwords: SafeArray[String]
  var UserName: String
}

object UserRecord {
  @scala.inline
  def apply(Passwords: SafeArray[String], UserName: String): UserRecord = {
    val __obj = js.Dynamic.literal(Passwords = Passwords, UserName = UserName)
  
    __obj.asInstanceOf[UserRecord]
  }
}

