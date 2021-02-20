package typings.activexLibreoffice.com_.sun.star.task

import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserRecord extends StObject {
  
  var Passwords: SafeArray[String] = js.native
  
  var UserName: String = js.native
}
object UserRecord {
  
  @scala.inline
  def apply(Passwords: SafeArray[String], UserName: String): UserRecord = {
    val __obj = js.Dynamic.literal(Passwords = Passwords.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserRecord]
  }
  
  @scala.inline
  implicit class UserRecordMutableBuilder[Self <: UserRecord] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPasswords(value: SafeArray[String]): Self = StObject.set(x, "Passwords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: String): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
