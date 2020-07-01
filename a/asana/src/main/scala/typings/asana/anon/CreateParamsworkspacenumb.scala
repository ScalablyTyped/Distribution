package typings.asana.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined asana.asana.resources.Projects.CreateParams & {  workspace  :number} */
trait CreateParamsworkspacenumb extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var due_date: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var notes: js.UndefOr[String] = js.undefined
  var public: js.UndefOr[Boolean] = js.undefined
  var team: js.UndefOr[Double] = js.undefined
  var workspace: Double
}

object CreateParamsworkspacenumb {
  @scala.inline
  def apply(
    workspace: Double,
    color: String = null,
    due_date: String = null,
    name: String = null,
    notes: String = null,
    public: js.UndefOr[Boolean] = js.undefined,
    team: js.UndefOr[Double] = js.undefined
  ): CreateParamsworkspacenumb = {
    val __obj = js.Dynamic.literal(workspace = workspace.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (due_date != null) __obj.updateDynamic("due_date")(due_date.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (!js.isUndefined(public)) __obj.updateDynamic("public")(public.get.asInstanceOf[js.Any])
    if (!js.isUndefined(team)) __obj.updateDynamic("team")(team.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateParamsworkspacenumb]
  }
}

