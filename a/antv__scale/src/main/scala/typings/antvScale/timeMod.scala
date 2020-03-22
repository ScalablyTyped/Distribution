package typings.antvScale

import typings.antvScale.categoryBaseMod.Category
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@antv/scale/esm/category/time", JSImport.Namespace)
@js.native
object timeMod extends js.Object {
  /**
    * 时间分类度量
    * @class
    */
  @js.native
  trait TimeCat extends Category {
    var mask: js.Any = js.native
    /**
      * 由于时间类型数据需要转换一下，所以复写 getText
      * @override
      */
    def getText(value: String): js.Any = js.native
    def getText(value: String, tickIndex: Double): js.Any = js.native
    def getText(value: Double): js.Any = js.native
    def getText(value: Double, tickIndex: Double): js.Any = js.native
  }
  
  /**
    * 时间分类度量
    * @class
    */
  @js.native
  class default () extends TimeCat
  
}

