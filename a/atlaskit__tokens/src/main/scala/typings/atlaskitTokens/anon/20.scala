package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `20`[BaseToken] extends StObject {
  
  var `[default]`: PaintToken[BaseToken]
  
  var hovered: PaintToken[BaseToken]
}
object `20` {
  
  inline def apply[BaseToken](`[default]`: PaintToken[BaseToken], hovered: PaintToken[BaseToken]): `20`[BaseToken] = {
    val __obj = js.Dynamic.literal(hovered = hovered.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`20`[BaseToken]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `20`[?], BaseToken] (val x: Self & `20`[BaseToken]) extends AnyVal {
    
    inline def setHovered(value: PaintToken[BaseToken]): Self = StObject.set(x, "hovered", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: PaintToken[BaseToken]): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
