package typings.antvScale

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linearMod {
  
  @JSImport("@antv/scale/lib/continuous/linear", JSImport.Default)
  @js.native
  class default () extends Linear
  
  @js.native
  trait Linear
    extends typings.antvScale.continuousBaseMod.default {
    
    @JSName("isLinear")
    val isLinear_Linear: Boolean = js.native
    
    var minTickInterval: Double = js.native
  }
}
