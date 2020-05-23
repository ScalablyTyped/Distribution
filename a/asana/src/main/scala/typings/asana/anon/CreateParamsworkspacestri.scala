package typings.asana.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined asana.asana.resources.Tasks.CreateParams & {  workspace  :string} */
trait CreateParamsworkspacestri extends js.Object {
  var completed: js.UndefOr[Boolean] = js.undefined
  var hearted: js.UndefOr[Boolean] = js.undefined
  var name: String
  var notes: js.UndefOr[String] = js.undefined
  var workspace: String
}

object CreateParamsworkspacestri {
  @scala.inline
  def apply(
    name: String,
    workspace: String,
    completed: js.UndefOr[Boolean] = js.undefined,
    hearted: js.UndefOr[Boolean] = js.undefined,
    notes: String = null
  ): CreateParamsworkspacestri = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], workspace = workspace.asInstanceOf[js.Any])
    if (!js.isUndefined(completed)) __obj.updateDynamic("completed")(completed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hearted)) __obj.updateDynamic("hearted")(hearted.get.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateParamsworkspacestri]
  }
}

