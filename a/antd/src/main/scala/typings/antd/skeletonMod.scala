package typings.antd

import typings.antd.anon.Avatar
import typings.antd.anon.CallDefaultProps
import typings.antd.anon.CallProps
import typings.antd.anon.DefaultProps
import typings.antd.nodeMod.SkeletonNodeProps
import typings.antd.skeletonImageMod.SkeletonImageProps
import typings.antd.skeletonSkeletonMod.SkeletonProps
import typings.react.mod.FC
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skeletonMod {
  
  object default {
    
    inline def apply(props: SkeletonProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    
    @JSImport("antd/lib/skeleton", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/lib/skeleton", "default.Avatar")
    @js.native
    def Avatar: CallDefaultProps = js.native
    inline def Avatar_=(x: CallDefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Avatar")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/skeleton", "default.Button")
    @js.native
    def Button: DefaultProps = js.native
    inline def Button_=(x: DefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Button")(x.asInstanceOf[js.Any])
    
    inline def Image(props: SkeletonImageProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Image")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("antd/lib/skeleton", "default.Input")
    @js.native
    def Input: CallProps = js.native
    inline def Input_=(x: CallProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Input")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/skeleton", "default.Node")
    @js.native
    def Node: FC[SkeletonNodeProps] = js.native
    inline def Node_=(x: FC[SkeletonNodeProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Node")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/skeleton", "default.defaultProps")
    @js.native
    def defaultProps: Avatar = js.native
    inline def defaultProps_=(x: Avatar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
