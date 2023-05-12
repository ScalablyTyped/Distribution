package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResourcePolicyRequest extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the CloudTrail channel attached to the resource-based policy. The following is the format of a resource ARN: arn:aws:cloudtrail:us-east-2:123456789012:channel/MyChannel. 
    */
  var ResourceArn: typings.awsSdk.clientsCloudtrailMod.ResourceArn
  
  /**
    *  A JSON-formatted string for an Amazon Web Services resource-based policy.  The following are requirements for the resource policy:    Contains only one action: cloudtrail-data:PutAuditEvents     Contains at least one statement. The policy can have a maximum of 20 statements.     Each statement contains at least one principal. A statement can have a maximum of 50 principals.   
    */
  var ResourcePolicy: typings.awsSdk.clientsCloudtrailMod.ResourcePolicy
}
object PutResourcePolicyRequest {
  
  inline def apply(ResourceArn: ResourceArn, ResourcePolicy: ResourcePolicy): PutResourcePolicyRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], ResourcePolicy = ResourcePolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResourcePolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutResourcePolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: ResourceArn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setResourcePolicy(value: ResourcePolicy): Self = StObject.set(x, "ResourcePolicy", value.asInstanceOf[js.Any])
  }
}
