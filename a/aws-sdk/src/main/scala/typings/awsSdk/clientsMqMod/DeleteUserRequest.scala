package typings.awsSdk.clientsMqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteUserRequest extends StObject {
  
  /**
    * The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: string
  
  /**
    * The username of the ActiveMQ user. This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes (- . _ ~). This value must be 2-100 characters long.
    */
  var Username: string
}
object DeleteUserRequest {
  
  inline def apply(BrokerId: string, Username: string): DeleteUserRequest = {
    val __obj = js.Dynamic.literal(BrokerId = BrokerId.asInstanceOf[js.Any], Username = Username.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUserRequest]
  }
  
  extension [Self <: DeleteUserRequest](x: Self) {
    
    inline def setBrokerId(value: string): Self = StObject.set(x, "BrokerId", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: string): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
  }
}
