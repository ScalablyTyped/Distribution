package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFormResponse extends StObject {
  
  /**
    * Represents the configuration settings for the form.
    */
  var form: js.UndefOr[Form] = js.undefined
}
object GetFormResponse {
  
  inline def apply(): GetFormResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFormResponse]
  }
  
  extension [Self <: GetFormResponse](x: Self) {
    
    inline def setForm(value: Form): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
  }
}
