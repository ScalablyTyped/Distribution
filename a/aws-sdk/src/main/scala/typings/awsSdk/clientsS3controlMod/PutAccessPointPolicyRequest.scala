package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutAccessPointPolicyRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID for owner of the bucket associated with the specified access point.
    */
  var AccountId: typings.awsSdk.clientsS3controlMod.AccountId
  
  /**
    * The name of the access point that you want to associate with the specified policy. For using this parameter with Amazon S3 on Outposts with the REST API, you must specify the name and the x-amz-outpost-id as well. For using this parameter with S3 on Outposts with the Amazon Web Services SDK and CLI, you must specify the ARN of the access point accessed in the format arn:aws:s3-outposts:&lt;Region&gt;:&lt;account-id&gt;:outpost/&lt;outpost-id&gt;/accesspoint/&lt;my-accesspoint-name&gt;. For example, to access the access point reports-ap through outpost my-outpost owned by account 123456789012 in Region us-west-2, use the URL encoding of arn:aws:s3-outposts:us-west-2:123456789012:outpost/my-outpost/accesspoint/reports-ap. The value must be URL encoded. 
    */
  var Name: AccessPointName
  
  /**
    * The policy that you want to apply to the specified access point. For more information about access point policies, see Managing data access with Amazon S3 access points in the Amazon S3 User Guide.
    */
  var Policy: typings.awsSdk.clientsS3controlMod.Policy
}
object PutAccessPointPolicyRequest {
  
  inline def apply(AccountId: AccountId, Name: AccessPointName, Policy: Policy): PutAccessPointPolicyRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAccessPointPolicyRequest]
  }
  
  extension [Self <: PutAccessPointPolicyRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setName(value: AccessPointName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPolicy(value: Policy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
  }
}
