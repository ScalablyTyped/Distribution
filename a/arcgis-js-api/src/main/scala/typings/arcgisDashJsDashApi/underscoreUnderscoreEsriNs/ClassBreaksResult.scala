package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassBreaksResult extends Object {
  /**
    * An array of objects describing the class breaks generated from the [classBreaks()](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#classBreaks) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#ClassBreaksResult)
    */
  var classBreakInfos: js.Array[ClassBreak]
  /**
    * The maximum value of features in the dataset. This will be the upper bound of the highest class break.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#ClassBreaksResult)
    */
  var maxValue: Double
  /**
    * The minimum value of features in the dataset. This will be the lower bound of the lowest class break.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#ClassBreaksResult)
    */
  var minValue: Double
  /**
    * The normalization total if `normalizationType` is set to `percent-of-total` when generating class breaks with [createClassBreaksRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createClassBreaksRenderer).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#ClassBreaksResult)
    */
  var normalizationTotal: Double
}

object ClassBreaksResult {
  @scala.inline
  def apply(
    classBreakInfos: js.Array[ClassBreak],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    maxValue: Double,
    minValue: Double,
    normalizationTotal: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ClassBreaksResult = {
    val __obj = js.Dynamic.literal(classBreakInfos = classBreakInfos, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), maxValue = maxValue, minValue = minValue, normalizationTotal = normalizationTotal, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[ClassBreaksResult]
  }
}

