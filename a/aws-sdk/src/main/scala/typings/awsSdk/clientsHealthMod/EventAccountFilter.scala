package typings.awsSdk.clientsHealthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventAccountFilter extends StObject {
  
  /**
    * The 12-digit Amazon Web Services account numbers that contains the affected entities.
    */
  var awsAccountId: js.UndefOr[accountId] = js.undefined
  
  /**
    * The unique identifier for the event. The event ARN has the arn:aws:health:event-region::event/SERVICE/EVENT_TYPE_CODE/EVENT_TYPE_PLUS_ID  format. For example, an event ARN might look like the following:  arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456 
    */
  var eventArn: typings.awsSdk.clientsHealthMod.eventArn
}
object EventAccountFilter {
  
  inline def apply(eventArn: eventArn): EventAccountFilter = {
    val __obj = js.Dynamic.literal(eventArn = eventArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventAccountFilter]
  }
  
  extension [Self <: EventAccountFilter](x: Self) {
    
    inline def setAwsAccountId(value: accountId): Self = StObject.set(x, "awsAccountId", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountIdUndefined: Self = StObject.set(x, "awsAccountId", js.undefined)
    
    inline def setEventArn(value: eventArn): Self = StObject.set(x, "eventArn", value.asInstanceOf[js.Any])
  }
}
