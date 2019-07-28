package typings.awsDashLambda.awsDashLambdaMod

import typings.awsDashLambda.Anon_DistributionDomainName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFrontEvent extends js.Object {
  var config: Anon_DistributionDomainName
}

object CloudFrontEvent {
  @scala.inline
  def apply(config: Anon_DistributionDomainName): CloudFrontEvent = {
    val __obj = js.Dynamic.literal(config = config)
  
    __obj.asInstanceOf[CloudFrontEvent]
  }
}

