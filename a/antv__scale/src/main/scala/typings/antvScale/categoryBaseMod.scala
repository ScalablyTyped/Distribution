package typings.antvScale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/scale/lib/category/base", JSImport.Namespace)
@js.native
object categoryBaseMod extends js.Object {
  
  /**
    * 分类度量
    * @class
    */
  @js.native
  trait Category
    extends typings.antvScale.baseMod.default {
    
    def getText(value: js.Any, args: js.Any*): String = js.native
    
    @JSName("isCategory")
    val isCategory_Category: Boolean = js.native
  }
  
  /**
    * 分类度量
    * @class
    */
  @js.native
  class default () extends Category
}
