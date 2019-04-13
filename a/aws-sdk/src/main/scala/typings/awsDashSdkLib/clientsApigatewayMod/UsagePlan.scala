package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsagePlan extends js.Object {
  /**
    * The associated API stages of a usage plan.
    */
  var apiStages: js.UndefOr[ListOfApiStage] = js.undefined
  /**
    * The description of a usage plan.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The identifier of a UsagePlan resource.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The name of a usage plan.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The AWS Markeplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
    */
  var productCode: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of permitted requests per a given unit time interval.
    */
  var quota: js.UndefOr[QuotaSettings] = js.undefined
  /**
    * The request throttle limits of a usage plan.
    */
  var throttle: js.UndefOr[ThrottleSettings] = js.undefined
}

object UsagePlan {
  @scala.inline
  def apply(
    apiStages: ListOfApiStage = null,
    description: String = null,
    id: String = null,
    name: String = null,
    productCode: String = null,
    quota: QuotaSettings = null,
    throttle: ThrottleSettings = null
  ): UsagePlan = {
    val __obj = js.Dynamic.literal()
    if (apiStages != null) __obj.updateDynamic("apiStages")(apiStages)
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (productCode != null) __obj.updateDynamic("productCode")(productCode)
    if (quota != null) __obj.updateDynamic("quota")(quota)
    if (throttle != null) __obj.updateDynamic("throttle")(throttle)
    __obj.asInstanceOf[UsagePlan]
  }
}

