package typings.antvComponent

import typings.antvComponent.typesMod.ComponentCfg
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object htmlComponentMod {
  
  @JSImport("@antv/component/lib/abstract/html-component", JSImport.Default)
  @js.native
  abstract class default[T /* <: ComponentCfg */] () extends HtmlComponent[T]
  
  @js.native
  trait HtmlComponent[T /* <: ComponentCfg */]
    extends typings.antvComponent.componentMod.default[T] {
    
    /* protected */ def applyChildrenStyles(element: js.Any, styles: js.Any): Unit = js.native
    
    /* protected */ def applyStyle(cssName: js.Any, dom: js.Any): Unit = js.native
    
    /* protected */ def applyStyles(): Unit = js.native
    
    /**
      * @protected
      */
    /* protected */ def createDom(): js.Any = js.native
    
    def getContainer(): HTMLElement = js.native
    
    /* protected */ def initCapture(): Unit = js.native
    
    /* protected */ def initContainer(): Unit = js.native
    
    /* protected */ def initDom(): Unit = js.native
    
    /**
      * @protected
      * 初始化事件
      */
    /* protected */ def initEvent(): Unit = js.native
    
    /* protected */ def initVisible(): Unit = js.native
    
    /**
      * @protected
      * 清理 DOM
      */
    /* protected */ def removeDom(): Unit = js.native
    
    /**
      * @protected
      * 清理事件
      */
    /* protected */ def removeEvent(): Unit = js.native
    
    /* protected */ def resetPosition(): Unit = js.native
    
    /* protected */ def resetStyles(): Unit = js.native
    
    /**
      * 是否允许捕捉事件
      * @param capture 事件捕捉
      */
    def setCapture(capture: js.Any): Unit = js.native
    
    /* protected */ def updateInner(cfg: js.Any): Unit = js.native
  }
}
