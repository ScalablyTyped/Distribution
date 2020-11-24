package typings.antvScale

import typings.antvScale.continuousBaseMod.Continuous
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/scale/lib/continuous/log", JSImport.Namespace)
@js.native
object logMod extends js.Object {
  
  /**
    * Log 度量，处理非均匀分布
    */
  @js.native
  trait Log extends Continuous {
    
    var base: Double = js.native
    
    /* protected */ def getScalePercent(value: Double): js.Any = js.native
    
    var positiveMin: js.Any = js.native
  }
  
  /**
    * Log 度量，处理非均匀分布
    */
  @js.native
  class default () extends Log
}
