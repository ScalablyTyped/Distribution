package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionToggle extends ActionBase

object ActionToggle {
  @scala.inline
  def apply(
    active: Boolean,
    className: String,
    disabled: Boolean,
    id: String,
    title: String,
    `type`: String,
    visible: Boolean
  ): ActionToggle = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionToggle]
  }
}

