package typings
package asanaLib.asanaMod.asanaNs.resourcesNs.ProjectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateParams extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var due_date: java.lang.String
  var name: js.UndefOr[java.lang.String] = js.undefined
  var notes: js.UndefOr[java.lang.String] = js.undefined
  var public: js.UndefOr[scala.Boolean] = js.undefined
  var team: js.UndefOr[scala.Double] = js.undefined
}

object CreateParams {
  @scala.inline
  def apply(
    due_date: java.lang.String,
    color: java.lang.String = null,
    name: java.lang.String = null,
    notes: java.lang.String = null,
    public: js.UndefOr[scala.Boolean] = js.undefined,
    team: scala.Int | scala.Double = null
  ): CreateParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("due_date")(due_date)
    if (color != null) __obj.updateDynamic("color")(color)
    if (name != null) __obj.updateDynamic("name")(name)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (!js.isUndefined(public)) __obj.updateDynamic("public")(public)
    if (team != null) __obj.updateDynamic("team")(team.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateParams]
  }
}

