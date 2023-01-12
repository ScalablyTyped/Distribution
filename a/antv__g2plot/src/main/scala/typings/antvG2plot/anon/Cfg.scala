package typings.antvG2plot.anon

import typings.antvG2plot.antvG2plotStrings.dot
import typings.antvG2plot.libTypesPatternMod.DotPatternCfg
import typings.antvG2plot.libUtilsPatternMod.PatternOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cfg
  extends StObject
     with PatternOption {
  
  var cfg: js.UndefOr[DotPatternCfg] = js.undefined
  
  var `type`: dot
}
object Cfg {
  
  inline def apply(): Cfg = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("dot")
    __obj.asInstanceOf[Cfg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cfg] (val x: Self) extends AnyVal {
    
    inline def setCfg(value: DotPatternCfg): Self = StObject.set(x, "cfg", value.asInstanceOf[js.Any])
    
    inline def setCfgUndefined: Self = StObject.set(x, "cfg", js.undefined)
    
    inline def setType(value: dot): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
