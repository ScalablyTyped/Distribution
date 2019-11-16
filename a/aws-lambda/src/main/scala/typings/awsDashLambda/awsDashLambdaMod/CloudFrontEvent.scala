package typings.awsDashLambda.awsDashLambdaMod

import typings.awsDashLambda.Anon_DistributionDomainName
import typings.awsDashLambda.Anon_EventType
import typings.awsDashLambda.Anon_EventTypeRequestId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFrontEvent extends js.Object {
  var config: Anon_DistributionDomainName with (Anon_EventType | Anon_EventTypeRequestId)
}

object CloudFrontEvent {
  @scala.inline
  def apply(config: Anon_DistributionDomainName with (Anon_EventType | Anon_EventTypeRequestId)): CloudFrontEvent = {
    val __obj = js.Dynamic.literal(config = config)
  
    __obj.asInstanceOf[CloudFrontEvent]
  }
}

