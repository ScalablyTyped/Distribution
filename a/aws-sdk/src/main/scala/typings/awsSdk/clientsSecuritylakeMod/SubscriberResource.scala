package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriberResource extends StObject {
  
  /**
    * You can choose to notify subscribers of new objects with an Amazon Simple Queue Service (Amazon SQS) queue or through messaging to an HTTPS endpoint provided by the subscriber.   Subscribers can consume data by directly querying Lake Formation tables in your Amazon S3 bucket through services like Amazon Athena. This subscription type is defined as LAKEFORMATION. 
    */
  var accessTypes: js.UndefOr[AccessTypeList] = js.undefined
  
  /**
    * The Amazon Web Services account ID you are using to create your Amazon Security Lake account.
    */
  var accountId: AwsAccountId
  
  /**
    * The date and time when the subscription was created. 
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The external ID of the subscriber. The external ID lets the user that is assuming the role assert the circumstances in which they are operating. It also provides a way for the account owner to permit the role to be assumed only under specific circumstances.
    */
  var externalId: js.UndefOr[SafeString] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) which uniquely defines the AWS RAM resource share. Before accepting the RAM resource share invitation, you can view details related to the RAM resource share. This field is available only for Lake Formation subscribers created after March 8, 2023.
    */
  var resourceShareArn: js.UndefOr[ResourceShareArn] = js.undefined
  
  /**
    * The name of the resource share.
    */
  var resourceShareName: js.UndefOr[ResourceShareName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) specifying the role of the subscriber.
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
    * Amazon Security Lake supports log and event collection for natively supported Amazon Web Services. For more information, see the Amazon Security Lake User Guide.
    */
  var sourceTypes: SourceTypeList
  
  /**
    * The subscriber descriptions for a subscriber account. The description for a subscriber includes subscriberName, accountID, externalID, and subscriptionId.
    */
  var subscriberDescription: js.UndefOr[SafeString] = js.undefined
  
  /**
    * The name of your Amazon Security Lake subscriber account.
    */
  var subscriberName: js.UndefOr[SafeString] = js.undefined
  
  /**
    * The subscription endpoint to which exception messages are posted. 
    */
  var subscriptionEndpoint: js.UndefOr[String] = js.undefined
  
  /**
    * The subscription ID of the Amazon Security Lake subscriber account.
    */
  var subscriptionId: UUID
  
  /**
    * The subscription protocol to which exception messages are posted. 
    */
  var subscriptionProtocol: js.UndefOr[EndpointProtocol] = js.undefined
  
  /**
    * The subscription status of the Amazon Security Lake subscriber account.
    */
  var subscriptionStatus: js.UndefOr[SubscriptionStatus] = js.undefined
  
  /**
    * The date and time when the subscription was created. 
    */
  var updatedAt: js.UndefOr[js.Date] = js.undefined
}
object SubscriberResource {
  
  inline def apply(accountId: AwsAccountId, sourceTypes: SourceTypeList, subscriptionId: UUID): SubscriberResource = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], sourceTypes = sourceTypes.asInstanceOf[js.Any], subscriptionId = subscriptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriberResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubscriberResource] (val x: Self) extends AnyVal {
    
    inline def setAccessTypes(value: AccessTypeList): Self = StObject.set(x, "accessTypes", value.asInstanceOf[js.Any])
    
    inline def setAccessTypesUndefined: Self = StObject.set(x, "accessTypes", js.undefined)
    
    inline def setAccessTypesVarargs(value: AccessType*): Self = StObject.set(x, "accessTypes", js.Array(value*))
    
    inline def setAccountId(value: AwsAccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setExternalId(value: SafeString): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
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
    
    inline def setSourceTypes(value: SourceTypeList): Self = StObject.set(x, "sourceTypes", value.asInstanceOf[js.Any])
    
    inline def setSourceTypesVarargs(value: SourceType*): Self = StObject.set(x, "sourceTypes", js.Array(value*))
    
    inline def setSubscriberDescription(value: SafeString): Self = StObject.set(x, "subscriberDescription", value.asInstanceOf[js.Any])
    
    inline def setSubscriberDescriptionUndefined: Self = StObject.set(x, "subscriberDescription", js.undefined)
    
    inline def setSubscriberName(value: SafeString): Self = StObject.set(x, "subscriberName", value.asInstanceOf[js.Any])
    
    inline def setSubscriberNameUndefined: Self = StObject.set(x, "subscriberName", js.undefined)
    
    inline def setSubscriptionEndpoint(value: String): Self = StObject.set(x, "subscriptionEndpoint", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionEndpointUndefined: Self = StObject.set(x, "subscriptionEndpoint", js.undefined)
    
    inline def setSubscriptionId(value: UUID): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionProtocol(value: EndpointProtocol): Self = StObject.set(x, "subscriptionProtocol", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionProtocolUndefined: Self = StObject.set(x, "subscriptionProtocol", js.undefined)
    
    inline def setSubscriptionStatus(value: SubscriptionStatus): Self = StObject.set(x, "subscriptionStatus", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionStatusUndefined: Self = StObject.set(x, "subscriptionStatus", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
  }
}
