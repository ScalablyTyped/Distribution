package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PCTrueColorRendererResult extends Object {
  /**
    * The renderer object configured to represent the true color of each point in the point cloud. This gives the PointCloudLayer a realistic visualization of how it looks in the real world. Set this object on the input layer's `renderer` property to update its visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#PCTrueColorRendererResult)
    */
  var renderer: PointCloudRGBRenderer
}

object PCTrueColorRendererResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    renderer: PointCloudRGBRenderer
  ): PCTrueColorRendererResult = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), renderer = renderer)
  
    __obj.asInstanceOf[PCTrueColorRendererResult]
  }
}

