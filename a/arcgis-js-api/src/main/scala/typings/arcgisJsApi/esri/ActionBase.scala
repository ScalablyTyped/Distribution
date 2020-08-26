package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionBase extends js.Object {
  /**
    * Set this property to `true` to display a spinner icon. You should do this if the action executes an async operation, such as a query, that requires letting the end user know that a process is ongoing in the background. Set the property back to `false` to communicate to the user that the process has finished.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#active)
    *
    * @default false
    */
  var active: Boolean = js.native
  /**
    * Indicates whether this action is disabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#disabled)
    *
    * @default false
    */
  var disabled: Boolean = js.native
  /**
    * The name of the ID assigned to this action. This is used for differentiating actions when listening to the [trigger-action](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#event-trigger-action) event.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#id)
    */
  var id: String = js.native
  /**
    * Indicates if the action is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#visible)
    *
    * @default true
    */
  var visible: Boolean = js.native
}

object ActionBase {
  @scala.inline
  def apply(active: Boolean, disabled: Boolean, id: String, visible: Boolean): ActionBase = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionBase]
  }
  @scala.inline
  implicit class ActionBaseOps[Self <: ActionBase] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
  
}

