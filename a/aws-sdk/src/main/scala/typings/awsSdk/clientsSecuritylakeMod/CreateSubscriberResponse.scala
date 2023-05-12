package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSubscriberResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) which uniquely defines the AWS RAM resource share. Before accepting the RAM resource share invitation, you can view details related to the RAM resource share.
    */
  var resourceShareArn: js.UndefOr[ResourceShareArn] = js.undefined
  
  /**
    * The name of the resource share.
    */
  var resourceShareName: js.UndefOr[ResourceShareName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) created by you to provide to the subscriber. For more information about ARNs and how to use them in policies, see Amazon Security Lake User Guide.
    */
  var roleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * The ARN for the Amazon S3 bucket. 
    */
  var s3BucketArn: js.UndefOr[S3BucketArn] = js.undefined
  
  /**
    * The ARN for the Amazon Simple Notification Service.
    */
  var snsArn: js.UndefOr[SnsTopicArn] = js.undefined
  
  /**
    * The subscriptionId created by the CreateSubscriber API call.
    */
  var subscriptionId: UUID
}
object CreateSubscriberResponse {
  
  inline def apply(subscriptionId: UUID): CreateSubscriberResponse = {
    val __obj = js.Dynamic.literal(subscriptionId = subscriptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSubscriberResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSubscriberResponse] (val x: Self) extends AnyVal {
    
    inline def setResourceShareArn(value: ResourceShareArn): Self = StObject.set(x, "resourceShareArn", value.asInstanceOf[js.Any])
    
    inline def setResourceShareArnUndefined: Self = StObject.set(x, "resourceShareArn", js.undefined)
    
    inline def setResourceShareName(value: ResourceShareName): Self = StObject.set(x, "resourceShareName", value.asInstanceOf[js.Any])
    
    inline def setResourceShareNameUndefined: Self = StObject.set(x, "resourceShareName", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    inline def setS3BucketArn(value: S3BucketArn): Self = StObject.set(x, "s3BucketArn", value.asInstanceOf[js.Any])
    
    inline def setS3BucketArnUndefined: Self = StObject.set(x, "s3BucketArn", js.undefined)
    
    inline def setSnsArn(value: SnsTopicArn): Self = StObject.set(x, "snsArn", value.asInstanceOf[js.Any])
    
    inline def setSnsArnUndefined: Self = StObject.set(x, "snsArn", js.undefined)
    
    inline def setSubscriptionId(value: UUID): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
  }
}
