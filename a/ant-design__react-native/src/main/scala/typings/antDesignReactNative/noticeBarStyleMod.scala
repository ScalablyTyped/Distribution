package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noticeBarStyleMod {
  
  @JSImport("@ant-design/react-native/lib/notice-bar/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(variables: Theme): NoticeBarStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(variables.asInstanceOf[js.Any]).asInstanceOf[NoticeBarStyle]
  
  trait NoticeBarStyle extends StObject {
    
    var actionWrap: ViewStyle
    
    var close: TextStyle
    
    var container: ViewStyle
    
    var content: TextStyle
    
    var left15: ViewStyle
    
    var left6: ViewStyle
    
    var link: TextStyle
    
    var notice: ViewStyle
  }
  object NoticeBarStyle {
    
    inline def apply(
      actionWrap: ViewStyle,
      close: TextStyle,
      container: ViewStyle,
      content: TextStyle,
      left15: ViewStyle,
      left6: ViewStyle,
      link: TextStyle,
      notice: ViewStyle
    ): NoticeBarStyle = {
      val __obj = js.Dynamic.literal(actionWrap = actionWrap.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], left15 = left15.asInstanceOf[js.Any], left6 = left6.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], notice = notice.asInstanceOf[js.Any])
      __obj.asInstanceOf[NoticeBarStyle]
    }
    
    extension [Self <: NoticeBarStyle](x: Self) {
      
      inline def setActionWrap(value: ViewStyle): Self = StObject.set(x, "actionWrap", value.asInstanceOf[js.Any])
      
      inline def setClose(value: TextStyle): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContent(value: TextStyle): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setLeft15(value: ViewStyle): Self = StObject.set(x, "left15", value.asInstanceOf[js.Any])
      
      inline def setLeft6(value: ViewStyle): Self = StObject.set(x, "left6", value.asInstanceOf[js.Any])
      
      inline def setLink(value: TextStyle): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      inline def setNotice(value: ViewStyle): Self = StObject.set(x, "notice", value.asInstanceOf[js.Any])
    }
  }
}
