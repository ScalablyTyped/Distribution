package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIProperties extends js.Object {
  /**
    * The HTML Element that contains the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#container)
    */
  var container: js.UndefOr[stdLib.HTMLElement] = js.undefined
  /**
    * Defines the padding for the UI from the top, left, right, and bottom sides of the container or [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html). If the value is a number, it will be used to pad all sides of the container.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#padding)
    *
    * @default { left: 15, top: 15, right: 15, bottom: 15 }
    */
  var padding: js.UndefOr[js.Any | scala.Double] = js.undefined
  /**
    * The view associated with the UI components.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
}

object UIProperties {
  @scala.inline
  def apply(
    container: stdLib.HTMLElement = null,
    padding: js.Any | scala.Double = null,
    view: MapViewProperties | SceneViewProperties = null
  ): UIProperties = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIProperties]
  }
}

