package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9`[BaseToken] extends StObject {
  
  var pressed: PaintToken[BaseToken]
  
  var resting: PaintToken[BaseToken]
}
object `9` {
  
  inline def apply[BaseToken](pressed: PaintToken[BaseToken], resting: PaintToken[BaseToken]): `9`[BaseToken] = {
    val __obj = js.Dynamic.literal(pressed = pressed.asInstanceOf[js.Any], resting = resting.asInstanceOf[js.Any])
    __obj.asInstanceOf[`9`[BaseToken]]
  }
  
  extension [Self <: `9`[?], BaseToken](x: Self & `9`[BaseToken]) {
    
    inline def setPressed(value: PaintToken[BaseToken]): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
    
    inline def setResting(value: PaintToken[BaseToken]): Self = StObject.set(x, "resting", value.asInstanceOf[js.Any])
  }
}
