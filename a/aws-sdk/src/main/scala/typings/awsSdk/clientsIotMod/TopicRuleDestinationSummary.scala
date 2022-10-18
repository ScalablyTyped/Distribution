package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicRuleDestinationSummary extends StObject {
  
  /**
    * The topic rule destination ARN.
    */
  var arn: js.UndefOr[AwsArn] = js.undefined
  
  /**
    * The date and time when the topic rule destination was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Information about the HTTP URL.
    */
  var httpUrlSummary: js.UndefOr[HttpUrlDestinationSummary] = js.undefined
  
  /**
    * The date and time when the topic rule destination was last updated.
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the topic rule destination. Valid values are:  IN_PROGRESS  A topic rule destination was created but has not been confirmed. You can set status to IN_PROGRESS by calling UpdateTopicRuleDestination. Calling UpdateTopicRuleDestination causes a new confirmation challenge to be sent to your confirmation endpoint.  ENABLED  Confirmation was completed, and traffic to this destination is allowed. You can set status to DISABLED by calling UpdateTopicRuleDestination.  DISABLED  Confirmation was completed, and traffic to this destination is not allowed. You can set status to ENABLED by calling UpdateTopicRuleDestination.  ERROR  Confirmation could not be completed, for example if the confirmation timed out. You can call GetTopicRuleDestination for details about the error. You can set status to IN_PROGRESS by calling UpdateTopicRuleDestination. Calling UpdateTopicRuleDestination causes a new confirmation challenge to be sent to your confirmation endpoint.  
    */
  var status: js.UndefOr[TopicRuleDestinationStatus] = js.undefined
  
  /**
    * The reason the topic rule destination is in the current status.
    */
  var statusReason: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the virtual private cloud (VPC) connection.
    */
  var vpcDestinationSummary: js.UndefOr[VpcDestinationSummary] = js.undefined
}
object TopicRuleDestinationSummary {
  
  inline def apply(): TopicRuleDestinationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicRuleDestinationSummary]
  }
  
  extension [Self <: TopicRuleDestinationSummary](x: Self) {
    
    inline def setArn(value: AwsArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setHttpUrlSummary(value: HttpUrlDestinationSummary): Self = StObject.set(x, "httpUrlSummary", value.asInstanceOf[js.Any])
    
    inline def setHttpUrlSummaryUndefined: Self = StObject.set(x, "httpUrlSummary", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    inline def setStatus(value: TopicRuleDestinationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: String): Self = StObject.set(x, "statusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "statusReason", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setVpcDestinationSummary(value: VpcDestinationSummary): Self = StObject.set(x, "vpcDestinationSummary", value.asInstanceOf[js.Any])
    
    inline def setVpcDestinationSummaryUndefined: Self = StObject.set(x, "vpcDestinationSummary", js.undefined)
  }
}
