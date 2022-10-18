package typings.awsSdk.clientsInspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCrossAccountAccessRoleResponse extends StObject {
  
  /**
    * The date when the cross-account access role was registered.
    */
  var registeredAt: js.Date
  
  /**
    * The ARN that specifies the IAM role that Amazon Inspector uses to access your AWS account.
    */
  var roleArn: Arn
  
  /**
    * A Boolean value that specifies whether the IAM role has the necessary policies attached to enable Amazon Inspector to access your AWS account.
    */
  var valid: Bool
}
object DescribeCrossAccountAccessRoleResponse {
  
  inline def apply(registeredAt: js.Date, roleArn: Arn, valid: Bool): DescribeCrossAccountAccessRoleResponse = {
    val __obj = js.Dynamic.literal(registeredAt = registeredAt.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCrossAccountAccessRoleResponse]
  }
  
  extension [Self <: DescribeCrossAccountAccessRoleResponse](x: Self) {
    
    inline def setRegisteredAt(value: js.Date): Self = StObject.set(x, "registeredAt", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: Arn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setValid(value: Bool): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
  }
}
