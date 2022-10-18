package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRdsDbInstanceRequest extends StObject {
  
  /**
    * The database password.
    */
  var DbPassword: js.UndefOr[String] = js.undefined
  
  /**
    * The master user name.
    */
  var DbUser: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon RDS instance's ARN.
    */
  var RdsDbInstanceArn: String
}
object UpdateRdsDbInstanceRequest {
  
  inline def apply(RdsDbInstanceArn: String): UpdateRdsDbInstanceRequest = {
    val __obj = js.Dynamic.literal(RdsDbInstanceArn = RdsDbInstanceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRdsDbInstanceRequest]
  }
  
  extension [Self <: UpdateRdsDbInstanceRequest](x: Self) {
    
    inline def setDbPassword(value: String): Self = StObject.set(x, "DbPassword", value.asInstanceOf[js.Any])
    
    inline def setDbPasswordUndefined: Self = StObject.set(x, "DbPassword", js.undefined)
    
    inline def setDbUser(value: String): Self = StObject.set(x, "DbUser", value.asInstanceOf[js.Any])
    
    inline def setDbUserUndefined: Self = StObject.set(x, "DbUser", js.undefined)
    
    inline def setRdsDbInstanceArn(value: String): Self = StObject.set(x, "RdsDbInstanceArn", value.asInstanceOf[js.Any])
  }
}
