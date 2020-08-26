package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionButton extends ActionBase {
  /**
    * This adds a CSS class to the action's node. It can be used in conjunction with the `image` property or by itself. Any icon font may be used in this property. The [Esri Icon Font](https://developers.arcgis.com/javascript/latest/guide/esri-icon-font/index.html) is automatically made available via the ArcGIS API for JavaScript for you to use in styling custom actions. To use one of these provided icon fonts, you must prefix the class name with `esri-`. For example, the default `zoom-to` action in [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) uses the font `esri-icon-zoom-in-magnifying-glass`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html#className)
    */
  var className: String = js.native
  /**
    * The URL to an image that will be used to represent the action. This property will be used as a background image for the node. It may be used in conjunction with the `className` property or by itself. If neither `image` nor `className` are specified, a default icon ![default icon](https://developers.arcgis.com/javascript/assets/img/guide/whats-new/41/default-action.png) will display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html#image)
    */
  var image: String = js.native
  /**
    * The title of the action.  When space is limited, actions will display in the menu. Text is always shown next to the icon but long text is truncated. A tooltip with this title will display when hovering over it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html#title)
    */
  var title: String = js.native
  /**
    * Specifies the type of action.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html#type)
    *
    * @default "button"
    */
  val `type`: String = js.native
}

object ActionButton {
  @scala.inline
  def apply(
    active: Boolean,
    className: String,
    disabled: Boolean,
    id: String,
    image: String,
    title: String,
    `type`: String,
    visible: Boolean
  ): ActionButton = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionButton]
  }
  @scala.inline
  implicit class ActionButtonOps[Self <: ActionButton] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

