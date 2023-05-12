package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFlywheelRequest extends StObject {
  
  /**
    * The Amazon Resource Number (ARN) of the active model version.
    */
  var ActiveModelArn: js.UndefOr[ComprehendModelArn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend permission to access the flywheel data.
    */
  var DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined
  
  /**
    * Flywheel data security configuration.
    */
  var DataSecurityConfig: js.UndefOr[UpdateDataSecurityConfig] = js.undefined
  
  /**
    * The Amazon Resource Number (ARN) of the flywheel to update.
    */
  var FlywheelArn: ComprehendFlywheelArn
}
object UpdateFlywheelRequest {
  
  inline def apply(FlywheelArn: ComprehendFlywheelArn): UpdateFlywheelRequest = {
    val __obj = js.Dynamic.literal(FlywheelArn = FlywheelArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFlywheelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFlywheelRequest] (val x: Self) extends AnyVal {
    
    inline def setActiveModelArn(value: ComprehendModelArn): Self = StObject.set(x, "ActiveModelArn", value.asInstanceOf[js.Any])
    
    inline def setActiveModelArnUndefined: Self = StObject.set(x, "ActiveModelArn", js.undefined)
    
    inline def setDataAccessRoleArn(value: IamRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setDataAccessRoleArnUndefined: Self = StObject.set(x, "DataAccessRoleArn", js.undefined)
    
    inline def setDataSecurityConfig(value: UpdateDataSecurityConfig): Self = StObject.set(x, "DataSecurityConfig", value.asInstanceOf[js.Any])
    
    inline def setDataSecurityConfigUndefined: Self = StObject.set(x, "DataSecurityConfig", js.undefined)
    
    inline def setFlywheelArn(value: ComprehendFlywheelArn): Self = StObject.set(x, "FlywheelArn", value.asInstanceOf[js.Any])
  }
}
