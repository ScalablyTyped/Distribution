package typings.awsSdk.clientsApigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportApiResponse extends StObject {
  
  var body: js.UndefOr[ExportedApi] = js.undefined
}
object ExportApiResponse {
  
  inline def apply(): ExportApiResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportApiResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportApiResponse] (val x: Self) extends AnyVal {
    
    inline def setBody(value: ExportedApi): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
