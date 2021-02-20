package typings.antvAttr

import typings.antvScale.typesMod.ScaleConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfaceMod {
  
  @JSImport("@antv/attr/lib/interface", "Scale")
  @js.native
  abstract class Scale protected ()
    extends typings.antvScale.mod.Scale {
    def this(cfg: ScaleConfig) = this()
  }
  
  @js.native
  trait AttributeCfg extends StObject {
    
    val callback: js.UndefOr[CallbackType] = js.native
    
    val names: js.UndefOr[js.Array[String]] = js.native
    
    val scales: js.Array[typings.antvScale.mod.Scale] = js.native
    
    val `type`: js.UndefOr[String] = js.native
    
    val values: js.UndefOr[js.Any] = js.native
  }
  object AttributeCfg {
    
    @scala.inline
    def apply(scales: js.Array[typings.antvScale.mod.Scale]): AttributeCfg = {
      val __obj = js.Dynamic.literal(scales = scales.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeCfg]
    }
    
    @scala.inline
    implicit class AttributeCfgMutableBuilder[Self <: AttributeCfg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: /* repeated */ js.Any => js.Array[js.Any]): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
      
      @scala.inline
      def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
      
      @scala.inline
      def setScales(value: js.Array[typings.antvScale.mod.Scale]): Self = StObject.set(x, "scales", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScalesVarargs(value: typings.antvScale.mod.Scale*): Self = StObject.set(x, "scales", js.Array(value :_*))
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValues(value: js.Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
  
  type CallbackType = js.Function1[/* repeated */ js.Any, js.Array[js.Any]]
}
