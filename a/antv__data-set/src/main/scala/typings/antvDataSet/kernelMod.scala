package typings.antvDataSet

import typings.antvDataSet.antvDataSetNumbers.`0.5`
import typings.antvDataSet.antvDataSetNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/data-set/lib/util/kernel", JSImport.Namespace)
@js.native
object kernelMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def boxcar(u: Double): `0` | `0.5` = js.native
    @JSName("boxcar")
    var boxcar_Original: js.Function1[/* u */ Double, `0` | `0.5`] = js.native
    
    def cosine(u: Double): Double = js.native
    
    def epanechnikov(u: Double): Double = js.native
    
    def gaussian(u: Double): Double = js.native
    
    def quartic(u: Double): Double = js.native
    
    def triangular(u: Double): Double = js.native
    
    def tricube(u: Double): Double = js.native
    
    def triweight(u: Double): Double = js.native
    
    def uniform(u: Double): `0` | `0.5` = js.native
    @JSName("uniform")
    var uniform_Original: js.Function1[/* u */ Double, `0` | `0.5`] = js.native
  }
}
