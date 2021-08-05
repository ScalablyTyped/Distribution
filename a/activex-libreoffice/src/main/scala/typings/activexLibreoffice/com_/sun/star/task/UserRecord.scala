package typings.activexLibreoffice.com_.sun.star.task

import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserRecord extends StObject {
  
  var Passwords: SafeArray[String]
  
  var UserName: String
}
object UserRecord {
  
  inline def apply(Passwords: SafeArray[String], UserName: String): UserRecord = {
    val __obj = js.Dynamic.literal(Passwords = Passwords.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserRecord]
  }
  
  extension [Self <: UserRecord](x: Self) {
    
    inline def setPasswords(value: SafeArray[String]): Self = StObject.set(x, "Passwords", value.asInstanceOf[js.Any])
    
    inline def setUserName(value: String): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
