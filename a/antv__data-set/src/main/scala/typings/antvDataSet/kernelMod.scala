package typings.antvDataSet

import typings.antvDataSet.antvDataSetNumbers.`0.5`
import typings.antvDataSet.antvDataSetNumbers.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kernelMod {
  
  object default {
    
    @JSImport("@antv/data-set/lib/util/kernel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/data-set/lib/util/kernel", "default.boxcar")
    @js.native
    def boxcar: js.Function1[/* u */ Double, `0` | `0.5`] = js.native
    inline def boxcar(u: Double): `0` | `0.5` = ^.asInstanceOf[js.Dynamic].applyDynamic("boxcar")(u.asInstanceOf[js.Any]).asInstanceOf[`0` | `0.5`]
    inline def boxcar_=(x: js.Function1[/* u */ Double, `0` | `0.5`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("boxcar")(x.asInstanceOf[js.Any])
    
    inline def cosine(u: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("cosine")(u.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def epanechnikov(u: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("epanechnikov")(u.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def gaussian(u: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("gaussian")(u.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def quartic(u: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("quartic")(u.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def triangular(u: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("triangular")(u.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def tricube(u: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("tricube")(u.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    inline def triweight(u: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("triweight")(u.asInstanceOf[js.Any]).asInstanceOf[Double]
    
    @JSImport("@antv/data-set/lib/util/kernel", "default.uniform")
    @js.native
    def uniform: js.Function1[/* u */ Double, `0` | `0.5`] = js.native
    inline def uniform(u: Double): `0` | `0.5` = ^.asInstanceOf[js.Dynamic].applyDynamic("uniform")(u.asInstanceOf[js.Any]).asInstanceOf[`0` | `0.5`]
    inline def uniform_=(x: js.Function1[/* u */ Double, `0` | `0.5`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uniform")(x.asInstanceOf[js.Any])
  }
}
