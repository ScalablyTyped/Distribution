package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetApiKeyRequest extends js.Object {
  
  /**
    * [Required] The identifier of the ApiKey resource.
    */
  var apiKey: String = js.native
  
  /**
    * A boolean flag to specify whether (true) or not (false) the result contains the key value.
    */
  var includeValue: js.UndefOr[NullableBoolean] = js.native
}
object GetApiKeyRequest {
  
  @scala.inline
  def apply(apiKey: String): GetApiKeyRequest = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetApiKeyRequest]
  }
  
  @scala.inline
  implicit class GetApiKeyRequestOps[Self <: GetApiKeyRequest] (val x: Self) extends AnyVal {
    
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
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeValue(value: NullableBoolean): Self = this.set("includeValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeValue: Self = this.set("includeValue", js.undefined)
  }
}
