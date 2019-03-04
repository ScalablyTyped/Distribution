package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelClassLabelExpressionInfo
  extends stdLib.Object {
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that evaluates to a string used to label features in the layer. The most simple expressions return field values. For example, to label a layer of cities with their names, simply reference the field value with the global variable: `$feature.CITY_NAME`. Expressions can be more sophisticated and use logical functions. This may be useful if you want to use classed labels. For example, the following expression appends `city` to the end of the label if the feature's population field contains a number greater than 10,000. Otherwise, `town` is appended to the end of the label. Additionally, you can use `TextFormatting.NewLine` to add a new line to the label.  `IIF($feature.POPULATION > 10000, $feature.NAME + ' city', $feature.NAME + ' town')`
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpressionInfo)
    */
  var expression: java.lang.String
  /**
    * The SQL expression defining the content of the label text.  **Deprecated as of v4.5. Use `expression` instead.**
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpressionInfo)
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object LabelClassLabelExpressionInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    expression: java.lang.String,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    value: java.lang.String = null
  ): LabelClassLabelExpressionInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor, expression = expression, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[LabelClassLabelExpressionInfo]
  }
}

