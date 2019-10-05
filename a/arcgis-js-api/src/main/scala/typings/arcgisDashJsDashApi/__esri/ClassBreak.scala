package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassBreak extends Object {
  /**
    * The label describing the given class break for use in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#ClassBreak)
    */
  var label: String
  /**
    * The upper bound of the class break.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#ClassBreak)
    */
  var maxValue: Double
  /**
    * The lower bound of the class break.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#ClassBreak)
    */
  var minValue: Double
}

object ClassBreak {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    label: String,
    maxValue: Double,
    minValue: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ClassBreak = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), label = label, maxValue = maxValue, minValue = minValue, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[ClassBreak]
  }
}

