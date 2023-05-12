package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResourcePolicyResponse extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the CloudTrail channel attached to the resource-based policy. 
    */
  var ResourceArn: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.ResourceArn] = js.undefined
  
  /**
    *  The JSON-formatted string of the Amazon Web Services resource-based policy attached to the CloudTrail channel. 
    */
  var ResourcePolicy: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.ResourcePolicy] = js.undefined
}
object PutResourcePolicyResponse {
  
  inline def apply(): PutResourcePolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutResourcePolicyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutResourcePolicyResponse] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    inline def setResourcePolicy(value: ResourcePolicy): Self = StObject.set(x, "ResourcePolicy", value.asInstanceOf[js.Any])
    
    inline def setResourcePolicyUndefined: Self = StObject.set(x, "ResourcePolicy", js.undefined)
  }
}
