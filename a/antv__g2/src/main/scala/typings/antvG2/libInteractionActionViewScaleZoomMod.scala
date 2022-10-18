package typings.antvG2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInteractionActionViewScaleZoomMod {
  
  /**
    * 缩放 Scale 的 Action
    * @ignore
    */
  @JSImport("@antv/g2/lib/interaction/action/view/scale-zoom", JSImport.Default)
  @js.native
  open class default () extends ScaleTranslate
  
  /**
    * 缩放 Scale 的 Action
    * @ignore
    */
  @js.native
  trait ScaleTranslate
    extends typings.antvG2.libInteractionActionViewScaleTransformMod.default {
    
    /* private */ var zoom: Any = js.native
    
    /* private */ var zoomDim: Any = js.native
    
    /**
      * 缩小
      */
    def zoomIn(): Unit = js.native
    
    /* private */ var zoomLinear: Any = js.native
    
    /**
      * 放大
      */
    def zoomOut(): Unit = js.native
    
    /* private */ var zoomRatio: Any = js.native
  }
}
