package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLodashThrottleMod {
  
  @JSImport("@antv/util/lib/lodash/throttle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(func: js.Function, wait: Double, options: OptionsType): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  trait OptionsType extends StObject {
    
    var leading: js.UndefOr[Boolean] = js.undefined
    
    var trailing: js.UndefOr[Boolean] = js.undefined
  }
  object OptionsType {
    
    inline def apply(): OptionsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsType]
    }
    
    extension [Self <: OptionsType](x: Self) {
      
      inline def setLeading(value: Boolean): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      inline def setLeadingUndefined: Self = StObject.set(x, "leading", js.undefined)
      
      inline def setTrailing(value: Boolean): Self = StObject.set(x, "trailing", value.asInstanceOf[js.Any])
      
      inline def setTrailingUndefined: Self = StObject.set(x, "trailing", js.undefined)
    }
  }
}
