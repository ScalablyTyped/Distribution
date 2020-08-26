package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PCTrueColorRendererResult extends Object {
  /**
    * The renderer object configured to represent the true color of each point in the point cloud. This gives the PointCloudLayer a realistic visualization of how it looks in the real world. Set this object on the input layer's `renderer` property to update its visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#PCTrueColorRendererResult)
    */
  var renderer: PointCloudRGBRenderer = js.native
}

object PCTrueColorRendererResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    renderer: PointCloudRGBRenderer
  ): PCTrueColorRendererResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PCTrueColorRendererResult]
  }
  @scala.inline
  implicit class PCTrueColorRendererResultOps[Self <: PCTrueColorRendererResult] (val x: Self) extends AnyVal {
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
    def setRenderer(value: PointCloudRGBRenderer): Self = this.set("renderer", value.asInstanceOf[js.Any])
  }
  
}

