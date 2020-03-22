package typings.awsLambda.cloudfrontMod

import typings.awsLambda.AnonDistributionDomainName
import typings.awsLambda.AnonEventType
import typings.awsLambda.AnonRequestId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFrontEvent extends js.Object {
  var config: AnonDistributionDomainName with (AnonEventType | AnonRequestId)
}

object CloudFrontEvent {
  @scala.inline
  def apply(config: AnonDistributionDomainName with (AnonEventType | AnonRequestId)): CloudFrontEvent = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CloudFrontEvent]
  }
}

