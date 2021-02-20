package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportApiResponse extends StObject {
  
  var body: js.UndefOr[ExportedApi] = js.native
}
object ExportApiResponse {
  
  @scala.inline
  def apply(): ExportApiResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportApiResponse]
  }
  
  @scala.inline
  implicit class ExportApiResponseMutableBuilder[Self <: ExportApiResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: ExportedApi): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
