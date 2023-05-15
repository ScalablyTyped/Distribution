package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `19`[BaseToken] extends StObject {
  
  var `[default]`: PaintToken[BaseToken]
  
  var pressed: PaintToken[BaseToken]
}
object `19` {
  
  inline def apply[BaseToken](`[default]`: PaintToken[BaseToken], pressed: PaintToken[BaseToken]): `19`[BaseToken] = {
    val __obj = js.Dynamic.literal(pressed = pressed.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`19`[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `19`[?], BaseToken] (val x: Self & `19`[BaseToken]) extends AnyVal {
    
    inline def setPressed(value: PaintToken[BaseToken]): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: PaintToken[BaseToken]): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
