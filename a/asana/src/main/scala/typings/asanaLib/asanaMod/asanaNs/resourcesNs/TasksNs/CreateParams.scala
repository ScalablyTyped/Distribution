package typings
package asanaLib.asanaMod.asanaNs.resourcesNs.TasksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateParams extends js.Object {
  var completed: js.UndefOr[scala.Boolean] = js.undefined
  var hearted: js.UndefOr[scala.Boolean] = js.undefined
  var name: java.lang.String
  var notes: js.UndefOr[java.lang.String] = js.undefined
}

object CreateParams {
  @scala.inline
  def apply(
    name: java.lang.String,
    completed: js.UndefOr[scala.Boolean] = js.undefined,
    hearted: js.UndefOr[scala.Boolean] = js.undefined,
    notes: java.lang.String = null
  ): CreateParams = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(completed)) __obj.updateDynamic("completed")(completed)
    if (!js.isUndefined(hearted)) __obj.updateDynamic("hearted")(hearted)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    __obj.asInstanceOf[CreateParams]
  }
}

