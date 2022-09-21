package typings.antvG2plot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressConstantsMod {
  
  @JSImport("@antv/g2plot/lib/plots/progress/constants", "DEFAULT_COLOR")
  @js.native
  val DEFAULT_COLOR: js.Array[String] = js.native
  
  object DEFAULT_OPTIONS {
    
    @JSImport("@antv/g2plot/lib/plots/progress/constants", "DEFAULT_OPTIONS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g2plot/lib/plots/progress/constants", "DEFAULT_OPTIONS.color")
    @js.native
    def color: js.Array[String] = js.native
    inline def color_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("color")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/progress/constants", "DEFAULT_OPTIONS.percent")
    @js.native
    def percent: Double = js.native
    inline def percent_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("percent")(x.asInstanceOf[js.Any])
  }
}
