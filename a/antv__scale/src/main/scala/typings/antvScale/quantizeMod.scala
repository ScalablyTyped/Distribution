package typings.antvScale

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quantizeMod {
  
  /**
    * 分段度量
    */
  @JSImport("@antv/scale/lib/continuous/quantize", JSImport.Default)
  @js.native
  class default () extends Quantize
  
  /**
    * 分段度量
    */
  @js.native
  trait Quantize
    extends typings.antvScale.continuousBaseMod.default {
    
    def invert(value: js.Any): Double = js.native
  }
}
