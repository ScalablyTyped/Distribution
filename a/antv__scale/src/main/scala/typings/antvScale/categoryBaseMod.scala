package typings.antvScale

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object categoryBaseMod {
  
  /**
    * 分类度量
    * @class
    */
  @JSImport("@antv/scale/lib/category/base", JSImport.Default)
  @js.native
  class default () extends Category
  
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
}
