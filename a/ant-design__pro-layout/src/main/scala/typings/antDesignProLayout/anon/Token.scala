package typings.antDesignProLayout.anon

import typings.antDesignProProvider.esTypingLayoutTokenMod.DeepPartial
import typings.antDesignProProvider.esTypingLayoutTokenMod.LayoutDesignToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Token extends StObject {
  
  var token: js.UndefOr[DeepPartial[LayoutDesignToken]] = js.undefined
}
object Token {
  
  inline def apply(): Token = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Token]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
    
    inline def setToken(value: DeepPartial[LayoutDesignToken]): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
