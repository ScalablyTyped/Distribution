package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTemplateVersionsResponse extends StObject {
  
  var TemplateVersionsResponse: typings.awsSdk.clientsPinpointMod.TemplateVersionsResponse
}
object ListTemplateVersionsResponse {
  
  inline def apply(TemplateVersionsResponse: TemplateVersionsResponse): ListTemplateVersionsResponse = {
    val __obj = js.Dynamic.literal(TemplateVersionsResponse = TemplateVersionsResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTemplateVersionsResponse]
  }
  
  extension [Self <: ListTemplateVersionsResponse](x: Self) {
    
    inline def setTemplateVersionsResponse(value: TemplateVersionsResponse): Self = StObject.set(x, "TemplateVersionsResponse", value.asInstanceOf[js.Any])
  }
}
