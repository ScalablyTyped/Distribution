package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.ASC
import typings.arcgisJsApi.arcgisJsApiStrings.DESC
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatisticDefinitionStatisticParameters extends Object {
  /**
    * Specify `ASC` (ascending) or `DESC` (descending) to control the order of the data. For example, in a data set of 10 values from 1 to 10, the percentile value for 0.9 with `orderBy` set to ascending (`ASC`) is 9, but when `ordenBy` is set to descending (`DESC`) the result is 2. The default is `ASC`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#statisticParameters)
    */
  var orderBy: js.UndefOr[ASC | DESC] = js.undefined
  /**
    * Percentile value. This should be a decimal value between 0 and 1.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-StatisticDefinition.html#statisticParameters)
    */
  var value: Double
}

object StatisticDefinitionStatisticParameters {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    value: Double,
    orderBy: ASC | DESC = null
  ): StatisticDefinitionStatisticParameters = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), value = value.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatisticDefinitionStatisticParameters]
  }
}

