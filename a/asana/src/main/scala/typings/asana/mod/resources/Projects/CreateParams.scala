package typings.asana.mod.resources.Projects

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateParams extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var due_date: String
  var name: js.UndefOr[String] = js.undefined
  var notes: js.UndefOr[String] = js.undefined
  var public: js.UndefOr[Boolean] = js.undefined
  var team: js.UndefOr[Double] = js.undefined
}

object CreateParams {
  @scala.inline
  def apply(
    due_date: String,
    color: String = null,
    name: String = null,
    notes: String = null,
    public: js.UndefOr[Boolean] = js.undefined,
    team: Int | Double = null
  ): CreateParams = {
    val __obj = js.Dynamic.literal(due_date = due_date.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (!js.isUndefined(public)) __obj.updateDynamic("public")(public.asInstanceOf[js.Any])
    if (team != null) __obj.updateDynamic("team")(team.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateParams]
  }
}

