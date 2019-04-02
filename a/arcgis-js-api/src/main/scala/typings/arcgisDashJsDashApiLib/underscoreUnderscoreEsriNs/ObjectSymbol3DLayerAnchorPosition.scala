package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectSymbol3DLayerAnchorPosition
  extends stdLib.Object {
  /**
    * Value defining the position relative to the x axis of the bounding box.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#anchorPosition)
    */
  var x: scala.Double
  /**
    * Value defining the position relative to the y axis of the bounding box.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#anchorPosition)
    */
  var y: scala.Double
  /**
    * Value defining the position relative to the z axis of the bounding box.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#anchorPosition)
    */
  var z: scala.Double
}

object ObjectSymbol3DLayerAnchorPosition {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    x: scala.Double,
    y: scala.Double,
    z: scala.Double
  ): ObjectSymbol3DLayerAnchorPosition = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), x = x, y = y, z = z)
  
    __obj.asInstanceOf[ObjectSymbol3DLayerAnchorPosition]
  }
}

