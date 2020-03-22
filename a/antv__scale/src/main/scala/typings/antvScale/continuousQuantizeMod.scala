package typings.antvScale

import typings.antvScale.libContinuousBaseMod.Continuous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@antv/scale/lib/continuous/quantize", JSImport.Namespace)
@js.native
object continuousQuantizeMod extends js.Object {
  /**
    * 分段度量
    */
  @js.native
  trait Quantize extends Continuous {
    def invert(value: js.Any): Double = js.native
  }
  
  /**
    * 分段度量
    */
  @js.native
  class default () extends Quantize
  
}

