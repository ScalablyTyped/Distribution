package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ageUtils extends js.Object {
  /**
    * Returns an [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression for visualizing the age of a feature based on a given start time and end time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-support-ageUtils.html#getAgeExpressions)
    *
    * @param params See the table below for details of each parameter.
    * @param params.layer The layer from which to generate age statistics for the given `startTime` and `endTime`.
    * @param params.startTime The start time for the age calculation. This can be a field name or a date value, such as `Date.now()`. If a `Date` is provided, then the `endTime` parameter must be a field name.
    * @param params.endTime The end time for the age calculation. This can be a field name or a date value, such as `Date.now()`. If a `Date` is provided, then the `startTime` parameter must be a field name.
    * @param params.unit The desired units of the age result.  **Possible Values:** years | months | days | hours | minutes | seconds
    *
    */
  def getAgeExpressions(params: ageUtilsGetAgeExpressionsParams): AgeExpressionsResult
}

object ageUtils {
  @scala.inline
  def apply(getAgeExpressions: ageUtilsGetAgeExpressionsParams => AgeExpressionsResult): ageUtils = {
    val __obj = js.Dynamic.literal(getAgeExpressions = js.Any.fromFunction1(getAgeExpressions))
    __obj.asInstanceOf[ageUtils]
  }
}

