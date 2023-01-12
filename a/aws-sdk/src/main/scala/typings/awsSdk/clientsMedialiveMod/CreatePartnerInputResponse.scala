package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePartnerInputResponse extends StObject {
  
  var Input: js.UndefOr[typings.awsSdk.clientsMedialiveMod.Input] = js.undefined
}
object CreatePartnerInputResponse {
  
  inline def apply(): CreatePartnerInputResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePartnerInputResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatePartnerInputResponse] (val x: Self) extends AnyVal {
    
    inline def setInput(value: Input): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
  }
}
