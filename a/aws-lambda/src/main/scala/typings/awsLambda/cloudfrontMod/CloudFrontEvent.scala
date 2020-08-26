package typings.awsLambda.cloudfrontMod

import typings.awsLambda.anon.DistributionDomainName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudFrontEvent extends js.Object {
  var config: DistributionDomainName = js.native
}

object CloudFrontEvent {
  @scala.inline
  def apply(config: DistributionDomainName): CloudFrontEvent = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFrontEvent]
  }
  @scala.inline
  implicit class CloudFrontEventOps[Self <: CloudFrontEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfig(value: DistributionDomainName): Self = this.set("config", value.asInstanceOf[js.Any])
  }
  
}

