package typings.ahooks

import typings.ahooks.domTargetMod.BasicTarget
import typings.ahooks.domTargetMod.TargetValue
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useInViewportMod {
  
  @JSImport("ahooks/lib/useInViewport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(target: BasicTarget[Element]): js.Tuple2[js.UndefOr[Boolean], js.UndefOr[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[js.UndefOr[Boolean], js.UndefOr[Double]]]
  inline def default(target: BasicTarget[Element], options: Options): js.Tuple2[js.UndefOr[Boolean], js.UndefOr[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.UndefOr[Boolean], js.UndefOr[Double]]]
  
  trait Options extends StObject {
    
    var root: js.UndefOr[BasicTarget[Element]] = js.undefined
    
    var rootMargin: js.UndefOr[String] = js.undefined
    
    var threshold: js.UndefOr[Double | js.Array[Double]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setRoot(value: BasicTarget[Element]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootFunction0(value: () => TargetValue[Element]): Self = StObject.set(x, "root", js.Any.fromFunction0(value))
      
      inline def setRootMargin(value: String): Self = StObject.set(x, "rootMargin", value.asInstanceOf[js.Any])
      
      inline def setRootMarginUndefined: Self = StObject.set(x, "rootMargin", js.undefined)
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setThreshold(value: Double | js.Array[Double]): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      inline def setThresholdVarargs(value: Double*): Self = StObject.set(x, "threshold", js.Array(value*))
    }
  }
}
