package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRdsEventSubscriptionDetails extends StObject {
  
  /**
    * The identifier of the account that is associated with the event notification subscription.
    */
  var CustSubscriptionId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the event notification subscription.
    */
  var CustomerAwsId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Whether the event notification subscription is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The list of event categories for the event notification subscription.
    */
  var EventCategoriesList: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The ARN of the event notification subscription.
    */
  var EventSubscriptionArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ARN of the SNS topic to post the event notifications to.
    */
  var SnsTopicArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A list of source identifiers for the event notification subscription.
    */
  var SourceIdsList: js.UndefOr[NonEmptyStringList] = js.undefined
  
  /**
    * The source type for the event notification subscription.
    */
  var SourceType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The status of the event notification subscription. Valid values: creating | modifying | deleting | active | no-permission | topic-not-exist 
    */
  var Status: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The datetime when the event notification subscription was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var SubscriptionCreationTime: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsRdsEventSubscriptionDetails {
  
  inline def apply(): AwsRdsEventSubscriptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsEventSubscriptionDetails]
  }
  
  extension [Self <: AwsRdsEventSubscriptionDetails](x: Self) {
    
    inline def setCustSubscriptionId(value: NonEmptyString): Self = StObject.set(x, "CustSubscriptionId", value.asInstanceOf[js.Any])
    
    inline def setCustSubscriptionIdUndefined: Self = StObject.set(x, "CustSubscriptionId", js.undefined)
    
    inline def setCustomerAwsId(value: NonEmptyString): Self = StObject.set(x, "CustomerAwsId", value.asInstanceOf[js.Any])
    
    inline def setCustomerAwsIdUndefined: Self = StObject.set(x, "CustomerAwsId", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setEventCategoriesList(value: NonEmptyStringList): Self = StObject.set(x, "EventCategoriesList", value.asInstanceOf[js.Any])
    
    inline def setEventCategoriesListUndefined: Self = StObject.set(x, "EventCategoriesList", js.undefined)
    
    inline def setEventCategoriesListVarargs(value: NonEmptyString*): Self = StObject.set(x, "EventCategoriesList", js.Array(value*))
    
    inline def setEventSubscriptionArn(value: NonEmptyString): Self = StObject.set(x, "EventSubscriptionArn", value.asInstanceOf[js.Any])
    
    inline def setEventSubscriptionArnUndefined: Self = StObject.set(x, "EventSubscriptionArn", js.undefined)
    
    inline def setSnsTopicArn(value: NonEmptyString): Self = StObject.set(x, "SnsTopicArn", value.asInstanceOf[js.Any])
    
    inline def setSnsTopicArnUndefined: Self = StObject.set(x, "SnsTopicArn", js.undefined)
    
    inline def setSourceIdsList(value: NonEmptyStringList): Self = StObject.set(x, "SourceIdsList", value.asInstanceOf[js.Any])
    
    inline def setSourceIdsListUndefined: Self = StObject.set(x, "SourceIdsList", js.undefined)
    
    inline def setSourceIdsListVarargs(value: NonEmptyString*): Self = StObject.set(x, "SourceIdsList", js.Array(value*))
    
    inline def setSourceType(value: NonEmptyString): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
    
    inline def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setSubscriptionCreationTime(value: NonEmptyString): Self = StObject.set(x, "SubscriptionCreationTime", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionCreationTimeUndefined: Self = StObject.set(x, "SubscriptionCreationTime", js.undefined)
  }
}
