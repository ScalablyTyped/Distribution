package typings.antvG2

import typings.antvG2.libInterfaceMod.LooseObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionActionElementFilterMod {
  
  /**
    * 元素过滤的 Action，控制元素的显示隐藏
    * @ignore
    */
  @JSImport("@antv/g2/lib/interaction/action/element/filter", JSImport.Default)
  @js.native
  open class default () extends ElementFilter
  
  /**
    * 元素过滤的 Action，控制元素的显示隐藏
    * @ignore
    */
  @js.native
  trait ElementFilter
    extends typings.antvG2.libInteractionActionBaseMod.default[LooseObject] {
    
    /**
      * 清除过滤
      */
    def clear(): Unit = js.native
    
    /**
      * 过滤
      */
    def filter(): Unit = js.native
    
    /**
      * 恢复发生的过滤，保持同 data-filter 命名的一致
      */
    def reset(): Unit = js.native
  }
}
