package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAccessPointRequest extends StObject {
  
  /**
    * The account ID for the account that owns the specified access point.
    */
  var AccountId: typings.awsSdk.clientsS3controlMod.AccountId
  
  /**
    * The name of the access point you want to delete. For using this parameter with Amazon S3 on Outposts with the REST API, you must specify the name and the x-amz-outpost-id as well. For using this parameter with S3 on Outposts with the Amazon Web Services SDK and CLI, you must specify the ARN of the access point accessed in the format arn:aws:s3-outposts:&lt;Region&gt;:&lt;account-id&gt;:outpost/&lt;outpost-id&gt;/accesspoint/&lt;my-accesspoint-name&gt;. For example, to access the access point reports-ap through outpost my-outpost owned by account 123456789012 in Region us-west-2, use the URL encoding of arn:aws:s3-outposts:us-west-2:123456789012:outpost/my-outpost/accesspoint/reports-ap. The value must be URL encoded. 
    */
  var Name: AccessPointName
}
object DeleteAccessPointRequest {
  
  inline def apply(AccountId: AccountId, Name: AccessPointName): DeleteAccessPointRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAccessPointRequest]
  }
  
  extension [Self <: DeleteAccessPointRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setName(value: AccessPointName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
