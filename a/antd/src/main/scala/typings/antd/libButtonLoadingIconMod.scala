package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libButtonLoadingIconMod extends Shortcut {
  
  @JSImport("antd/lib/button/LoadingIcon", JSImport.Default)
  @js.native
  val default: FC[LoadingIconProps] = js.native
  
  trait LoadingIconProps extends StObject {
    
    var existIcon: Boolean
    
    var loading: js.UndefOr[Boolean | js.Object] = js.undefined
    
    var prefixCls: String
  }
  object LoadingIconProps {
    
    inline def apply(existIcon: Boolean, prefixCls: String): LoadingIconProps = {
      val __obj = js.Dynamic.literal(existIcon = existIcon.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadingIconProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoadingIconProps] (val x: Self) extends AnyVal {
      
      inline def setExistIcon(value: Boolean): Self = StObject.set(x, "existIcon", value.asInstanceOf[js.Any])
      
      inline def setLoading(value: Boolean | js.Object): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[LoadingIconProps]
  
  /* This means you don't have to write `default`, but can instead just say `libButtonLoadingIconMod.foo` */
  override def _to: FC[LoadingIconProps] = default
}
