package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PCTrueColorRendererResult
  extends stdLib.Object {
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
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    renderer: PointCloudRGBRenderer
  ): PCTrueColorRendererResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("renderer")(renderer)
    __obj.asInstanceOf[PCTrueColorRendererResult]
  }
}

