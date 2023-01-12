package typings.awsLambda.anon

import typings.awsLambda.awsLambdaStrings.`viewer-request`
import typings.awsLambda.awsLambdaStrings.`viewer-response`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionId extends StObject {
  
  /** The CloudFront domain name (for example, d111111abcdef8.cloudfront.net) of the distribution that’s associated with the event. */
  var distributionDomainName: String
  
  /** The ID of the distribution (for example, EDFDVBD6EXAMPLE) that’s associated with the event. */
  var distributionId: String
  
  /** The event type, either `viewer-request` or `viewer-response`. */
  var eventType: `viewer-request` | `viewer-response`
  
  /** A string that uniquely identifies a CloudFront request (and its associated response). */
  var requestId: String
}
object DistributionId {
  
  inline def apply(
    distributionDomainName: String,
    distributionId: String,
    eventType: `viewer-request` | `viewer-response`,
    requestId: String
  ): DistributionId = {
    val __obj = js.Dynamic.literal(distributionDomainName = distributionDomainName.asInstanceOf[js.Any], distributionId = distributionId.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DistributionId] (val x: Self) extends AnyVal {
    
    inline def setDistributionDomainName(value: String): Self = StObject.set(x, "distributionDomainName", value.asInstanceOf[js.Any])
    
    inline def setDistributionId(value: String): Self = StObject.set(x, "distributionId", value.asInstanceOf[js.Any])
    
    inline def setEventType(value: `viewer-request` | `viewer-response`): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
