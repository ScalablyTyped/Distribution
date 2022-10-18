package typings.antvG2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionActionComponentListActiveMod {
  
  /**
    * 列表项（图例项、坐标轴文本）激活的 Action
    * @class
    * @ignore
    */
  @JSImport("@antv/g2/lib/interaction/action/component/list-active", JSImport.Default)
  @js.native
  open class default () extends ListActive
  
  /**
    * 列表项（图例项、坐标轴文本）激活的 Action
    * @class
    * @ignore
    */
  @js.native
  trait ListActive
    extends typings.antvG2.libInteractionActionComponentListStateMod.default {
    
    /**
      * 激活选项
      */
    def active(): Unit = js.native
  }
}
