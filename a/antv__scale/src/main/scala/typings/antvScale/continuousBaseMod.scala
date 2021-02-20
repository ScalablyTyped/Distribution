package typings.antvScale

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object continuousBaseMod {
  
  @JSImport("@antv/scale/lib/continuous/base", JSImport.Default)
  @js.native
  abstract class default () extends Continuous
  
  @js.native
  trait Continuous
    extends typings.antvScale.baseMod.default {
    
    /* protected */ def getInvertPercent(value: js.Any): Double = js.native
    
    /* protected */ def getScalePercent(value: js.Any): Double = js.native
    
    var nice: Boolean = js.native
  }
}
