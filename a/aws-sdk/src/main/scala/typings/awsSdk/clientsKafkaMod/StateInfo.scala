package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateInfo extends StObject {
  
  var Code: js.UndefOr[string] = js.undefined
  
  var Message: js.UndefOr[string] = js.undefined
}
object StateInfo {
  
  inline def apply(): StateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StateInfo]
  }
  
  extension [Self <: StateInfo](x: Self) {
    
    inline def setCode(value: string): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: string): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
