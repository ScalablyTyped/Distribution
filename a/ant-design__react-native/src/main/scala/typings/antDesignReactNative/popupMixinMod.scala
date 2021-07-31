package typings.antDesignReactNative

import typings.antDesignReactNative.anon.ActionTextUnderlayColor
import typings.antDesignReactNative.anon.DefaultProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popupMixinMod {
  
  @JSImport("@ant-design/react-native/lib/picker/PopupMixin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(
    getModal: js.Function3[/* props */ js.Any, /* visible */ js.Any, /* args */ Args, Element],
    platformProps: ActionTextUnderlayColor
  ): DefaultProps = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(getModal.asInstanceOf[js.Any], platformProps.asInstanceOf[js.Any])).asInstanceOf[DefaultProps]
  
  trait Args extends StObject {
    
    var getContent: js.Any
    
    var hide: js.Any
    
    var onDismiss: js.Any
    
    var onOk: js.Any
  }
  object Args {
    
    @scala.inline
    def apply(getContent: js.Any, hide: js.Any, onDismiss: js.Any, onOk: js.Any): Args = {
      val __obj = js.Dynamic.literal(getContent = getContent.asInstanceOf[js.Any], hide = hide.asInstanceOf[js.Any], onDismiss = onDismiss.asInstanceOf[js.Any], onOk = onOk.asInstanceOf[js.Any])
      __obj.asInstanceOf[Args]
    }
    
    @scala.inline
    implicit class ArgsMutableBuilder[Self <: Args] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetContent(value: js.Any): Self = StObject.set(x, "getContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHide(value: js.Any): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDismiss(value: js.Any): Self = StObject.set(x, "onDismiss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnOk(value: js.Any): Self = StObject.set(x, "onOk", value.asInstanceOf[js.Any])
    }
  }
}
