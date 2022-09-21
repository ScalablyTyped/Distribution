package typings.antvG2

import typings.antvG2.libInterfaceMod.LooseObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cursorMod {
  
  /**
    * 鼠标形状的 Action
    * @ignore
    */
  @JSImport("@antv/g2/lib/interaction/action/cursor", JSImport.Default)
  @js.native
  open class default () extends CursorAction
  
  /**
    * 鼠标形状的 Action
    * @ignore
    */
  @js.native
  trait CursorAction
    extends typings.antvG2.actionBaseMod.default[LooseObject] {
    
    /**
      * 默认光标（通常是一个箭头）
      */
    def default(): Unit = js.native
    
    /** 光标呈现为十字线。 */
    def crosshair(): Unit = js.native
    
    /**
      * 此光标指示矩形框的边缘可被向右（东）移动。
      */
    def eResize(): Unit = js.native
    
    /**
      * 光标指示可以在左右方向移动
      */
    def ewResize(): Unit = js.native
    
    /** 此光标指示可用的帮助（通常是一个问号或一个气球）。 */
    def help(): Unit = js.native
    
    /** 此光标指示某对象可被移动。 */
    def move(): Unit = js.native
    
    /**
      * 此光标指示矩形框的边缘可被向上（北）移动。
      */
    def nResize(): Unit = js.native
    
    /**
      * 光标指示可移动的方向 右上方（东北）
      */
    def neResize(): Unit = js.native
    
    /**
      * 光标指示可以在上下方向移动
      */
    def nsResize(): Unit = js.native
    
    /**
      * 光标指示可移动的方向 左上方（西北）
      */
    def nwResize(): Unit = js.native
    
    /** 光标呈现为指示链接的指针（一只手） */
    def pointer(): Unit = js.native
    
    /**
      * 此光标指示矩形框的边缘可被向下（南）移动。
      */
    def sResize(): Unit = js.native
    
    /**
      * 光标指示可移动的方向右下方（东南）
      */
    def seResize(): Unit = js.native
    
    /* private */ var setCursor: Any = js.native
    
    /**
      * 光标指示可移动的方向左下方（西南）
      */
    def swResize(): Unit = js.native
    
    /** 此光标指示文本。 */
    def text(): Unit = js.native
    
    /**
      * 此光标指示矩形框的边缘可被向左（西）移动。
      */
    def wResize(): Unit = js.native
    
    /**
      * 光标显示可以被放大
      */
    def zoomIn(): Unit = js.native
    
    /**
      * 光标显示可以缩小尺寸
      */
    def zoomOut(): Unit = js.native
  }
}
