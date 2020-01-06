package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHITResponse extends js.Object {
  /**
    *  Contains the requested HIT data.
    */
  var HIT: js.UndefOr[typings.awsDashSdk.clientsMturkMod.HIT] = js.native
}

object GetHITResponse {
  @scala.inline
  def apply(HIT: HIT = null): GetHITResponse = {
    val __obj = js.Dynamic.literal()
    if (HIT != null) __obj.updateDynamic("HIT")(HIT.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHITResponse]
  }
}

