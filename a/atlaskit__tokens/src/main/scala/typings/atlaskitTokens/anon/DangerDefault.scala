package typings.atlaskitTokens.anon

import typings.atlaskitTokens.distTypesTypesMod.PaintToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DangerDefault[BaseToken] extends StObject {
  
  var `[default]`: PaintToken[BaseToken]
  
  var danger: PaintToken[BaseToken]
  
  var selected: PaintToken[BaseToken]
}
object DangerDefault {
  
  inline def apply[BaseToken](`[default]`: PaintToken[BaseToken], danger: PaintToken[BaseToken], selected: PaintToken[BaseToken]): DangerDefault[BaseToken] = {
    val __obj = js.Dynamic.literal(danger = danger.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.updateDynamic("[default]")(`[default]`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DangerDefault[BaseToken]]
  }
  
  extension [Self <: DangerDefault[?], BaseToken](x: Self & DangerDefault[BaseToken]) {
    
    inline def setDanger(value: PaintToken[BaseToken]): Self = StObject.set(x, "danger", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: PaintToken[BaseToken]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def `set[default]`(value: PaintToken[BaseToken]): Self = StObject.set(x, "[default]", value.asInstanceOf[js.Any])
  }
}
