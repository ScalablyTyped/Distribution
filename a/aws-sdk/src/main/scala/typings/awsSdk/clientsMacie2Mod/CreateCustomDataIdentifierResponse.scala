package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomDataIdentifierResponse extends StObject {
  
  /**
    * The unique identifier for the custom data identifier that was created.
    */
  var customDataIdentifierId: js.UndefOr[string] = js.undefined
}
object CreateCustomDataIdentifierResponse {
  
  inline def apply(): CreateCustomDataIdentifierResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCustomDataIdentifierResponse]
  }
  
  extension [Self <: CreateCustomDataIdentifierResponse](x: Self) {
    
    inline def setCustomDataIdentifierId(value: string): Self = StObject.set(x, "customDataIdentifierId", value.asInstanceOf[js.Any])
    
    inline def setCustomDataIdentifierIdUndefined: Self = StObject.set(x, "customDataIdentifierId", js.undefined)
  }
}
