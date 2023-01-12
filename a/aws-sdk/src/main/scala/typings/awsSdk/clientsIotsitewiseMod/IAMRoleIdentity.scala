package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAMRoleIdentity extends StObject {
  
  /**
    * The ARN of the IAM role. For more information, see IAM ARNs in the IAM User Guide.
    */
  var arn: ARN
}
object IAMRoleIdentity {
  
  inline def apply(arn: ARN): IAMRoleIdentity = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAMRoleIdentity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAMRoleIdentity] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
