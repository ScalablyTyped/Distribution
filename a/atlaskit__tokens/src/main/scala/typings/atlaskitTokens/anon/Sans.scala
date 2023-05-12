package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesTypesMod.TypographyToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sans[BaseToken] extends StObject {
  
  var monospace: TypographyToken[BaseToken]
  
  var sans: TypographyToken[BaseToken]
}
object Sans {
  
  inline def apply[BaseToken](monospace: TypographyToken[BaseToken], sans: TypographyToken[BaseToken]): Sans[BaseToken] = {
    val __obj = js.Dynamic.literal(monospace = monospace.asInstanceOf[js.Any], sans = sans.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sans[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sans[?], BaseToken] (val x: Self & Sans[BaseToken]) extends AnyVal {
    
    inline def setMonospace(value: TypographyToken[BaseToken]): Self = StObject.set(x, "monospace", value.asInstanceOf[js.Any])
    
    inline def setSans(value: TypographyToken[BaseToken]): Self = StObject.set(x, "sans", value.asInstanceOf[js.Any])
  }
}
