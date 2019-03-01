package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupDockOptionsBreakpoint
  extends stdLib.Object {
  /**
    * The maximum height of the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) at which the popup will be set to dockEnabled automatically.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#dockOptions)
    *
    * @default 544
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * The maximum width of the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) at which the popup will be set to dockEnabled automatically.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#dockOptions)
    *
    * @default 544
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object PopupDockOptionsBreakpoint {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    height: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): PopupDockOptionsBreakpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupDockOptionsBreakpoint]
  }
}

