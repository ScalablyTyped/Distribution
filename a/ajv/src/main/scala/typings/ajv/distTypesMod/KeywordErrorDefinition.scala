package typings.ajv.distTypesMod

import typings.ajv.codeMod.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeywordErrorDefinition extends StObject {
  
  var message: String | Code | (js.Function1[/* cxt */ KeywordErrorCxt, String | Code])
  
  var params: js.UndefOr[Code | (js.Function1[/* cxt */ KeywordErrorCxt, Code])] = js.undefined
}
object KeywordErrorDefinition {
  
  inline def apply(message: String | Code | (js.Function1[/* cxt */ KeywordErrorCxt, String | Code])): KeywordErrorDefinition = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeywordErrorDefinition]
  }
  
  extension [Self <: KeywordErrorDefinition](x: Self) {
    
    inline def setMessage(value: String | Code | (js.Function1[/* cxt */ KeywordErrorCxt, String | Code])): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageFunction1(value: /* cxt */ KeywordErrorCxt => String | Code): Self = StObject.set(x, "message", js.Any.fromFunction1(value))
    
    inline def setParams(value: Code | (js.Function1[/* cxt */ KeywordErrorCxt, Code])): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsFunction1(value: /* cxt */ KeywordErrorCxt => Code): Self = StObject.set(x, "params", js.Any.fromFunction1(value))
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
  }
}
