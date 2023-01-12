package typings.awsLambda.anon

import typings.awsLambda.awsLambdaStrings.`origin-request`
import typings.awsLambda.awsLambdaStrings.`origin-response`
import typings.awsLambda.awsLambdaStrings.`viewer-request`
import typings.awsLambda.awsLambdaStrings.`viewer-response`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionDomainName extends StObject {
  
  val distributionDomainName: String
  
  val distributionId: String
  
  val eventType: `origin-request` | `origin-response` | `viewer-request` | `viewer-response`
  
  val requestId: String
}
object DistributionDomainName {
  
  inline def apply(
    distributionDomainName: String,
    distributionId: String,
    eventType: `origin-request` | `origin-response` | `viewer-request` | `viewer-response`,
    requestId: String
  ): DistributionDomainName = {
    val __obj = js.Dynamic.literal(distributionDomainName = distributionDomainName.asInstanceOf[js.Any], distributionId = distributionId.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionDomainName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DistributionDomainName] (val x: Self) extends AnyVal {
    
    inline def setDistributionDomainName(value: String): Self = StObject.set(x, "distributionDomainName", value.asInstanceOf[js.Any])
    
    inline def setDistributionId(value: String): Self = StObject.set(x, "distributionId", value.asInstanceOf[js.Any])
    
    inline def setEventType(value: `origin-request` | `origin-response` | `viewer-request` | `viewer-response`): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
