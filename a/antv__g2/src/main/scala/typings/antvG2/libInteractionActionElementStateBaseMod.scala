package typings.antvG2

import typings.antvG2.libInterfaceMod.LooseObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionActionElementStateBaseMod {
  
  /**
    * 状态量 Action 的基类
    * @abstract
    * @class
    * @ignore
    */
  /* note: abstract class */ @JSImport("@antv/g2/lib/interaction/action/element/state-base", JSImport.Default)
  @js.native
  open class default () extends StateBase
  
  /**
    * 状态量 Action 的基类
    * @abstract
    * @class
    * @ignore
    */
  @js.native
  trait StateBase
    extends typings.antvG2.libInteractionActionBaseMod.default[LooseObject] {
    
    /**
      * 清除所有 Element 的状态
      */
    def clear(): Unit = js.native
    
    /* protected */ def clearViewState(view: Any): Unit = js.native
    
    /**
      * 是否具有某个状态
      * @param element 图表 Element 元素
      */
    /* protected */ def hasState(element: typings.antvG2.libGeometryElementMod.default): Boolean = js.native
    
    /**
      * 设置状态激活
      * @param enable 状态值
      */
    /* protected */ def setElementState(element: typings.antvG2.libGeometryElementMod.default, enable: Boolean): Unit = js.native
    
    /**
      * 设置状态
      */
    def setState(): Unit = js.native
    
    /**
      * 设置状态是否激活
      * @param enable 状态值
      */
    /* protected */ def setStateEnable(enable: Boolean): Any = js.native
    
    /**
      * 状态名称
      */
    /* protected */ var stateName: String = js.native
  }
}
