package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RampTitle
  extends stdLib.Object {
  /**
    * The field name used in a visual variable of a renderer. This is used in the generated title of the corresponding ramp in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RampTitle)
    */
  var field: java.lang.String
  /**
    * If provided, the normalization field name used in a visual variable of a renderer. This is used in the generated title of the corresponding ramp in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RampTitle)
    */
  var normField: java.lang.String
  /**
    * If `true`, the legend formats to display the field and normalization field as a ratio.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RampTitle)
    */
  var ratio: scala.Boolean
  /**
    * If `true`, the legend formats to display the field and normalization field as a percentage.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RampTitle)
    */
  var ratioPercent: scala.Boolean
  /**
    * If `true`, the legend formats to display the field and normalization field as a percentage of total.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RampTitle)
    */
  var ratioPercentTotal: scala.Boolean
}

object RampTitle {
  @scala.inline
  def apply(
    constructor: js.Function,
    field: java.lang.String,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    normField: java.lang.String,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    ratio: scala.Boolean,
    ratioPercent: scala.Boolean,
    ratioPercentTotal: scala.Boolean
  ): RampTitle = {
    val __obj = js.Dynamic.literal(constructor = constructor, field = field, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), normField = normField, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), ratio = ratio, ratioPercent = ratioPercent, ratioPercentTotal = ratioPercentTotal)
  
    __obj.asInstanceOf[RampTitle]
  }
}

