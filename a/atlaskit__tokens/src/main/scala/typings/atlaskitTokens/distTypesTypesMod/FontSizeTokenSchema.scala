package typings.atlaskitTokens.distTypesTypesMod

import typings.atlaskitTokens.anon.Size300
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontSizeTokenSchema[BaseToken] extends StObject {
  
  var font: Size300[BaseToken]
}
object FontSizeTokenSchema {
  
  inline def apply[BaseToken](font: Size300[BaseToken]): FontSizeTokenSchema[BaseToken] = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSizeTokenSchema[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontSizeTokenSchema[?], BaseToken] (val x: Self & FontSizeTokenSchema[BaseToken]) extends AnyVal {
    
    inline def setFont(value: Size300[BaseToken]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
  }
}
