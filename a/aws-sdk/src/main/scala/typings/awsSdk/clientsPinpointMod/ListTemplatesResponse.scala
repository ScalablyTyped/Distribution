package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTemplatesResponse extends StObject {
  
  var TemplatesResponse: typings.awsSdk.clientsPinpointMod.TemplatesResponse
}
object ListTemplatesResponse {
  
  inline def apply(TemplatesResponse: TemplatesResponse): ListTemplatesResponse = {
    val __obj = js.Dynamic.literal(TemplatesResponse = TemplatesResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTemplatesResponse]
  }
  
  extension [Self <: ListTemplatesResponse](x: Self) {
    
    inline def setTemplatesResponse(value: TemplatesResponse): Self = StObject.set(x, "TemplatesResponse", value.asInstanceOf[js.Any])
  }
}
