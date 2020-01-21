package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiStage extends js.Object {
  /**
    * API Id of the associated API stage in a usage plan.
    */
  var apiId: js.UndefOr[String] = js.native
  /**
    * API stage name of the associated API stage in a usage plan.
    */
  var stage: js.UndefOr[String] = js.native
  /**
    * Map containing method level throttling information for API stage in a usage plan.
    */
  var throttle: js.UndefOr[MapOfApiStageThrottleSettings] = js.native
}

object ApiStage {
  @scala.inline
  def apply(apiId: String = null, stage: String = null, throttle: MapOfApiStageThrottleSettings = null): ApiStage = {
    val __obj = js.Dynamic.literal()
    if (apiId != null) __obj.updateDynamic("apiId")(apiId.asInstanceOf[js.Any])
    if (stage != null) __obj.updateDynamic("stage")(stage.asInstanceOf[js.Any])
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiStage]
  }
}

