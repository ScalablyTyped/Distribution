package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateHITResponse extends js.Object {
  /**
    *  Contains the newly created HIT data. For a description of the HIT data structure as it appears in responses, see the HIT Data Structure documentation. 
    */
  var HIT: js.UndefOr[typings.awsDashSdk.clientsMturkMod.HIT] = js.undefined
}

object CreateHITResponse {
  @scala.inline
  def apply(HIT: HIT = null): CreateHITResponse = {
    val __obj = js.Dynamic.literal()
    if (HIT != null) __obj.updateDynamic("HIT")(HIT)
    __obj.asInstanceOf[CreateHITResponse]
  }
}

