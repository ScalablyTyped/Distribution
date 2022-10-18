package typings.antvG2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionActionComponentListCheckedMod {
  
  /**
    * checked Action
    * 提供三个对外方法
    * 1. toggle 切换状态
    * 2. checked 选中
    * 3. reset 清除重置
    */
  @JSImport("@antv/g2/lib/interaction/action/component/list-checked", JSImport.Default)
  @js.native
  open class default () extends ListChecked
  
  /**
    * checked Action
    * 提供三个对外方法
    * 1. toggle 切换状态
    * 2. checked 选中
    * 3. reset 清除重置
    */
  @js.native
  trait ListChecked
    extends typings.antvG2.libInteractionActionComponentListStateMod.default {
    
    /**
      * checked 图例项
      */
    def checked(): Unit = js.native
    
    /* private */ var setCheckedBy: Any = js.native
  }
}
