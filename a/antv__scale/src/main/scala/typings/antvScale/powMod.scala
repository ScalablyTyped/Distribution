package typings.antvScale

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object powMod {
  
  /**
    * Pow 度量，处理非均匀分布
    */
  @JSImport("@antv/scale/lib/continuous/pow", JSImport.Default)
  @js.native
  class default () extends Pow
  
  /**
    * Pow 度量，处理非均匀分布
    */
  @js.native
  trait Pow
    extends typings.antvScale.continuousBaseMod.default {
    
    /**
      * 指数
      */
    var exponent: Double = js.native
    
    /* protected */ def getScalePercent(value: Double): Double = js.native
  }
}
