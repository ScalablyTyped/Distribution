package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionToggle extends ActionBase

@JSGlobal("__esri.ActionToggle")
@js.native
class ActionToggleCls () extends ActionToggle {
  def this(properties: js.Any) = this()
  /**
    * Indicates whether the action is currently active.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#active)
    *
    * @default false
    */
  /* CompleteClass */
  override var active: scala.Boolean = js.native
  /**
    * Adds a CSS class to the action's node. Can be used in conjunction with the `image` property or by itself. Any icon font may be used in this property. The [Esri Icon Font](https://developers.arcgis.com/javascript/latest/guide/esri-icon-font/index.html) is automatically made available via the ArcGIS API for JavaScript for you to use in styling custom actions. To use one of these provided icon fonts, you must prefix the class name with `esri-`. For example, the default `zoom-to` action in [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) uses the font `esri-icon-zoom-in-magnifying-glass`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#className)
    */
  /* CompleteClass */
  override var className: java.lang.String = js.native
  /**
    * Indicates whether this action is disabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#disabled)
    *
    * @default false
    */
  /* CompleteClass */
  override var disabled: scala.Boolean = js.native
  /**
    * The name of the ID assigned to this action. This is used for differentiating actions when listening to the [trigger-action](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#event:trigger-action) event.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#id)
    */
  /* CompleteClass */
  override var id: java.lang.String = js.native
  /**
    * The title of the action.  _For popups_: When there are fewer than three actions defined in a popup, this text is displayed to the right of the icon or image representing the action. If there are three or more actions in the popup, then this text is used as a tooltip on the action.  _For LayerList_: The first action is displayed in the layerlist with an icon. The layerlist has a menu that will display all actions with their titles
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#title)
    */
  /* CompleteClass */
  override var title: java.lang.String = js.native
  /**
    * Specifies the type of action. Choose between ["button"](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionButton.html) or ["toggle"](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionToggle.html). Currently, these two are the only supported types. A "slider" type will follow-up in a future release.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#type)
    *
    * @default null
    */
  /* CompleteClass */
  override var `type`: java.lang.String = js.native
  /**
    * Indicates if the action is visible.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-actions-ActionBase.html#visible)
    *
    * @default true
    */
  /* CompleteClass */
  override var visible: scala.Boolean = js.native
}

object ActionToggle {
  @scala.inline
  def apply(
    active: scala.Boolean,
    className: java.lang.String,
    clone: () => ActionToggle,
    disabled: scala.Boolean,
    id: java.lang.String,
    title: java.lang.String,
    `type`: java.lang.String,
    visible: scala.Boolean
  ): ActionToggle = {
    val __obj = js.Dynamic.literal(active = active, className = className, clone = js.Any.fromFunction0(clone), disabled = disabled, id = id, title = title, visible = visible)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ActionToggle]
  }
}

