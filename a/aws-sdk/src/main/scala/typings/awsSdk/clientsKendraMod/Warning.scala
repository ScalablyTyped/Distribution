package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Warning extends StObject {
  
  /**
    * The code used to show the type of warning for the query.
    */
  var Code: js.UndefOr[WarningCode] = js.undefined
  
  /**
    * The message that explains the problem with the query.
    */
  var Message: js.UndefOr[WarningMessage] = js.undefined
}
object Warning {
  
  inline def apply(): Warning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Warning]
  }
  
  extension [Self <: Warning](x: Self) {
    
    inline def setCode(value: WarningCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: WarningMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
