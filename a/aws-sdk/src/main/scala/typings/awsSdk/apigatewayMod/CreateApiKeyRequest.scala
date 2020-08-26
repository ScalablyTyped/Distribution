package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateApiKeyRequest extends js.Object {
  /**
    * An AWS Marketplace customer identifier , when integrating with the AWS SaaS Marketplace.
    */
  var customerId: js.UndefOr[String] = js.native
  /**
    * The description of the ApiKey.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Specifies whether the ApiKey can be used by callers.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Specifies whether (true) or not (false) the key identifier is distinct from the created API key value. This parameter is deprecated and should not be used.
    */
  var generateDistinctId: js.UndefOr[Boolean] = js.native
  /**
    * The name of the ApiKey.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
    */
  var stageKeys: js.UndefOr[ListOfStageKeys] = js.native
  /**
    * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must not start with aws:. The tag value can be up to 256 characters.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.native
  /**
    * Specifies a value of the API key.
    */
  var value: js.UndefOr[String] = js.native
}

object CreateApiKeyRequest {
  @scala.inline
  def apply(): CreateApiKeyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateApiKeyRequest]
  }
  @scala.inline
  implicit class CreateApiKeyRequestOps[Self <: CreateApiKeyRequest] (val x: Self) extends AnyVal {
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
    def setCustomerId(value: String): Self = this.set("customerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerId: Self = this.set("customerId", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setGenerateDistinctId(value: Boolean): Self = this.set("generateDistinctId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenerateDistinctId: Self = this.set("generateDistinctId", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setStageKeysVarargs(value: StageKey*): Self = this.set("stageKeys", js.Array(value :_*))
    @scala.inline
    def setStageKeys(value: ListOfStageKeys): Self = this.set("stageKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStageKeys: Self = this.set("stageKeys", js.undefined)
    @scala.inline
    def setTags(value: MapOfStringToString): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

