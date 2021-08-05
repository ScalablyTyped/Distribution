package typings.antvScale

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logMod {
  
  /**
    * Log 度量，处理非均匀分布
    */
  @JSImport("@antv/scale/lib/continuous/log", JSImport.Default)
  @js.native
  class default () extends Log
  
  /**
    * Log 度量，处理非均匀分布
    */
  @js.native
  trait Log
    extends typings.antvScale.continuousBaseMod.default {
    
    var base: Double = js.native
    
    /* protected */ def getScalePercent(value: Double): js.Any = js.native
    
    /* private */ var positiveMin: js.Any = js.native
  }
}
