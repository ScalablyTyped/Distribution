package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PCClassRendererResult
  extends stdLib.Object {
  /**
    * The renderer object configured to represent the class codes in the point cloud. Set this object on the input layer's `renderer` property to update its visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-type.html#PCClassRendererResult)
    */
  var renderer: PointCloudUniqueValueRenderer
}

object PCClassRendererResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    renderer: PointCloudUniqueValueRenderer
  ): PCClassRendererResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("renderer")(renderer)
    __obj.asInstanceOf[PCClassRendererResult]
  }
}

