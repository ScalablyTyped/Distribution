package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetModelTemplateResponse extends StObject {
  
  /**
    * The template value.
    */
  var Value: js.UndefOr[string] = js.native
}
object GetModelTemplateResponse {
  
  @scala.inline
  def apply(): GetModelTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetModelTemplateResponse]
  }
  
  @scala.inline
  implicit class GetModelTemplateResponseMutableBuilder[Self <: GetModelTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: string): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
