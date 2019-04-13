package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApiStage extends js.Object {
  /**
    * API Id of the associated API stage in a usage plan.
    */
  var apiId: js.UndefOr[String] = js.undefined
  /**
    * API stage name of the associated API stage in a usage plan.
    */
  var stage: js.UndefOr[String] = js.undefined
  /**
    * Map containing method level throttling information for API stage in a usage plan.
    */
  var throttle: js.UndefOr[MapOfApiStageThrottleSettings] = js.undefined
}

object ApiStage {
  @scala.inline
  def apply(apiId: String = null, stage: String = null, throttle: MapOfApiStageThrottleSettings = null): ApiStage = {
    val __obj = js.Dynamic.literal()
    if (apiId != null) __obj.updateDynamic("apiId")(apiId)
    if (stage != null) __obj.updateDynamic("stage")(stage)
    if (throttle != null) __obj.updateDynamic("throttle")(throttle)
    __obj.asInstanceOf[ApiStage]
  }
}

