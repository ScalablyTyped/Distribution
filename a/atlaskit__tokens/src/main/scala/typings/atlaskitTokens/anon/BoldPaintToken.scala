package typings.atlaskitTokens.anon

import typings.atlaskitTokens.palettesPaletteMod.BaseToken
import typings.atlaskitTokens.typesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoldPaintToken extends StObject {
  
  var `[default]`: PaintToken[BaseToken]
  
  var bold: PaintToken[BaseToken]
}
object BoldPaintToken {
  
  inline def apply(`[default]`: PaintToken[BaseToken], bold: PaintToken[BaseToken]): BoldPaintToken = {
    val __obj = js.Dynamic.literal(bold = bold.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoldPaintToken]
  }
  
  extension [Self <: BoldPaintToken](x: Self) {
    
    inline def setBold(value: PaintToken[BaseToken]): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: PaintToken[BaseToken]): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
