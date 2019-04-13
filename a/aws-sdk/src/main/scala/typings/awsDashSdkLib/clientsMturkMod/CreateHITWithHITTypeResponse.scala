package typings
package awsDashSdkLib.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateHITWithHITTypeResponse extends js.Object {
  /**
    *  Contains the newly created HIT data. For a description of the HIT data structure as it appears in responses, see the HIT Data Structure documentation. 
    */
  var HIT: js.UndefOr[HIT] = js.undefined
}

object CreateHITWithHITTypeResponse {
  @scala.inline
  def apply(HIT: HIT = null): CreateHITWithHITTypeResponse = {
    val __obj = js.Dynamic.literal()
    if (HIT != null) __obj.updateDynamic("HIT")(HIT)
    __obj.asInstanceOf[CreateHITWithHITTypeResponse]
  }
}

