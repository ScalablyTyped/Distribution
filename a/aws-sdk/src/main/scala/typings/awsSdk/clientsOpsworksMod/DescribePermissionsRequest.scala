package typings.awsSdk.clientsOpsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePermissionsRequest extends StObject {
  
  /**
    * The user's IAM ARN. This can also be a federated user's ARN. For more information about IAM ARNs, see Using Identifiers.
    */
  var IamUserArn: js.UndefOr[String] = js.undefined
  
  /**
    * The stack ID.
    */
  var StackId: js.UndefOr[String] = js.undefined
}
object DescribePermissionsRequest {
  
  inline def apply(): DescribePermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePermissionsRequest]
  }
  
  extension [Self <: DescribePermissionsRequest](x: Self) {
    
    inline def setIamUserArn(value: String): Self = StObject.set(x, "IamUserArn", value.asInstanceOf[js.Any])
    
    inline def setIamUserArnUndefined: Self = StObject.set(x, "IamUserArn", js.undefined)
    
    inline def setStackId(value: String): Self = StObject.set(x, "StackId", value.asInstanceOf[js.Any])
    
    inline def setStackIdUndefined: Self = StObject.set(x, "StackId", js.undefined)
  }
}
