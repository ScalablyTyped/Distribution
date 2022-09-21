package typings.atlaskitTokens.anon

import typings.atlaskitTokens.palettesPaletteMod.BaseToken
import typings.atlaskitTokens.typesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultSubtle extends StObject {
  
  var `[default]`: PaintToken[BaseToken]
  
  var subtle: PaintToken[BaseToken]
}
object DefaultSubtle {
  
  inline def apply(`[default]`: PaintToken[BaseToken], subtle: PaintToken[BaseToken]): DefaultSubtle = {
    val __obj = js.Dynamic.literal(subtle = subtle.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultSubtle]
  }
  
  extension [Self <: DefaultSubtle](x: Self) {
    
    inline def setSubtle(value: PaintToken[BaseToken]): Self = StObject.set(x, "subtle", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: PaintToken[BaseToken]): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
