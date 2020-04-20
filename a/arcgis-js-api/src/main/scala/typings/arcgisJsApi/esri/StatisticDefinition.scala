package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisJsApi.arcgisJsApiStrings.`percentile-continuous`
import typings.arcgisJsApi.arcgisJsApiStrings.`percentile-discrete`
import typings.arcgisJsApi.arcgisJsApiStrings.`var`
import typings.arcgisJsApi.arcgisJsApiStrings.avg
import typings.arcgisJsApi.arcgisJsApiStrings.count
import typings.arcgisJsApi.arcgisJsApiStrings.max
import typings.arcgisJsApi.arcgisJsApiStrings.min
import typings.arcgisJsApi.arcgisJsApiStrings.stddev
import typings.arcgisJsApi.arcgisJsApiStrings.sum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatisticDefinition
  extends Accessor
     with JSONSupport {
  /**
    * Defines the field for which statistics will be calculated. This can be service field names or SQL expressions. See the snippets below for examples.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#onStatisticField)
    */
  var onStatisticField: String = js.native
  /**
    * Specifies the output field name for the requested statistic. Output field names can only contain alpha-numeric characters and an underscore. If no output field name is specified, the server assigns a field name to the returned statistic field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#outStatisticFieldName)
    */
  var outStatisticFieldName: String = js.native
  /**
    * The parameters for [percentile statistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#statisticType). This property must be set when the [statisticType](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#statisticType) is set to either `percentile-continuous` or `percentile-discrete`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#statisticParameters)
    *
    * @default null
    */
  var statisticParameters: StatisticDefinitionStatisticParameters = js.native
  /**
    * Defines the type of statistic.  **Possible Values:**
    *
    * Value | Description |
    * ----- | ----------- |
    * count | The number of features that match a specified criteria.
    * sum | The total sum of values that match a specified criteria.
    * min | The minimum value of a given field.
    * max | The maximum value of a given field.
    * avg | The average of values that match a specified criteria.
    * stddev | The standard deviation of values that match a specified criteria.
    * var | The statistical variance of values in the specified criteria.
    * percentile-continuous | The percentile statistic indicates the value above or below which a given percentage of values in a group of data falls. For example, the 90th percentile (value 0.9) is the value below which 90% of the data values may be found. `percentile-continuous` returns an interpolated value from the dataset.
    * percentile-discrete | Similar to `percentile-continuous` except `percentile-discrete` returns a data value from within the dataset.
    *
    * > **Known Limitations**
    *   * The [statisticParameters](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#statisticParameters) must be set when calculating `percentile-continuous` or `percentile-discrete` statistics.
    *   * The `percentile-continuous` and `percentile-discrete` statistic types cannot be used with the [having](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#having) parameter.
    *   * The `percentile-continuous` and `percentile-discrete` statistic types are only supported with server-side [FeatureLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
    *   * The `percentile-continuous` and `percentile-discrete` statistic types are supported if [capabilities.query.supportsPercentileStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#statisticType)
    */
  var statisticType: count | sum | min | max | avg | stddev | `var` | `percentile-continuous` | `percentile-discrete` = js.native
}

@JSGlobal("__esri.StatisticDefinition")
@js.native
object StatisticDefinition extends TopLevel[StatisticDefinitionConstructor]

