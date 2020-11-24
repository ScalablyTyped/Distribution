package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateApiMappingRequest extends js.Object {
  
  /**
    * The API identifier.
    */
  var ApiId: Id = js.native
  
  /**
    * The API mapping key.
    */
  var ApiMappingKey: js.UndefOr[SelectionKey] = js.native
  
  /**
    * The domain name.
    */
  var DomainName: string = js.native
  
  /**
    * The API stage.
    */
  var Stage: StringWithLengthBetween1And128 = js.native
}
object CreateApiMappingRequest {
  
  @scala.inline
  def apply(ApiId: Id, DomainName: string, Stage: StringWithLengthBetween1And128): CreateApiMappingRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], Stage = Stage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApiMappingRequest]
  }
  
  @scala.inline
  implicit class CreateApiMappingRequestOps[Self <: CreateApiMappingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApiId(value: Id): Self = this.set("ApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainName(value: string): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStage(value: StringWithLengthBetween1And128): Self = this.set("Stage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiMappingKey(value: SelectionKey): Self = this.set("ApiMappingKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiMappingKey: Self = this.set("ApiMappingKey", js.undefined)
  }
}
