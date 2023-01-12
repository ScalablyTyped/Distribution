package typings.awsSdk.clientsHealthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AffectedEntity extends StObject {
  
  /**
    * The 12-digit Amazon Web Services account number that contains the affected entity.
    */
  var awsAccountId: js.UndefOr[accountId] = js.undefined
  
  /**
    * The unique identifier for the entity. Format: arn:aws:health:entity-region:aws-account:entity/entity-id . Example: arn:aws:health:us-east-1:111222333444:entity/AVh5GGT7ul1arKr1sE1K 
    */
  var entityArn: js.UndefOr[typings.awsSdk.clientsHealthMod.entityArn] = js.undefined
  
  /**
    * The URL of the affected entity.
    */
  var entityUrl: js.UndefOr[typings.awsSdk.clientsHealthMod.entityUrl] = js.undefined
  
  /**
    * The ID of the affected entity.
    */
  var entityValue: js.UndefOr[typings.awsSdk.clientsHealthMod.entityValue] = js.undefined
  
  /**
    * The unique identifier for the event. The event ARN has the arn:aws:health:event-region::event/SERVICE/EVENT_TYPE_CODE/EVENT_TYPE_PLUS_ID  format. For example, an event ARN might look like the following:  arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456 
    */
  var eventArn: js.UndefOr[typings.awsSdk.clientsHealthMod.eventArn] = js.undefined
  
  /**
    * The most recent time that the entity was updated.
    */
  var lastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The most recent status of the entity affected by the event. The possible values are IMPAIRED, UNIMPAIRED, and UNKNOWN.
    */
  var statusCode: js.UndefOr[entityStatusCode] = js.undefined
  
  /**
    * A map of entity tags attached to the affected entity.  Currently, the tags property isn't supported. 
    */
  var tags: js.UndefOr[tagSet] = js.undefined
}
object AffectedEntity {
  
  inline def apply(): AffectedEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AffectedEntity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AffectedEntity] (val x: Self) extends AnyVal {
    
    inline def setAwsAccountId(value: accountId): Self = StObject.set(x, "awsAccountId", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountIdUndefined: Self = StObject.set(x, "awsAccountId", js.undefined)
    
    inline def setEntityArn(value: entityArn): Self = StObject.set(x, "entityArn", value.asInstanceOf[js.Any])
    
    inline def setEntityArnUndefined: Self = StObject.set(x, "entityArn", js.undefined)
    
    inline def setEntityUrl(value: entityUrl): Self = StObject.set(x, "entityUrl", value.asInstanceOf[js.Any])
    
    inline def setEntityUrlUndefined: Self = StObject.set(x, "entityUrl", js.undefined)
    
    inline def setEntityValue(value: entityValue): Self = StObject.set(x, "entityValue", value.asInstanceOf[js.Any])
    
    inline def setEntityValueUndefined: Self = StObject.set(x, "entityValue", js.undefined)
    
    inline def setEventArn(value: eventArn): Self = StObject.set(x, "eventArn", value.asInstanceOf[js.Any])
    
    inline def setEventArnUndefined: Self = StObject.set(x, "eventArn", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
    
    inline def setStatusCode(value: entityStatusCode): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    inline def setTags(value: tagSet): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
