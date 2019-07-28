package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetHITResponse extends js.Object {
  /**
    *  Contains the requested HIT data.
    */
  var HIT: js.UndefOr[typings.awsDashSdk.clientsMturkMod.HIT] = js.undefined
}

object GetHITResponse {
  @scala.inline
  def apply(HIT: HIT = null): GetHITResponse = {
    val __obj = js.Dynamic.literal()
    if (HIT != null) __obj.updateDynamic("HIT")(HIT)
    __obj.asInstanceOf[GetHITResponse]
  }
}

