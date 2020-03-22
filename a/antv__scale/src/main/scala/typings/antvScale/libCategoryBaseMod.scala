package typings.antvScale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@antv/scale/lib/category/base", JSImport.Namespace)
@js.native
object libCategoryBaseMod extends js.Object {
  /**
    * 分类度量
    * @class
    */
  @js.native
  trait Category
    extends typings.antvScale.libBaseMod.default {
    @JSName("isCategory")
    val isCategory_Category: Boolean = js.native
    def getText(value: js.Any, args: js.Any*): String = js.native
  }
  
  /**
    * 分类度量
    * @class
    */
  @js.native
  class default () extends Category
  
}

