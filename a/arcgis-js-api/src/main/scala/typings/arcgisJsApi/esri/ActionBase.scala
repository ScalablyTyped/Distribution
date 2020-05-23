package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionBase extends js.Object {
  /**
    * Indicates whether the action is currently active.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#active)
    *
    * @default false
    */
  var active: Boolean
  /**
    * Adds a CSS class to the action's node. Can be used in conjunction with the `image` property or by itself. Any icon font may be used in this property. The [Esri Icon Font](https://developers.arcgis.com/javascript/latest/guide/esri-icon-font/index.html) is automatically made available via the ArcGIS API for JavaScript for you to use in styling custom actions. To use one of these provided icon fonts, you must prefix the class name with `esri-`. For example, the default `zoom-to` action in [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) uses the font `esri-icon-zoom-in-magnifying-glass`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#className)
    */
  var className: String
  /**
    * Indicates whether this action is disabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#disabled)
    *
    * @default false
    */
  var disabled: Boolean
  /**
    * The name of the ID assigned to this action. This is used for differentiating actions when listening to the [trigger-action](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#event-trigger-action) event.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#id)
    */
  var id: String
  /**
    * The title of the action.  _For popups_: When there are fewer than three actions defined in a popup, this text is displayed to the right of the icon or image representing the action. If there are three or more actions in the popup, then this text is used as a tooltip on the action.  _For LayerList_: The first action is displayed in the layerlist with an icon. The layerlist has a menu that will display all actions with their titles
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#title)
    */
  var title: String
  /**
    * Specifies the type of action. Choose between ["button"](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html) or ["toggle"](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionToggle.html). Currently, these two are the only supported types. A "slider" type will follow-up in a future release.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#type)
    *
    * @default null
    */
  var `type`: String
  /**
    * Indicates if the action is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#visible)
    *
    * @default true
    */
  var visible: Boolean
}

object ActionBase {
  @scala.inline
  def apply(
    active: Boolean,
    className: String,
    disabled: Boolean,
    id: String,
    title: String,
    `type`: String,
    visible: Boolean
  ): ActionBase = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionBase]
  }
}

