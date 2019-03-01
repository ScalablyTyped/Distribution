package typings
package awsDashLambdaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DistributionDomainName extends js.Object {
  var distributionDomainName: java.lang.String
  var distributionId: java.lang.String
  var eventType: awsDashLambdaLib.awsDashLambdaLibStrings.`origin-request` | awsDashLambdaLib.awsDashLambdaLibStrings.`origin-response` | awsDashLambdaLib.awsDashLambdaLibStrings.`viewer-request` | awsDashLambdaLib.awsDashLambdaLibStrings.`viewer-response`
  var requestId: java.lang.String
}

object Anon_DistributionDomainName {
  @scala.inline
  def apply(
    distributionDomainName: java.lang.String,
    distributionId: java.lang.String,
    eventType: awsDashLambdaLib.awsDashLambdaLibStrings.`origin-request` | awsDashLambdaLib.awsDashLambdaLibStrings.`origin-response` | awsDashLambdaLib.awsDashLambdaLibStrings.`viewer-request` | awsDashLambdaLib.awsDashLambdaLibStrings.`viewer-response`,
    requestId: java.lang.String
  ): Anon_DistributionDomainName = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("distributionDomainName")(distributionDomainName)
    __obj.updateDynamic("distributionId")(distributionId)
    __obj.updateDynamic("eventType")(eventType.asInstanceOf[js.Any])
    __obj.updateDynamic("requestId")(requestId)
    __obj.asInstanceOf[Anon_DistributionDomainName]
  }
}

