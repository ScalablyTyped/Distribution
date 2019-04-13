package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUsagePlanRequest extends js.Object {
  /**
    * The associated API stages of the usage plan.
    */
  var apiStages: js.UndefOr[ListOfApiStage] = js.undefined
  /**
    * The description of the usage plan.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * [Required] The name of the usage plan.
    */
  var name: String
  /**
    * The quota of the usage plan.
    */
  var quota: js.UndefOr[QuotaSettings] = js.undefined
  /**
    * The throttling limits of the usage plan.
    */
  var throttle: js.UndefOr[ThrottleSettings] = js.undefined
}

object CreateUsagePlanRequest {
  @scala.inline
  def apply(
    name: String,
    apiStages: ListOfApiStage = null,
    description: String = null,
    quota: QuotaSettings = null,
    throttle: ThrottleSettings = null
  ): CreateUsagePlanRequest = {
    val __obj = js.Dynamic.literal(name = name)
    if (apiStages != null) __obj.updateDynamic("apiStages")(apiStages)
    if (description != null) __obj.updateDynamic("description")(description)
    if (quota != null) __obj.updateDynamic("quota")(quota)
    if (throttle != null) __obj.updateDynamic("throttle")(throttle)
    __obj.asInstanceOf[CreateUsagePlanRequest]
  }
}

