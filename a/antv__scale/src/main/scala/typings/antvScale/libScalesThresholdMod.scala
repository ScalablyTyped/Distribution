package typings.antvScale

import typings.antvScale.libScalesBaseMod.Base
import typings.antvScale.libTypesMod.ThresholdOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libScalesThresholdMod {
  
  @JSImport("@antv/scale/lib/scales/threshold", "Threshold")
  @js.native
  open class Threshold[O /* <: ThresholdOptions */] () extends Base[O] {
    def this(options: ThresholdOptions) = this()
    
    /** threshold 的数量 */
    /* protected */ var n: Double = js.native
    
    /* protected */ var thresholds: js.Array[Double] = js.native
  }
}
