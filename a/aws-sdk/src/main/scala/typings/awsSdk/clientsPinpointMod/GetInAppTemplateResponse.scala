package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInAppTemplateResponse extends StObject {
  
  var InAppTemplateResponse: typings.awsSdk.clientsPinpointMod.InAppTemplateResponse
}
object GetInAppTemplateResponse {
  
  inline def apply(InAppTemplateResponse: InAppTemplateResponse): GetInAppTemplateResponse = {
    val __obj = js.Dynamic.literal(InAppTemplateResponse = InAppTemplateResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInAppTemplateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetInAppTemplateResponse] (val x: Self) extends AnyVal {
    
    inline def setInAppTemplateResponse(value: InAppTemplateResponse): Self = StObject.set(x, "InAppTemplateResponse", value.asInstanceOf[js.Any])
  }
}
