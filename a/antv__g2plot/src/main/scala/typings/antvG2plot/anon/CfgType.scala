package typings.antvG2plot.anon

import typings.antvG2plot.antvG2plotStrings.line
import typings.antvG2plot.libTypesPatternMod.LinePatternCfg
import typings.antvG2plot.libUtilsPatternMod.PatternOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CfgType
  extends StObject
     with PatternOption {
  
  var cfg: js.UndefOr[LinePatternCfg] = js.undefined
  
  var `type`: line
}
object CfgType {
  
  inline def apply(): CfgType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("line")
    __obj.asInstanceOf[CfgType]
  }
  
  extension [Self <: CfgType](x: Self) {
    
    inline def setCfg(value: LinePatternCfg): Self = StObject.set(x, "cfg", value.asInstanceOf[js.Any])
    
    inline def setCfgUndefined: Self = StObject.set(x, "cfg", js.undefined)
    
    inline def setType(value: line): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
