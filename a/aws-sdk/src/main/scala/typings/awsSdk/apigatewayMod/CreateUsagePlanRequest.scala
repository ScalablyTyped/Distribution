package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUsagePlanRequest extends js.Object {
  /**
    * The associated API stages of the usage plan.
    */
  var apiStages: js.UndefOr[ListOfApiStage] = js.native
  /**
    * The description of the usage plan.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Required] The name of the usage plan.
    */
  var name: String = js.native
  /**
    * The quota of the usage plan.
    */
  var quota: js.UndefOr[QuotaSettings] = js.native
  /**
    * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must not start with aws:. The tag value can be up to 256 characters.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.native
  /**
    * The throttling limits of the usage plan.
    */
  var throttle: js.UndefOr[ThrottleSettings] = js.native
}

object CreateUsagePlanRequest {
  @scala.inline
  def apply(name: String): CreateUsagePlanRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUsagePlanRequest]
  }
  @scala.inline
  implicit class CreateUsagePlanRequestOps[Self <: CreateUsagePlanRequest] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setApiStagesVarargs(value: ApiStage*): Self = this.set("apiStages", js.Array(value :_*))
    @scala.inline
    def setApiStages(value: ListOfApiStage): Self = this.set("apiStages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApiStages: Self = this.set("apiStages", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setQuota(value: QuotaSettings): Self = this.set("quota", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuota: Self = this.set("quota", js.undefined)
    @scala.inline
    def setTags(value: MapOfStringToString): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setThrottle(value: ThrottleSettings): Self = this.set("throttle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrottle: Self = this.set("throttle", js.undefined)
  }
  
}

