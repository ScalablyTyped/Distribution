package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourcePolicyResponse extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the CloudTrail channel attached to resource-based policy. 
    */
  var ResourceArn: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.ResourceArn] = js.undefined
  
  /**
    *  A JSON-formatted string that contains the resource-based policy attached to the CloudTrail channel. 
    */
  var ResourcePolicy: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.ResourcePolicy] = js.undefined
}
object GetResourcePolicyResponse {
  
  inline def apply(): GetResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourcePolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResourcePolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setResourcePolicy(value: ResourcePolicy): Self = StObject.set(x, "ResourcePolicy", value.asInstanceOf[js.Any])
    
    inline def setResourcePolicyUndefined: Self = StObject.set(x, "ResourcePolicy", js.undefined)
  }
}
