package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.Context
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sizeContextMod extends Shortcut {
  
  @JSImport("antd/lib/avatar/SizeContext", JSImport.Default)
  @js.native
  val default: Context[AvatarSize] = js.native
  
  @JSImport("antd/lib/avatar/SizeContext", "SizeContextProvider")
  @js.native
  val SizeContextProvider: FC[SizeContextProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.large
    - typings.antd.antdStrings.small
    - typings.antd.antdStrings.default
    - scala.Double
    - typings.antd.responsiveObserveMod.ScreenSizeMap
  */
  type AvatarSize = _AvatarSize | Double
  
  @js.native
  trait SizeContextProps extends StObject {
    
    var size: js.UndefOr[AvatarSize] = js.native
  }
  object SizeContextProps {
    
    @scala.inline
    def apply(): SizeContextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SizeContextProps]
    }
    
    @scala.inline
    implicit class SizeContextPropsMutableBuilder[Self <: SizeContextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: AvatarSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait _AvatarSize extends StObject
  
  type _To = Context[AvatarSize]
  
  /* This means you don't have to write `default`, but can instead just say `sizeContextMod.foo` */
  override def _to: Context[AvatarSize] = default
}
