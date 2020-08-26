package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultUIProperties extends UIProperties {
  /**
    * An array of strings representing the default widgets visible when a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) is created. The default widgets differ between MapView and SceneView.  The following are the default components in each view:  **MapView:** `["attribution", "zoom"]`  **SceneView:** `["attribution", "navigation-toggle", "compass", "zoom"]`
    * > Esri requires that when you use an ArcGIS Online basemap in your app, the map must include Esri attribution and you must be licensed to use the content. For detailed guidelines on working with attribution, please visit the official [attribution in your app](https://developers.arcgis.com/terms/attribution/) documentation. For information on terms of use, see the [Terms of Use FAQ](https://developers.arcgis.com/terms/faq/).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-DefaultUI.html#components)
    */
  var components: js.UndefOr[js.Array[String]] = js.native
}

object DefaultUIProperties {
  @scala.inline
  def apply(): DefaultUIProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultUIProperties]
  }
  @scala.inline
  implicit class DefaultUIPropertiesOps[Self <: DefaultUIProperties] (val x: Self) extends AnyVal {
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
    def setComponentsVarargs(value: String*): Self = this.set("components", js.Array(value :_*))
    @scala.inline
    def setComponents(value: js.Array[String]): Self = this.set("components", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
  }
  
}

