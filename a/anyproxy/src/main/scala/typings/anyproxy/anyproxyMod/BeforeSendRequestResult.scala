package typings.anyproxy.anyproxyMod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof anyproxy.anyproxy.RequestDetail ]:? anyproxy.anyproxy.RequestDetail[P]} */ trait BeforeSendRequestResult extends js.Object {
  var response: js.UndefOr[Partial[Response]] = js.undefined
}

object BeforeSendRequestResult {
  @scala.inline
  def apply(response: Partial[Response] = null): BeforeSendRequestResult = {
    val __obj = js.Dynamic.literal()
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeSendRequestResult]
  }
}

