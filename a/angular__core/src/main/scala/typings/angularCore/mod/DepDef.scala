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
  
  @scala.inline
  def apply(flags: ɵDepFlags, token: js.Any, tokenKey: String): DepDef = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], tokenKey = tokenKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepDef]
  }
  
  @scala.inline
  implicit class DepDefMutableBuilder[Self <: DepDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFlags(value: ɵDepFlags): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToken(value: js.Any): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenKey(value: String): Self = StObject.set(x, "tokenKey", value.asInstanceOf[js.Any])
  }
}
