package typings.awsSdk.clientsSchemasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCodeBindingSourceResponse extends StObject {
  
  var Body: js.UndefOr[typings.awsSdk.clientsSchemasMod.Body] = js.undefined
}
object GetCodeBindingSourceResponse {
  
  inline def apply(): GetCodeBindingSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCodeBindingSourceResponse]
  }
  
  extension [Self <: GetCodeBindingSourceResponse](x: Self) {
    
    inline def setBody(value: Body): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
  }
}
