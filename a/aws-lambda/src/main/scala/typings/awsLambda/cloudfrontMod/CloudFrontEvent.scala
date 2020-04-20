package typings.awsLambda.cloudfrontMod

import typings.awsLambda.AnonDistributionDomainName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFrontEvent extends js.Object {
  var config: AnonDistributionDomainName
}

object CloudFrontEvent {
  @scala.inline
  def apply(config: AnonDistributionDomainName): CloudFrontEvent = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFrontEvent]
  }
}

