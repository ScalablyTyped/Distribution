package typings.antvScale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@antv/scale/lib/continuous/base", JSImport.Namespace)
@js.native
object libContinuousBaseMod extends js.Object {
  @js.native
  trait Continuous
    extends typings.antvScale.libBaseMod.default {
    var nice: Boolean = js.native
    /* protected */ def getInvertPercent(value: js.Any): Double = js.native
    /* protected */ def getScalePercent(value: js.Any): Double = js.native
  }
  
  @js.native
  abstract class default () extends Continuous
  
}

