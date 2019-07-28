package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDomainResponse extends js.Object {
  var DomainStatus: js.UndefOr[typings.awsDashSdk.clientsCloudsearchMod.DomainStatus] = js.undefined
}

object CreateDomainResponse {
  @scala.inline
  def apply(DomainStatus: DomainStatus = null): CreateDomainResponse = {
    val __obj = js.Dynamic.literal()
    if (DomainStatus != null) __obj.updateDynamic("DomainStatus")(DomainStatus)
    __obj.asInstanceOf[CreateDomainResponse]
  }
}

