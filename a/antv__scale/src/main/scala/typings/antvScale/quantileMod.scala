package typings.antvScale

import typings.antvScale.thresholdMod.Threshold
import typings.antvScale.typesMod.QuantileOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quantileMod {
  
  @JSImport("@antv/scale/lib/scales/quantile", "Quantile")
  @js.native
  open class Quantile () extends Threshold[QuantileOptions] {
    def this(options: QuantileOptions) = this()
    
    def getThresholds(): js.Array[Double] = js.native
    
    def getTicks(): js.Array[Double] = js.native
  }
}
