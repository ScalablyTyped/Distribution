package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReimportApiRequest extends js.Object {
  
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
  
  /**
    * Specifies how to interpret the base path of the API during import. Valid values are ignore, prepend, and split. The default value is ignore. To learn more, see Set the OpenAPI basePath Property. Supported only for HTTP APIs.
    */
  var Basepath: js.UndefOr[string] = js.native
  
  /**
    * The OpenAPI definition. Supported only for HTTP APIs.
    */
  var Body: string = js.native
  
  /**
    * Specifies whether to rollback the API creation when a warning is encountered. By default, API creation continues if a warning is encountered.
    */
  var FailOnWarnings: js.UndefOr[boolean] = js.native
}
object ReimportApiRequest {
  
  @scala.inline
  def apply(ApiId: string, Body: string): ReimportApiRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], Body = Body.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReimportApiRequest]
  }
  
  @scala.inline
  implicit class ReimportApiRequestOps[Self <: ReimportApiRequest] (val x: Self) extends AnyVal {
    
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
    def setApiId(value: string): Self = this.set("ApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: string): Self = this.set("Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasepath(value: string): Self = this.set("Basepath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasepath: Self = this.set("Basepath", js.undefined)
    
    @scala.inline
    def setFailOnWarnings(value: boolean): Self = this.set("FailOnWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailOnWarnings: Self = this.set("FailOnWarnings", js.undefined)
  }
}
