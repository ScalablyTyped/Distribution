package typings.antvScale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/scale/lib/continuous/base", JSImport.Namespace)
@js.native
object continuousBaseMod extends js.Object {
  
  @js.native
  trait Continuous
    extends typings.antvScale.baseMod.default {
    
    /* protected */ def getInvertPercent(value: js.Any): Double = js.native
    
    /* protected */ def getScalePercent(value: js.Any): Double = js.native
    
    var nice: Boolean = js.native
  }
  
  @js.native
  abstract class default () extends Continuous
}
