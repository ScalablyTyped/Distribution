package typings.awsSdk.clientsMqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User extends StObject {
  
  /**
    * Enables access to the ActiveMQ Web Console for the ActiveMQ user. Does not apply to RabbitMQ brokers.
    */
  var ConsoleAccess: js.UndefOr[boolean] = js.undefined
  
  /**
    * The list of groups (20 maximum) to which the ActiveMQ user belongs. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long. Does not apply to RabbitMQ brokers.
    */
  var Groups: js.UndefOr[listOfString] = js.undefined
  
  /**
    * Required. The password of the user. This value must be at least 12 characters long, must contain at least 4 unique characters, and must not contain commas, colons, or equal signs (,:=).
    */
  var Password: string
  
  /**
    * important>Amazon MQ for ActiveMQ For ActiveMQ brokers, this value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long./important> Amazon MQ for RabbitMQ For RabbitMQ brokers, this value can contain only alphanumeric characters, dashes, periods, underscores (- . _). This value must not contain a tilde (~) character. Amazon MQ prohibts using guest as a valid usename. This value must be 2-100 characters long.
    */
  var Username: string
}
object User {
  
  inline def apply(Password: string, Username: string): User = {
    val __obj = js.Dynamic.literal(Password = Password.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  extension [Self <: User](x: Self) {
    
    inline def setConsoleAccess(value: boolean): Self = StObject.set(x, "ConsoleAccess", value.asInstanceOf[js.Any])
    
    inline def setConsoleAccessUndefined: Self = StObject.set(x, "ConsoleAccess", js.undefined)
    
    inline def setGroups(value: listOfString): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    inline def setGroupsVarargs(value: string*): Self = StObject.set(x, "Groups", js.Array(value*))
    
    inline def setPassword(value: string): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: string): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
