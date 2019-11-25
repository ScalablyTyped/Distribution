package typings.arcgisDashJsDashApi.__esri

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultUIProperties extends UIProperties {
  /**
    * An array of strings representing the default widgets visible when a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) is created. The default widgets differ between MapView and SceneView.  The following are the default components in each view:  **MapView:** `["attribution", "zoom"]`  **SceneView:** `["attribution", "navigation-toggle", "compass", "zoom"]`
    * > Esri requires that when you use an ArcGIS Online basemap in your app, the map must include Esri attribution and you must be licensed to use the content. For detailed guidelines on working with attribution, please visit the official [attribution in your app](https://developers.arcgis.com/terms/attribution/) documentation. For information on terms of use, see the [Terms of Use FAQ](https://developers.arcgis.com/terms/faq/).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-DefaultUI.html#components)
    */
  var components: js.UndefOr[js.Array[String]] = js.undefined
}

object DefaultUIProperties {
  @scala.inline
  def apply(
    components: js.Array[String] = null,
    container: HTMLElement = null,
    padding: js.Any | Double = null,
    view: MapViewProperties | SceneViewProperties = null
  ): DefaultUIProperties = {
    val __obj = js.Dynamic.literal()
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultUIProperties]
  }
}

