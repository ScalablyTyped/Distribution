package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PCClassRendererResult extends Object {
  /**
    * The renderer object configured to represent the class codes in the point cloud. Set this object on the input layer's `renderer` property to update its visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#PCClassRendererResult)
    */
  var renderer: PointCloudUniqueValueRenderer = js.native
}

object PCClassRendererResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    renderer: PointCloudUniqueValueRenderer
  ): PCClassRendererResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), renderer = renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PCClassRendererResult]
  }
  @scala.inline
  implicit class PCClassRendererResultOps[Self <: PCClassRendererResult] (val x: Self) extends AnyVal {
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
    def setRenderer(value: PointCloudUniqueValueRenderer): Self = this.set("renderer", value.asInstanceOf[js.Any])
  }
  
}

