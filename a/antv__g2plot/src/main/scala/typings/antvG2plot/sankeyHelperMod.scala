package typings.antvG2plot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sankeyHelperMod {
  
  @JSImport("@antv/g2plot/lib/plots/sankey/sankey/helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def constant(x: Any): js.Function0[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("constant")(x.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Any]]
  
  inline def maxValueBy(arr: Any, func: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("maxValueBy")(arr.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def minValueBy(arr: Any, func: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("minValueBy")(arr.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def sumBy(arr: Any, func: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sumBy")(arr.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Double]
}
