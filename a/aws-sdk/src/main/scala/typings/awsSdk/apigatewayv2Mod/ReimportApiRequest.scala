package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReimportApiRequest extends StObject {
  
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
  implicit class ReimportApiRequestMutableBuilder[Self <: ReimportApiRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: string): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasepath(value: string): Self = StObject.set(x, "Basepath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasepathUndefined: Self = StObject.set(x, "Basepath", js.undefined)
    
    @scala.inline
    def setBody(value: string): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailOnWarnings(value: boolean): Self = StObject.set(x, "FailOnWarnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailOnWarningsUndefined: Self = StObject.set(x, "FailOnWarnings", js.undefined)
  }
}
