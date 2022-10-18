package typings.antvG2

import typings.antvG2.anon.MaskStyle
import typings.antvG2.anon.Y
import typings.antvG2.libInterfaceMod.LooseObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionActionMaskBaseMod {
  
  /**
    * @ignore
    * 辅助框 Action 的基类
    */
  /* note: abstract class */ @JSImport("@antv/g2/lib/interaction/action/mask/base", JSImport.Default)
  @js.native
  open class default () extends MaskBase
  
  /**
    * @ignore
    * 辅助框 Action 的基类
    */
  @js.native
  trait MaskBase
    extends typings.antvG2.libInteractionActionBaseMod.default[LooseObject] {
    
    /* private */ var createMask: Any = js.native
    
    /* protected */ def emitEvent(`type`: Any): Unit = js.native
    
    /**
      * 结束
      */
    def end(): Unit = js.native
    
    /* protected */ def getCurrentPoint(): Y = js.native
    
    /* protected */ def getMaskAttrs(): LooseObject = js.native
    
    /* protected */ def getMaskPath(): js.Array[Any] = js.native
    
    /**
      * 隐藏
      */
    def hide(): Unit = js.native
    
    /* protected */ var maskShape: Any = js.native
    
    /**
      * 移动 mask
      */
    def move(): Unit = js.native
    
    /**
      * 结束移动
      */
    def moveEnd(): Unit = js.native
    
    /**
      * 开始移动
      */
    def moveStart(): Unit = js.native
    
    /* protected */ var moving: Boolean = js.native
    
    /* protected */ var points: js.Array[Any] = js.native
    
    /* protected */ var preMovePoint: Any = js.native
    
    /**
      * 大小变化
      */
    def resize(): Unit = js.native
    
    /* protected */ var shapeType: String = js.native
    
    /**
      * 显示
      */
    def show(): Unit = js.native
    
    /**
      * 开始
      */
    def start(): Unit = js.native
    def start(arg: MaskStyle): Unit = js.native
    
    /* protected */ var starting: Boolean = js.native
    
    /* protected */ def updateMask(): Unit = js.native
    /* protected */ def updateMask(maskStyle: LooseObject): Unit = js.native
  }
}
