package typings.angularCore.anon

import typings.angularCore.angularCoreStrings.any
import typings.angularCore.angularCoreStrings.platform
import typings.angularCore.angularCoreStrings.root
import typings.angularCore.r3SymbolsMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Token[T] extends StObject {
  
  def factory(): T = js.native
  
  var providedIn: js.UndefOr[Type[_] | root | platform | any | Null] = js.native
  
  var token: js.Any = js.native
}
object Token {
  
  @scala.inline
  def apply[T](factory: () => T, token: js.Any): Token[T] = {
    val __obj = js.Dynamic.literal(factory = js.Any.fromFunction0(factory), token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token[T]]
  }
  
  @scala.inline
  implicit class TokenMutableBuilder[Self <: Token[_], T] (val x: Self with Token[T]) extends AnyVal {
    
    @scala.inline
    def setFactory(value: () => T): Self = StObject.set(x, "factory", js.Any.fromFunction0(value))
    
    @scala.inline
    def setProvidedIn(value: Type[_] | root | platform | any): Self = StObject.set(x, "providedIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidedInNull: Self = StObject.set(x, "providedIn", null)
    
    @scala.inline
    def setProvidedInUndefined: Self = StObject.set(x, "providedIn", js.undefined)
    
    @scala.inline
    def setToken(value: js.Any): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
