package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.jpg
import typings.arcgisJsApi.arcgisJsApiStrings.png
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SceneViewTakeScreenshotOptions extends Object {
  /**
    * Specifies whether to take a screenshot of a specific area of the view. The area coordinates are relative to the origin of the padded view (see [padding](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#padding)) and will be clipped to the view size. Defaults to the whole view (padding excluded).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#takeScreenshot)
    */
  var area: js.UndefOr[SceneViewTakeScreenshotOptionsArea] = js.native
  /**
    * The format of the resulting encoded data url.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#takeScreenshot)
    *
    * @default jpg
    */
  var format: js.UndefOr[jpg | png] = js.native
  /**
    * The height of the screenshot (defaults to the area height). The width will be derived automatically if left unspecified, according to the aspect ratio of the screenshot area.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#takeScreenshot)
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Indicates whether view padding should be ignored. Set this property to `true` to allow padded areas to be included in the screenshot.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#takeScreenshot)
    */
  var ignorePadding: js.UndefOr[Boolean] = js.native
  /**
    * The quality (0 to 100) of the encoded image when format is `jpg`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#takeScreenshot)
    *
    * @default 98
    */
  var quality: js.UndefOr[Double] = js.native
  /**
    * The width of the screenshot (defaults to the area width). The height will be derived automatically if left unspecified, according to the aspect ratio of the of the screenshot area.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#takeScreenshot)
    */
  var width: js.UndefOr[Double] = js.native
}

object SceneViewTakeScreenshotOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SceneViewTakeScreenshotOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SceneViewTakeScreenshotOptions]
  }
  @scala.inline
  implicit class SceneViewTakeScreenshotOptionsOps[Self <: SceneViewTakeScreenshotOptions] (val x: Self) extends AnyVal {
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
    def setArea(value: SceneViewTakeScreenshotOptionsArea): Self = this.set("area", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArea: Self = this.set("area", js.undefined)
    @scala.inline
    def setFormat(value: jpg | png): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setIgnorePadding(value: Boolean): Self = this.set("ignorePadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnorePadding: Self = this.set("ignorePadding", js.undefined)
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

