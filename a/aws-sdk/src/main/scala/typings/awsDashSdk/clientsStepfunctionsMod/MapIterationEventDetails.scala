package typings.awsDashSdk.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapIterationEventDetails extends js.Object {
  /**
    * The index of the array belonging to the Map state iteration.
    */
  var index: js.UndefOr[UnsignedInteger] = js.native
  /**
    * The name of the iteration’s parent Map state.
    */
  var name: js.UndefOr[Name] = js.native
}

object MapIterationEventDetails {
  @scala.inline
  def apply(index: Int | Double = null, name: Name = null): MapIterationEventDetails = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapIterationEventDetails]
  }
}

