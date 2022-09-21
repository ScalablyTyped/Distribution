package typings.antvG2

import org.scalablytyped.runtime.Instantiable1
import typings.antvG2.libInterfaceMod.ComponentOption
import typings.antvG2.viewMod.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controllerBaseMod {
  
  @JSImport("@antv/g2/lib/chart/controller/base", "Controller")
  @js.native
  abstract class Controller[O] protected () extends StObject {
    def this(view: View) = this()
    
    /**
      * change visibility of component
      * @param visible
      */
    def changeVisible(visible: Boolean): Unit = js.native
    
    /**
      * clear
      * @param includeOption 是否清空 option 配置项（used in annotation）
      */
    def clear(): Unit = js.native
    def clear(includeOption: Boolean): Unit = js.native
    
    /** 所有的 component */
    /* protected */ var components: js.Array[ComponentOption] = js.native
    
    /**
      * destroy the component
      */
    def destroy(): Unit = js.native
    
    /**
      * get all components
      * @returns components array
      */
    def getComponents(): js.Array[ComponentOption] = js.native
    
    /**
      * init the component
      */
    def init(): Any = js.native
    
    /**
      * update the components
      */
    /**
      * do layout
      */
    def layout(): Any = js.native
    
    def name: String = js.native
    
    /** option 配置，不同组件有自己不同的配置结构 */
    /* protected */ var option: O = js.native
    
    /**
      * render the components
      */
    def render(): Any = js.native
    
    /**
      * 组件的更新逻辑
      *  - 根据字段为标识，为每一个组件生成一个 id，放到 option 中
      *  - 更新的时候按照 id 去做 diff，然后对同的做处理
      *  - 创建增加的
      *  - 更新已有的
      *  - 销毁删除的
      */
    def update(): Any = js.native
    
    /* protected */ var view: View = js.native
    
    /** 是否可见 */
    var visible: Boolean = js.native
  }
  
  type ControllerCtor[O] = Instantiable1[/* view */ View, Controller[O]]
}
