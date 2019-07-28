package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceEndpoint extends js.Object {
  var Endpoint: js.UndefOr[ServiceUrl] = js.undefined
}

object ServiceEndpoint {
  @scala.inline
  def apply(Endpoint: ServiceUrl = null): ServiceEndpoint = {
    val __obj = js.Dynamic.literal()
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint)
    __obj.asInstanceOf[ServiceEndpoint]
  }
}

