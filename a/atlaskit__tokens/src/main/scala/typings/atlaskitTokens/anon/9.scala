package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9`[BaseToken] extends StObject {
  
  var `[default]`: PaintToken[BaseToken]
  
  var bold: PaintToken[BaseToken]
}
object `9` {
  
  inline def apply[BaseToken](`[default]`: PaintToken[BaseToken], bold: PaintToken[BaseToken]): `9`[BaseToken] = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`9`[BaseToken]]
  }
  
  extension [Self <: `9`[?], BaseToken](x: Self & `9`[BaseToken]) {
    
    inline def setBold(value: PaintToken[BaseToken]): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: PaintToken[BaseToken]): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
