package typings.antvG2plot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLabMod {
  
  @JSImport("@antv/g2plot/lib/lab", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@antv/g2plot/lib/lab", "Lab")
  @js.native
  open class Lab () extends StObject
  
  @js.native
  sealed trait Stage extends StObject
  @JSImport("@antv/g2plot/lib/lab", "Stage")
  @js.native
  object Stage extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Stage & String] = js.native
    
    @js.native
    sealed trait BETA
      extends StObject
         with Stage
    /* "BETA" */ val BETA: typings.antvG2plot.libLabMod.Stage.BETA & String = js.native
    
    @js.native
    sealed trait DEV
      extends StObject
         with Stage
    /* "DEV" */ val DEV: typings.antvG2plot.libLabMod.Stage.DEV & String = js.native
    
    @js.native
    sealed trait STABLE
      extends StObject
         with Stage
    /* "STABLE" */ val STABLE: typings.antvG2plot.libLabMod.Stage.STABLE & String = js.native
  }
  
  inline def notice(stage: Stage, plotType: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notice")(stage.asInstanceOf[js.Any], plotType.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
