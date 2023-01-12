package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResourcePolicyRequest extends StObject {
  
  /**
    * The hash value returned when this policy was set.
    */
  var PolicyHashCondition: js.UndefOr[HashString] = js.undefined
  
  /**
    * The ARN of the Glue resource for the resource policy to be deleted.
    */
  var ResourceArn: js.UndefOr[GlueResourceArn] = js.undefined
}
object DeleteResourcePolicyRequest {
  
  inline def apply(): DeleteResourcePolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteResourcePolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResourcePolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setPolicyHashCondition(value: HashString): Self = StObject.set(x, "PolicyHashCondition", value.asInstanceOf[js.Any])
    
    inline def setPolicyHashConditionUndefined: Self = StObject.set(x, "PolicyHashCondition", js.undefined)
    
    inline def setResourceArn(value: GlueResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
  }
}
