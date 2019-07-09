package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PixelBlockAddDataPlaneData
  extends stdLib.Object {
  /**
    * A two dimensional array representing the pixels to add.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#addData)
    */
  var pixels: js.Array[js.Array[scala.Double]]
  /**
    * An array of objects containing numeric statistical properties. See [statistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#statistics) for details on the specifications of each object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#addData)
    */
  var statistics: js.Array[_]
}

object PixelBlockAddDataPlaneData {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    pixels: js.Array[js.Array[scala.Double]],
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    statistics: js.Array[_]
  ): PixelBlockAddDataPlaneData = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), pixels = pixels, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), statistics = statistics)
  
    __obj.asInstanceOf[PixelBlockAddDataPlaneData]
  }
}

