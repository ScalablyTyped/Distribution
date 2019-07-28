package typings.awsDashLambda

import typings.awsDashLambda.awsDashLambdaStrings.`origin-request`
import typings.awsDashLambda.awsDashLambdaStrings.`origin-response`
import typings.awsDashLambda.awsDashLambdaStrings.`viewer-request`
import typings.awsDashLambda.awsDashLambdaStrings.`viewer-response`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DistributionDomainName extends js.Object {
  var distributionDomainName: String
  var distributionId: String
  var eventType: `origin-request` | `origin-response` | `viewer-request` | `viewer-response`
  var requestId: String
}

object Anon_DistributionDomainName {
  @scala.inline
  def apply(
    distributionDomainName: String,
    distributionId: String,
    eventType: `origin-request` | `origin-response` | `viewer-request` | `viewer-response`,
    requestId: String
  ): Anon_DistributionDomainName = {
    val __obj = js.Dynamic.literal(distributionDomainName = distributionDomainName, distributionId = distributionId, eventType = eventType.asInstanceOf[js.Any], requestId = requestId)
  
    __obj.asInstanceOf[Anon_DistributionDomainName]
  }
}

