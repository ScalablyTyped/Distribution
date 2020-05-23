package typings.awsLambda.cloudfrontMod

import typings.awsLambda.anon.DistributionDomainName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFrontEvent extends js.Object {
  var config: DistributionDomainName
}

object CloudFrontEvent {
  @scala.inline
  def apply(config: DistributionDomainName): CloudFrontEvent = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFrontEvent]
  }
}

