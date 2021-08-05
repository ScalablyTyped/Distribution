package typings.antvAttr

import typings.antvScale.typesMod.ScaleConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceMod {
  
  @JSImport("@antv/attr/lib/interface", "Scale")
  @js.native
  abstract class Scale protected ()
    extends typings.antvScale.mod.Scale {
    def this(cfg: ScaleConfig) = this()
  }
  
  trait AttributeCfg extends StObject {
    
    val callback: js.UndefOr[CallbackType] = js.undefined
    
    val names: js.UndefOr[js.Array[String]] = js.undefined
    
    val scales: js.Array[typings.antvScale.mod.Scale]
    
    val `type`: js.UndefOr[String] = js.undefined
    
    val values: js.UndefOr[js.Any] = js.undefined
  }
  object AttributeCfg {
    
    inline def apply(scales: js.Array[typings.antvScale.mod.Scale]): AttributeCfg = {
      val __obj = js.Dynamic.literal(scales = scales.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeCfg]
    }
    
    extension [Self <: AttributeCfg](x: Self) {
      
      inline def setCallback(value: CallbackType): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
      
      inline def setScales(value: js.Array[typings.antvScale.mod.Scale]): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
      
      inline def setScalesVarargs(value: typings.antvScale.mod.Scale*): Self = StObject.set(x, "scales", js.Array(value :_*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValues(value: js.Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
  
  @js.native
  trait CallbackType extends StObject {
    
    def apply(args: js.Any*): js.Array[js.Any] = js.native
  }
}
