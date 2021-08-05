package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetModelTemplateResponse extends StObject {
  
  /**
    * The template value.
    */
  var Value: js.UndefOr[string] = js.undefined
}
object GetModelTemplateResponse {
  
  inline def apply(): GetModelTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetModelTemplateResponse]
  }
  
  extension [Self <: GetModelTemplateResponse](x: Self) {
    
    inline def setValue(value: string): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
