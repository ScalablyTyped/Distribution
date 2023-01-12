package typings.antvComponent.anon

import typings.antvComponent.libTypesMod.AxisLabelAutoHideCfg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cfg extends StObject {
  
  var cfg: js.UndefOr[AxisLabelAutoHideCfg] = js.undefined
  
  var `type`: String
}
object Cfg {
  
  inline def apply(`type`: String): Cfg = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cfg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cfg] (val x: Self) extends AnyVal {
    
    inline def setCfg(value: AxisLabelAutoHideCfg): Self = StObject.set(x, "cfg", value.asInstanceOf[js.Any])
    
    inline def setCfgUndefined: Self = StObject.set(x, "cfg", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
