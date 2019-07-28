package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`var`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.avg
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.count
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.max
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.min
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.stddev
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.sum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatisticDefinitionProperties extends js.Object {
  /**
    * Defines the field for which statistics will be calculated. This can be service field names or SQL expressions. See the snippets below for examples.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#onStatisticField)
    */
  var onStatisticField: js.UndefOr[String] = js.undefined
  /**
    * Specifies the output field name for the requested statistic. Output field names can only contain alpha-numeric characters and an underscore. If no output field name is specified, the server assigns a field name to the returned statistic field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#outStatisticFieldName)
    */
  var outStatisticFieldName: js.UndefOr[String] = js.undefined
  /**
    * Defines the type of statistic.  **Possible Values:** count | sum | min | max | avg | stddev | var
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#statisticType)
    */
  var statisticType: js.UndefOr[count | sum | min | max | avg | stddev | `var`] = js.undefined
}

object StatisticDefinitionProperties {
  @scala.inline
  def apply(
    onStatisticField: String = null,
    outStatisticFieldName: String = null,
    statisticType: count | sum | min | max | avg | stddev | `var` = null
  ): StatisticDefinitionProperties = {
    val __obj = js.Dynamic.literal()
    if (onStatisticField != null) __obj.updateDynamic("onStatisticField")(onStatisticField)
    if (outStatisticFieldName != null) __obj.updateDynamic("outStatisticFieldName")(outStatisticFieldName)
    if (statisticType != null) __obj.updateDynamic("statisticType")(statisticType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatisticDefinitionProperties]
  }
}

