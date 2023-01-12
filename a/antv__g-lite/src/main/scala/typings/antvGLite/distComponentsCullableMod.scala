package typings.antvGLite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsCullableMod {
  
  @js.native
  sealed trait Strategy extends StObject
  @JSImport("@antv/g-lite/dist/components/Cullable", "Strategy")
  @js.native
  object Strategy extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Strategy & Double] = js.native
    
    @js.native
    sealed trait Standard
      extends StObject
         with Strategy
    /* 0 */ val Standard: typings.antvGLite.distComponentsCullableMod.Strategy.Standard & Double = js.native
  }
  
  trait Cullable extends StObject {
    
    var enable: Boolean
    
    var strategy: Strategy
    
    var visibilityPlaneMask: Double
    
    var visible: Boolean
  }
  object Cullable {
    
    inline def apply(enable: Boolean, strategy: Strategy, visibilityPlaneMask: Double, visible: Boolean): Cullable = {
      val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], strategy = strategy.asInstanceOf[js.Any], visibilityPlaneMask = visibilityPlaneMask.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cullable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cullable] (val x: Self) extends AnyVal {
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setStrategy(value: Strategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setVisibilityPlaneMask(value: Double): Self = StObject.set(x, "visibilityPlaneMask", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
