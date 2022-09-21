package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.rcImage.previewGroupMod.GroupConsumerProps
import typings.react.mod.FC
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object previewGroupMod extends Shortcut {
  
  @JSImport("antd/lib/image/PreviewGroup", JSImport.Default)
  @js.native
  val default: FC[GroupConsumerProps] = js.native
  
  object icons {
    
    @JSImport("antd/lib/image/PreviewGroup", "icons")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/lib/image/PreviewGroup", "icons.close")
    @js.native
    def close: Element = js.native
    inline def close_=(x: Element): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("close")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/image/PreviewGroup", "icons.left")
    @js.native
    def left: Element = js.native
    inline def left_=(x: Element): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("left")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/image/PreviewGroup", "icons.right")
    @js.native
    def right: Element = js.native
    inline def right_=(x: Element): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("right")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/image/PreviewGroup", "icons.rotateLeft")
    @js.native
    def rotateLeft: Element = js.native
    inline def rotateLeft_=(x: Element): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rotateLeft")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/image/PreviewGroup", "icons.rotateRight")
    @js.native
    def rotateRight: Element = js.native
    inline def rotateRight_=(x: Element): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rotateRight")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/image/PreviewGroup", "icons.zoomIn")
    @js.native
    def zoomIn: Element = js.native
    inline def zoomIn_=(x: Element): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zoomIn")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/image/PreviewGroup", "icons.zoomOut")
    @js.native
    def zoomOut: Element = js.native
    inline def zoomOut_=(x: Element): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zoomOut")(x.asInstanceOf[js.Any])
  }
  
  type _To = FC[GroupConsumerProps]
  
  /* This means you don't have to write `default`, but can instead just say `previewGroupMod.foo` */
  override def _to: FC[GroupConsumerProps] = default
}
