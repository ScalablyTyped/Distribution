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
  def apply(): ApiStage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiStage]
  }
  @scala.inline
  implicit class ApiStageOps[Self <: ApiStage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApiId(value: String): Self = this.set("apiId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiId: Self = this.set("apiId", js.undefined)
    @scala.inline
    def setStage(value: String): Self = this.set("stage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStage: Self = this.set("stage", js.undefined)
    @scala.inline
    def setThrottle(value: MapOfApiStageThrottleSettings): Self = this.set("throttle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrottle: Self = this.set("throttle", js.undefined)
  }
  
}

