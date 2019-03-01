package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapViewToMapScreenPoint
  extends stdLib.Object {
  /**
    * The horizontal screen coordinate to convert.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#toMap)
    */
  var x: scala.Double
  /**
    * The vertical screen coordinate to convert.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#toMap)
    */
  var y: scala.Double
}

object MapViewToMapScreenPoint {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    x: scala.Double,
    y: scala.Double
  ): MapViewToMapScreenPoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[MapViewToMapScreenPoint]
  }
}

