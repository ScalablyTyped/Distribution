package typings.asana.asanaMod.resources.Tasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateParams extends js.Object {
  var completed: js.UndefOr[Boolean] = js.undefined
  var hearted: js.UndefOr[Boolean] = js.undefined
  var name: String
  var notes: js.UndefOr[String] = js.undefined
}

object CreateParams {
  @scala.inline
  def apply(
    name: String,
    completed: js.UndefOr[Boolean] = js.undefined,
    hearted: js.UndefOr[Boolean] = js.undefined,
    notes: String = null
  ): CreateParams = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(completed)) __obj.updateDynamic("completed")(completed)
    if (!js.isUndefined(hearted)) __obj.updateDynamic("hearted")(hearted)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    __obj.asInstanceOf[CreateParams]
  }
}

