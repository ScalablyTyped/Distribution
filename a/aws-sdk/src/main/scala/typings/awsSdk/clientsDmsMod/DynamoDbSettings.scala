package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamoDbSettings extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) used by the service to access the IAM role. The role must allow the iam:PassRole action.
    */
  var ServiceAccessRoleArn: String
}
object DynamoDbSettings {
  
  inline def apply(ServiceAccessRoleArn: String): DynamoDbSettings = {
    val __obj = js.Dynamic.literal(ServiceAccessRoleArn = ServiceAccessRoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamoDbSettings]
  }
  
  extension [Self <: DynamoDbSettings](x: Self) {
    
    inline def setServiceAccessRoleArn(value: String): Self = StObject.set(x, "ServiceAccessRoleArn", value.asInstanceOf[js.Any])
  }
}
