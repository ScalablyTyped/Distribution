package typings.awsDashSdk.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapStateStartedEventDetails extends js.Object {
  /**
    * The size of the array for Map state iterations.
    */
  var length: js.UndefOr[UnsignedInteger] = js.undefined
}

object MapStateStartedEventDetails {
  @scala.inline
  def apply(length: Int | Double = null): MapStateStartedEventDetails = {
    val __obj = js.Dynamic.literal()
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapStateStartedEventDetails]
  }
}

