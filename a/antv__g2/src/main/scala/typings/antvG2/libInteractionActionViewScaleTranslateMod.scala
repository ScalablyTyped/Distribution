package typings.antvG2

import typings.antvGBase.libTypesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionActionViewScaleTranslateMod {
  
  /**
    * 拖拽 Scale 的 Action
    * @ignore
    */
  @JSImport("@antv/g2/lib/interaction/action/view/scale-translate", JSImport.Default)
  @js.native
  open class default () extends ScaleTranslate
  
  /**
    * 拖拽 Scale 的 Action
    * @ignore
    */
  @js.native
  trait ScaleTranslate
    extends typings.antvG2.libInteractionActionViewScaleTransformMod.default {
    
    /**
      * 结束
      */
    def end(): Unit = js.native
    
    /**
      * 开始
      */
    def start(): Unit = js.native
    
    /* private */ var startCache: Any = js.native
    
    /* protected */ var startPoint: Point = js.native
    
    /* protected */ var starting: Boolean = js.native
    
    /**
      * 平移
      */
    def translate(): Unit = js.native
    
    /* private */ var translateDim: Any = js.native
    
    /* private */ var translateLinear: Any = js.native
  }
}
