package typings.antvScale

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeMod {
  
  /**
    * 时间分类度量
    * @class
    */
  @JSImport("@antv/scale/lib/category/time", JSImport.Default)
  @js.native
  class default () extends TimeCat
  
  /**
    * 时间分类度量
    * @class
    */
  @js.native
  trait TimeCat
    extends typings.antvScale.categoryBaseMod.default {
    
    /**
      * 由于时间类型数据需要转换一下，所以复写 getText
      * @override
      */
    def getText(value: String): js.Any = js.native
    def getText(value: String, tickIndex: Double): js.Any = js.native
    def getText(value: Double): js.Any = js.native
    def getText(value: Double, tickIndex: Double): js.Any = js.native
    
    var mask: js.Any = js.native
  }
}
