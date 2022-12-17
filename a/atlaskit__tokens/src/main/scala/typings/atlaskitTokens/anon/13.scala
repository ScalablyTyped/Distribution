package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `13`[BaseToken] extends StObject {
  
  var `[default]`: PaintToken[BaseToken]
}
object `13` {
  
  inline def apply[BaseToken](`[default]`: PaintToken[BaseToken]): `13`[BaseToken] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`13`[BaseToken]]
  }
  
  extension [Self <: `13`[?], BaseToken](x: Self & `13`[BaseToken]) {
    
    inline def `set[default]`(value: PaintToken[BaseToken]): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
