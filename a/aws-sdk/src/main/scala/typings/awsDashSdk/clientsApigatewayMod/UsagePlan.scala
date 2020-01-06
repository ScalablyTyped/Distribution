package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsagePlan extends js.Object {
  /**
    * The associated API stages of a usage plan.
    */
  var apiStages: js.UndefOr[ListOfApiStage] = js.native
  /**
    * The description of a usage plan.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The identifier of a UsagePlan resource.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The name of a usage plan.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The AWS Markeplace product identifier to associate with the usage plan as a SaaS product on AWS Marketplace.
    */
  var productCode: js.UndefOr[String] = js.native
  /**
    * The maximum number of permitted requests per a given unit time interval.
    */
  var quota: js.UndefOr[QuotaSettings] = js.native
  /**
    * The collection of tags. Each tag element is associated with a given resource.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.native
  /**
    * The request throttle limits of a usage plan.
    */
  var throttle: js.UndefOr[ThrottleSettings] = js.native
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
    tags: MapOfStringToString = null,
    throttle: ThrottleSettings = null
  ): UsagePlan = {
    val __obj = js.Dynamic.literal()
    if (apiStages != null) __obj.updateDynamic("apiStages")(apiStages.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (productCode != null) __obj.updateDynamic("productCode")(productCode.asInstanceOf[js.Any])
    if (quota != null) __obj.updateDynamic("quota")(quota.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (throttle != null) __obj.updateDynamic("throttle")(throttle.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsagePlan]
  }
}

