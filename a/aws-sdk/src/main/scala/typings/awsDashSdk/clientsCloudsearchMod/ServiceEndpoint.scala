package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceEndpoint extends js.Object {
  var Endpoint: js.UndefOr[ServiceUrl] = js.native
}

object ServiceEndpoint {
  @scala.inline
  def apply(Endpoint: ServiceUrl = null): ServiceEndpoint = {
    val __obj = js.Dynamic.literal()
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceEndpoint]
  }
}

