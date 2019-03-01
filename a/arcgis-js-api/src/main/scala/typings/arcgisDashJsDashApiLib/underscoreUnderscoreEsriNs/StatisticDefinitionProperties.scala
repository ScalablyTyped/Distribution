package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatisticDefinitionProperties extends js.Object {
  /**
    * Defines the field for which statistics will be calculated. This can be service field names or SQL expressions. See the snippets below for examples.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#onStatisticField)
    */
  var onStatisticField: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies the output field name for the requested statistic. Output field names can only contain alpha-numeric characters and an underscore. If no output field name is specified, the server assigns a field name to the returned statistic field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#outStatisticFieldName)
    */
  var outStatisticFieldName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Defines the type of statistic.  **Possible Values:** count | sum | min | max | avg | stddev | var
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#statisticType)
    */
  var statisticType: js.UndefOr[
    arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.count | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.sum | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.min | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.max | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.avg | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.stddev | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`var`
  ] = js.undefined
}

object StatisticDefinitionProperties {
  @scala.inline
  def apply(
    onStatisticField: java.lang.String = null,
    outStatisticFieldName: java.lang.String = null,
    statisticType: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.count | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.sum | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.min | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.max | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.avg | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.stddev | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`var` = null
  ): StatisticDefinitionProperties = {
    val __obj = js.Dynamic.literal()
    if (onStatisticField != null) __obj.updateDynamic("onStatisticField")(onStatisticField)
    if (outStatisticFieldName != null) __obj.updateDynamic("outStatisticFieldName")(outStatisticFieldName)
    if (statisticType != null) __obj.updateDynamic("statisticType")(statisticType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatisticDefinitionProperties]
  }
}

