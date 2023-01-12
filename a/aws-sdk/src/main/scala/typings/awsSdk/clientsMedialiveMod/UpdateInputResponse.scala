package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateInputResponse extends StObject {
  
  var Input: js.UndefOr[typings.awsSdk.clientsMedialiveMod.Input] = js.undefined
}
object UpdateInputResponse {
  
  inline def apply(): UpdateInputResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateInputResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateInputResponse] (val x: Self) extends AnyVal {
    
    inline def setInput(value: Input): Self = StObject.set(x, "Input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "Input", js.undefined)
  }
}
