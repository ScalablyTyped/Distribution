package typings.antvDataSet

import typings.antvDataSet.antvDataSetNumbers.`0.5`
import typings.antvDataSet.antvDataSetNumbers.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kernelMod {
  
  object default {
    
    @JSImport("@antv/data-set/lib/util/kernel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/data-set/lib/util/kernel", "default.boxcar")
    @js.native
    def boxcar: js.Function1[/* u */ Double, `0` | `0.5`] = js.native
    @JSImport("@antv/data-set/lib/util/kernel", "default.boxcar")
    @js.native
    def boxcar(u: Double): `0` | `0.5` = js.native
    @scala.inline
    def boxcar_=(x: js.Function1[/* u */ Double, `0` | `0.5`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("boxcar")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/data-set/lib/util/kernel", "default.cosine")
    @js.native
    def cosine(u: Double): Double = js.native
    
    @JSImport("@antv/data-set/lib/util/kernel", "default.epanechnikov")
    @js.native
    def epanechnikov(u: Double): Double = js.native
    
    @JSImport("@antv/data-set/lib/util/kernel", "default.gaussian")
    @js.native
    def gaussian(u: Double): Double = js.native
    
    @JSImport("@antv/data-set/lib/util/kernel", "default.quartic")
    @js.native
    def quartic(u: Double): Double = js.native
    
    @JSImport("@antv/data-set/lib/util/kernel", "default.triangular")
    @js.native
    def triangular(u: Double): Double = js.native
    
    @JSImport("@antv/data-set/lib/util/kernel", "default.tricube")
    @js.native
    def tricube(u: Double): Double = js.native
    
    @JSImport("@antv/data-set/lib/util/kernel", "default.triweight")
    @js.native
    def triweight(u: Double): Double = js.native
    
    @JSImport("@antv/data-set/lib/util/kernel", "default.uniform")
    @js.native
    def uniform: js.Function1[/* u */ Double, `0` | `0.5`] = js.native
    @JSImport("@antv/data-set/lib/util/kernel", "default.uniform")
    @js.native
    def uniform(u: Double): `0` | `0.5` = js.native
    @scala.inline
    def uniform_=(x: js.Function1[/* u */ Double, `0` | `0.5`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("uniform")(x.asInstanceOf[js.Any])
  }
}
