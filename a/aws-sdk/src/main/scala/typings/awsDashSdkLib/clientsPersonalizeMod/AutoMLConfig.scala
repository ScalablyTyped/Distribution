package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoMLConfig extends js.Object {
  /**
    * The metric to optimize.
    */
  var metricName: js.UndefOr[MetricName] = js.undefined
  /**
    * The list of candidate recipes.
    */
  var recipeList: js.UndefOr[ArnList] = js.undefined
}

object AutoMLConfig {
  @scala.inline
  def apply(metricName: MetricName = null, recipeList: ArnList = null): AutoMLConfig = {
    val __obj = js.Dynamic.literal()
    if (metricName != null) __obj.updateDynamic("metricName")(metricName)
    if (recipeList != null) __obj.updateDynamic("recipeList")(recipeList)
    __obj.asInstanceOf[AutoMLConfig]
  }
}

