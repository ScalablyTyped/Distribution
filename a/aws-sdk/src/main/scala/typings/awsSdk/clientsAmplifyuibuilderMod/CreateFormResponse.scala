package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFormResponse extends StObject {
  
  /**
    * Describes the configuration of the new form.
    */
  var entity: js.UndefOr[Form] = js.undefined
}
object CreateFormResponse {
  
  inline def apply(): CreateFormResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFormResponse]
  }
  
  extension [Self <: CreateFormResponse](x: Self) {
    
    inline def setEntity(value: Form): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
  }
}
