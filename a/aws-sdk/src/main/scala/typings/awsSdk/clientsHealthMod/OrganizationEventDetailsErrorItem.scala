package typings.awsSdk.clientsHealthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationEventDetailsErrorItem extends StObject {
  
  /**
    * Error information returned when a DescribeEventDetailsForOrganization operation can't find a specified event.
    */
  var awsAccountId: js.UndefOr[accountId] = js.undefined
  
  /**
    * A message that describes the error. If you call the DescribeEventDetailsForOrganization operation and receive one of the following errors, follow the recommendations in the message:   We couldn't find a public event that matches your request. To find an event that is account specific, you must enter an Amazon Web Services account ID in the request.   We couldn't find an account specific event for the specified Amazon Web Services account. To find an event that is public, you must enter a null value for the Amazon Web Services account ID in the request.   Your Amazon Web Services account doesn't include the Amazon Web Services Support plan required to use the Health API. You must have either a Business, Enterprise On-Ramp, or Enterprise Support plan.  
    */
  var errorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the error.
    */
  var errorName: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier for the event. The event ARN has the arn:aws:health:event-region::event/SERVICE/EVENT_TYPE_CODE/EVENT_TYPE_PLUS_ID  format. For example, an event ARN might look like the following:  arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456 
    */
  var eventArn: js.UndefOr[typings.awsSdk.clientsHealthMod.eventArn] = js.undefined
}
object OrganizationEventDetailsErrorItem {
  
  inline def apply(): OrganizationEventDetailsErrorItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationEventDetailsErrorItem]
  }
  
  extension [Self <: OrganizationEventDetailsErrorItem](x: Self) {
    
    inline def setAwsAccountId(value: accountId): Self = StObject.set(x, "awsAccountId", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountIdUndefined: Self = StObject.set(x, "awsAccountId", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setErrorName(value: String): Self = StObject.set(x, "errorName", value.asInstanceOf[js.Any])
    
    inline def setErrorNameUndefined: Self = StObject.set(x, "errorName", js.undefined)
    
    inline def setEventArn(value: eventArn): Self = StObject.set(x, "eventArn", value.asInstanceOf[js.Any])
    
    inline def setEventArnUndefined: Self = StObject.set(x, "eventArn", js.undefined)
  }
}
