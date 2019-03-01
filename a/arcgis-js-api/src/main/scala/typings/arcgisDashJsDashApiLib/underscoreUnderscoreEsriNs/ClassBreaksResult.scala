package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassBreaksResult
  extends stdLib.Object {
  /**
    * An array of objects describing the class breaks generated from the [classBreaks()](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#classBreaks) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#ClassBreaksResult)
    */
  var classBreaksInfos: js.Array[ClassBreaksResultClassBreaksInfos]
  /**
    * The maximum value of features in the dataset. This will be the upper bound of the highest class break.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#ClassBreaksResult)
    */
  var maxValue: scala.Double
  /**
    * The minimum value of features in the dataset. This will be the lower bound of the lowest class break.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#ClassBreaksResult)
    */
  var minValue: scala.Double
  /**
    * The normalization total if `normalizationType` is set to `percent-of-total` when generating class breaks with [createClassBreaksRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createClassBreaksRenderer).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-classBreaks.html#ClassBreaksResult)
    */
  var normalizationTotal: scala.Double
}

object ClassBreaksResult {
  @scala.inline
  def apply(
    classBreaksInfos: js.Array[ClassBreaksResultClassBreaksInfos],
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    maxValue: scala.Double,
    minValue: scala.Double,
    normalizationTotal: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean]
  ): ClassBreaksResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("classBreaksInfos")(classBreaksInfos)
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("maxValue")(maxValue)
    __obj.updateDynamic("minValue")(minValue)
    __obj.updateDynamic("normalizationTotal")(normalizationTotal)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.asInstanceOf[ClassBreaksResult]
  }
}

