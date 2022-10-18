package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IamResources extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the IAM resource that allows Amazon Web Services IoT FleetWise to send data to Amazon Timestream. For example, arn:aws:iam::123456789012:role/SERVICE-ROLE-ARN. 
    */
  var roleArn: IAMRoleArn
}
object IamResources {
  
  inline def apply(roleArn: IAMRoleArn): IamResources = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[IamResources]
  }
  
  extension [Self <: IamResources](x: Self) {
    
    inline def setRoleArn(value: IAMRoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
