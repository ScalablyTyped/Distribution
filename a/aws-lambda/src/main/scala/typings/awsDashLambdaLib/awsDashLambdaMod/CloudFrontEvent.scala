package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFrontEvent extends js.Object {
  var config: awsDashLambdaLib.Anon_DistributionDomainName
}

object CloudFrontEvent {
  @scala.inline
  def apply(config: awsDashLambdaLib.Anon_DistributionDomainName): CloudFrontEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("config")(config)
    __obj.asInstanceOf[CloudFrontEvent]
  }
}

