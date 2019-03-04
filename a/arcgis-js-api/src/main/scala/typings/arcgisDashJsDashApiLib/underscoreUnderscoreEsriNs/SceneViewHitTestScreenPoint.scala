package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewHitTestScreenPoint
  extends stdLib.Object {
  /**
    * The horizontal screen coordinate of the click on the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#hitTest)
    */
  var x: scala.Double
  /**
    * The vertical screen coordinate of the click on the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#hitTest)
    */
  var y: scala.Double
}

object SceneViewHitTestScreenPoint {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    x: scala.Double,
    y: scala.Double
  ): SceneViewHitTestScreenPoint = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable, x = x, y = y)
  
    __obj.asInstanceOf[SceneViewHitTestScreenPoint]
  }
}

