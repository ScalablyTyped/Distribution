package typings.angularCore.anon

import typings.angularCore.angularCoreStrings.any
import typings.angularCore.angularCoreStrings.platform
import typings.angularCore.angularCoreStrings.root
import typings.angularCore.r3SymbolsMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Token[T] extends StObject {
  
  def factory(): T
  
  var providedIn: js.UndefOr[Type[js.Any] | root | platform | any | Null] = js.undefined
  
  var token: js.Any
}
object Token {
  
  inline def apply[T](factory: () => T, token: js.Any): Token[T] = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory), token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token[T]]
  }
  
  extension [Self <: Token[?], T](x: Self & Token[T]) {
    
    inline def setFactory(value: () => T): Self = StObject.set(x, "factory", js.Any.fromFunction0(value))
    
    inline def setProvidedIn(value: Type[js.Any] | root | platform | any): Self = StObject.set(x, "providedIn", value.asInstanceOf[js.Any])
    
    inline def setProvidedInNull: Self = StObject.set(x, "providedIn", null)
    
    inline def setProvidedInUndefined: Self = StObject.set(x, "providedIn", js.undefined)
    
    inline def setToken(value: js.Any): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
