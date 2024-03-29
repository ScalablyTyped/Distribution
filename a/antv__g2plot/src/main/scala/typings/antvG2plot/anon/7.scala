package typings.antvG2plot.anon

import typings.antvG2plot.antvG2plotStrings.square
import typings.antvG2plot.libTypesPatternMod.SquarePatternCfg
import typings.antvG2plot.libUtilsPatternMod.PatternOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7`
  extends StObject
     with PatternOption {
  
  var cfg: js.UndefOr[SquarePatternCfg] = js.undefined
  
  var `type`: square
}
object `7` {
  
  inline def apply(): `7` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("square")
    __obj.asInstanceOf[`7`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `7`] (val x: Self) extends AnyVal {
    
    inline def setCfg(value: SquarePatternCfg): Self = StObject.set(x, "cfg", value.asInstanceOf[js.Any])
    
    inline def setCfgUndefined: Self = StObject.set(x, "cfg", js.undefined)
    
    inline def setType(value: square): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
