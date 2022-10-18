package typings.ahooks

import typings.ahooks.anon.Dec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseCounterMod {
  
  @JSImport("ahooks/lib/useCounter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Tuple2[Double, Dec] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Tuple2[Double, Dec]]
  inline def default(initialValue: Double): js.Tuple2[Double, Dec] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(initialValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Double, Dec]]
  inline def default(initialValue: Double, options: Options): js.Tuple2[Double, Dec] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(initialValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Dec]]
  inline def default(initialValue: Unit, options: Options): js.Tuple2[Double, Dec] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(initialValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Dec]]
  
  @js.native
  trait Actions extends StObject {
    
    def dec(): Unit = js.native
    def dec(delta: Double): Unit = js.native
    
    def inc(): Unit = js.native
    def inc(delta: Double): Unit = js.native
    
    def reset(): Unit = js.native
    
    def set(value: js.Function1[/* c */ Double, Double]): Unit = js.native
    def set(value: Double): Unit = js.native
  }
  
  trait Options extends StObject {
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    }
  }
  
  type ValueParam = Double | (js.Function1[/* c */ Double, Double])
}
