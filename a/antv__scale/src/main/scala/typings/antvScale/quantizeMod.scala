package typings.antvScale

import typings.antvScale.continuousBaseMod.Continuous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/scale/lib/continuous/quantize", JSImport.Namespace)
@js.native
object quantizeMod extends js.Object {
  
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
