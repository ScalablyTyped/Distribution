package typings.antDesignReactNative

import typings.antDesignReactNative.anon.ActionTextUnderlayColor
import typings.antDesignReactNative.anon.DefaultProps
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPickerPopupMixinMod {
  
  @JSImport("@ant-design/react-native/lib/picker/PopupMixin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    getModal: js.Function3[/* props */ Any, /* visible */ Any, /* args */ Args, ReactNode],
    platformProps: ActionTextUnderlayColor
  ): DefaultProps = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(getModal.asInstanceOf[js.Any], platformProps.asInstanceOf[js.Any])).asInstanceOf[DefaultProps]
  
  trait Args extends StObject {
    
    var getContent: Any
    
    var hide: Any
    
    var onDismiss: Any
    
    var onOk: Any
  }
  object Args {
    
    inline def apply(getContent: Any, hide: Any, onDismiss: Any, onOk: Any): Args = {
      val __obj = js.Dynamic.literal(getContent = getContent.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], onDismiss = onDismiss.asInstanceOf[js.Any], onOk = onOk.asInstanceOf[js.Any])
      __obj.asInstanceOf[Args]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Args] (val x: Self) extends AnyVal {
      
      inline def setGetContent(value: Any): Self = StObject.set(x, "getContent", value.asInstanceOf[js.Any])
      
      inline def setHide(value: Any): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      inline def setOnDismiss(value: Any): Self = StObject.set(x, "onDismiss", value.asInstanceOf[js.Any])
      
      inline def setOnOk(value: Any): Self = StObject.set(x, "onOk", value.asInstanceOf[js.Any])
    }
  }
}
