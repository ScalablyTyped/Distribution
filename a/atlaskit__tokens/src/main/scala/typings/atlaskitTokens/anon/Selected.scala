package typings.atlaskitTokens.anon

import typings.atlaskitTokens.palettesLegacyPaletteMod.BaseToken
import typings.atlaskitTokens.typesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Selected extends StObject {
  
  var `[default]`: PaintToken[BaseToken]
  
  var danger: PaintToken[BaseToken]
  
  var selected: PaintToken[BaseToken]
}
object Selected {
  
  inline def apply(`[default]`: PaintToken[BaseToken], danger: PaintToken[BaseToken], selected: PaintToken[BaseToken]): Selected = {
    val __obj = js.Dynamic.literal(danger = danger.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selected]
  }
  
  extension [Self <: Selected](x: Self) {
    
    inline def setDanger(value: PaintToken[BaseToken]): Self = StObject.set(x, "danger", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: PaintToken[BaseToken]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: PaintToken[BaseToken]): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
