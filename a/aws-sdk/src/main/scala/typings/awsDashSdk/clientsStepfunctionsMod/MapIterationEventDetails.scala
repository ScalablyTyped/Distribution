package typings.awsDashSdk.clientsStepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapIterationEventDetails extends js.Object {
  /**
    * The index of the array belonging to the Map state iteration.
    */
  var Index: js.UndefOr[UnsignedInteger] = js.undefined
  /**
    * The name of the iteration’s parent Map state.
    */
  var Name: js.UndefOr[typings.awsDashSdk.clientsStepfunctionsMod.Name] = js.undefined
}

object MapIterationEventDetails {
  @scala.inline
  def apply(Index: js.UndefOr[UnsignedInteger] = js.undefined, Name: Name = null): MapIterationEventDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Index)) __obj.updateDynamic("Index")(Index)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[MapIterationEventDetails]
  }
}

