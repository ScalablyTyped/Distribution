package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object actionSheetStyleMod {
  
  @JSImport("@ant-design/react-native/lib/action-sheet/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(theme: Theme): ActionSheetStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any]).asInstanceOf[ActionSheetStyle]
  
  trait ActionSheetStyle extends StObject {
    
    var btn: ViewStyle
    
    var cancelBtn: ViewStyle
    
    var cancelBtnMask: ViewStyle
    
    var container: ViewStyle
    
    var content: ViewStyle
    
    var destructiveBtn: TextStyle
    
    var mask: ViewStyle
    
    var message: ViewStyle
    
    var title: ViewStyle
    
    var titleText: TextStyle
    
    var wrap: ViewStyle
  }
  object ActionSheetStyle {
    
    @scala.inline
    def apply(
      btn: ViewStyle,
      cancelBtn: ViewStyle,
      cancelBtnMask: ViewStyle,
      container: ViewStyle,
      content: ViewStyle,
      destructiveBtn: TextStyle,
      mask: ViewStyle,
      message: ViewStyle,
      title: ViewStyle,
      titleText: TextStyle,
      wrap: ViewStyle
    ): ActionSheetStyle = {
      val __obj = js.Dynamic.literal(btn = btn.asInstanceOf[js.Any], cancelBtn = cancelBtn.asInstanceOf[js.Any], cancelBtnMask = cancelBtnMask.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], destructiveBtn = destructiveBtn.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleText = titleText.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionSheetStyle]
    }
    
    @scala.inline
    implicit class ActionSheetStyleMutableBuilder[Self <: ActionSheetStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBtn(value: ViewStyle): Self = StObject.set(x, "btn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelBtn(value: ViewStyle): Self = StObject.set(x, "cancelBtn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelBtnMask(value: ViewStyle): Self = StObject.set(x, "cancelBtnMask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: ViewStyle): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestructiveBtn(value: TextStyle): Self = StObject.set(x, "destructiveBtn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMask(value: ViewStyle): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: ViewStyle): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: ViewStyle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleText(value: TextStyle): Self = StObject.set(x, "titleText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrap(value: ViewStyle): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    }
  }
}
