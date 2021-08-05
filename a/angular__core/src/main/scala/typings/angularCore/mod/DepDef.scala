package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DepDef extends StObject {
  
  var flags: ɵDepFlags
  
  var token: js.Any
  
  var tokenKey: String
}
object DepDef {
  
  inline def apply(flags: ɵDepFlags, token: js.Any, tokenKey: String): DepDef = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], tokenKey = tokenKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepDef]
  }
  
  extension [Self <: DepDef](x: Self) {
    
    inline def setFlags(value: ɵDepFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setToken(value: js.Any): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenKey(value: String): Self = StObject.set(x, "tokenKey", value.asInstanceOf[js.Any])
  }
}
