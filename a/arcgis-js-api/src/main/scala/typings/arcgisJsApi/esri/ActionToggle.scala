package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionToggle extends ActionBase {
  /**
    * The title of the action.  The first action is displayed in the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) with an icon. The [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) has a menu that will display all actions with their titles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionToggle.html#title)
    */
  var title: String = js.native
  /**
    * Specifies the type of action.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionToggle.html#type)
    *
    * @default "toggle"
    */
  val `type`: String = js.native
  /**
    * Indicates the value of whether the action is toggled on/off.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionToggle.html#value)
    *
    * @default false
    */
  var value: Boolean = js.native
}

object ActionToggle {
  @scala.inline
  def apply(
    active: Boolean,
    disabled: Boolean,
    id: String,
    title: String,
    `type`: String,
    value: Boolean,
    visible: Boolean
  ): ActionToggle = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionToggle]
  }
  @scala.inline
  implicit class ActionToggleOps[Self <: ActionToggle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Boolean): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

