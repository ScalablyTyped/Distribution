package typings.awsLambda.anon

import typings.awsLambda.awsLambdaStrings.`origin-request`
import typings.awsLambda.awsLambdaStrings.`origin-response`
import typings.awsLambda.awsLambdaStrings.`viewer-request`
import typings.awsLambda.awsLambdaStrings.`viewer-response`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistributionDomainName extends js.Object {
  val distributionDomainName: String
  val distributionId: String
  val eventType: `origin-request` | `origin-response` | `viewer-request` | `viewer-response`
  val requestId: String
}

object DistributionDomainName {
  @scala.inline
  def apply(
    distributionDomainName: String,
    distributionId: String,
    eventType: `origin-request` | `origin-response` | `viewer-request` | `viewer-response`,
    requestId: String
  ): DistributionDomainName = {
    val __obj = js.Dynamic.literal(distributionDomainName = distributionDomainName.asInstanceOf[js.Any], distributionId = distributionId.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionDomainName]
  }
}

