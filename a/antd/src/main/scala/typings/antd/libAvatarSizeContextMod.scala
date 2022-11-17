package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.libUtilResponsiveObserveMod.ScreenSizeMap
import typings.react.mod.Context
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAvatarSizeContextMod extends Shortcut {
  
  @JSImport("antd/lib/avatar/SizeContext", JSImport.Default)
  @js.native
  val default: Context[AvatarSize] = js.native
  
  @JSImport("antd/lib/avatar/SizeContext", "SizeContextProvider")
  @js.native
  val SizeContextProvider: FC[SizeContextProps] = js.native
  
  type AvatarSize = "large" | "small" | "default" | Double | ScreenSizeMap
  
  trait SizeContextProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var size: js.UndefOr[AvatarSize] = js.undefined
  }
  object SizeContextProps {
    
    inline def apply(): SizeContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SizeContextProps]
    }
    
    extension [Self <: SizeContextProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setSize(value: AvatarSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = Context[AvatarSize]
  
  /* This means you don't have to write `default`, but can instead just say `libAvatarSizeContextMod.foo` */
  override def _to: Context[AvatarSize] = default
}
