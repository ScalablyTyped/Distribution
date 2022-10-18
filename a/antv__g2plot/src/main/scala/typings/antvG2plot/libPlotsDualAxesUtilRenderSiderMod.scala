package typings.antvG2plot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsDualAxesUtilRenderSiderMod {
  
  @JSImport("@antv/g2plot/lib/plots/dual-axes/util/render-sider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def doSliderFilter(
    view: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify View */ Any,
    sliderValue: js.Tuple2[Double, Double]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("doSliderFilter")(view.asInstanceOf[js.Any], sliderValue.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
