package typings.antvScale

import typings.antvScale.linearMod.Linear
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@antv/scale/esm/continuous/time", JSImport.Namespace)
@js.native
object continuousTimeMod extends js.Object {
  /**
    * 时间度量
    * @class
    */
  @js.native
  trait Time extends Linear {
    var mask: String = js.native
    /**
      * @override
      */
    def getText(value: String): js.Any = js.native
    def getText(value: String, index: Double): js.Any = js.native
    def getText(value: Double): js.Any = js.native
    def getText(value: Double, index: Double): js.Any = js.native
    def getText(value: Date): js.Any = js.native
    def getText(value: Date, index: Double): js.Any = js.native
  }
  
  /**
    * 时间度量
    * @class
    */
  @js.native
  class default () extends Time
  
}

