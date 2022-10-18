package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStepsStyleMod {
  
  @JSImport("@ant-design/react-native/lib/steps/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(theme: Theme): StepsStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any]).asInstanceOf[StepsStyle]
  
  trait StepsStyle extends StObject {
    
    var content_l: ViewStyle
    
    var content_s: ViewStyle
    
    var content_s_h: ViewStyle
    
    var description_l: TextStyle
    
    var description_s: TextStyle
    
    var head_blue_l: ViewStyle
    
    var head_blue_s: ViewStyle
    
    var head_default_l: ViewStyle
    
    var head_default_s: ViewStyle
    
    var head_gray_l: ViewStyle
    
    var head_gray_s: ViewStyle
    
    var head_red_l: ViewStyle
    
    var head_red_s: ViewStyle
    
    var icon_l: TextStyle
    
    var icon_s: TextStyle
    
    var tail_blue: ViewStyle
    
    var tail_default_l: ViewStyle
    
    var tail_default_s: ViewStyle
    
    var tail_default_s_h: ViewStyle
    
    var tail_error: ViewStyle
    
    var tail_gray: ViewStyle
    
    var tail_last: ViewStyle
    
    var title_l: TextStyle
    
    var title_s: TextStyle
  }
  object StepsStyle {
    
    inline def apply(
      content_l: ViewStyle,
      content_s: ViewStyle,
      content_s_h: ViewStyle,
      description_l: TextStyle,
      description_s: TextStyle,
      head_blue_l: ViewStyle,
      head_blue_s: ViewStyle,
      head_default_l: ViewStyle,
      head_default_s: ViewStyle,
      head_gray_l: ViewStyle,
      head_gray_s: ViewStyle,
      head_red_l: ViewStyle,
      head_red_s: ViewStyle,
      icon_l: TextStyle,
      icon_s: TextStyle,
      tail_blue: ViewStyle,
      tail_default_l: ViewStyle,
      tail_default_s: ViewStyle,
      tail_default_s_h: ViewStyle,
      tail_error: ViewStyle,
      tail_gray: ViewStyle,
      tail_last: ViewStyle,
      title_l: TextStyle,
      title_s: TextStyle
    ): StepsStyle = {
      val __obj = js.Dynamic.literal(content_l = content_l.asInstanceOf[js.Any], content_s = content_s.asInstanceOf[js.Any], content_s_h = content_s_h.asInstanceOf[js.Any], description_l = description_l.asInstanceOf[js.Any], description_s = description_s.asInstanceOf[js.Any], head_blue_l = head_blue_l.asInstanceOf[js.Any], head_blue_s = head_blue_s.asInstanceOf[js.Any], head_default_l = head_default_l.asInstanceOf[js.Any], head_default_s = head_default_s.asInstanceOf[js.Any], head_gray_l = head_gray_l.asInstanceOf[js.Any], head_gray_s = head_gray_s.asInstanceOf[js.Any], head_red_l = head_red_l.asInstanceOf[js.Any], head_red_s = head_red_s.asInstanceOf[js.Any], icon_l = icon_l.asInstanceOf[js.Any], icon_s = icon_s.asInstanceOf[js.Any], tail_blue = tail_blue.asInstanceOf[js.Any], tail_default_l = tail_default_l.asInstanceOf[js.Any], tail_default_s = tail_default_s.asInstanceOf[js.Any], tail_default_s_h = tail_default_s_h.asInstanceOf[js.Any], tail_error = tail_error.asInstanceOf[js.Any], tail_gray = tail_gray.asInstanceOf[js.Any], tail_last = tail_last.asInstanceOf[js.Any], title_l = title_l.asInstanceOf[js.Any], title_s = title_s.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepsStyle]
    }
    
    extension [Self <: StepsStyle](x: Self) {
      
      inline def setContent_l(value: ViewStyle): Self = StObject.set(x, "content_l", value.asInstanceOf[js.Any])
      
      inline def setContent_s(value: ViewStyle): Self = StObject.set(x, "content_s", value.asInstanceOf[js.Any])
      
      inline def setContent_s_h(value: ViewStyle): Self = StObject.set(x, "content_s_h", value.asInstanceOf[js.Any])
      
      inline def setDescription_l(value: TextStyle): Self = StObject.set(x, "description_l", value.asInstanceOf[js.Any])
      
      inline def setDescription_s(value: TextStyle): Self = StObject.set(x, "description_s", value.asInstanceOf[js.Any])
      
      inline def setHead_blue_l(value: ViewStyle): Self = StObject.set(x, "head_blue_l", value.asInstanceOf[js.Any])
      
      inline def setHead_blue_s(value: ViewStyle): Self = StObject.set(x, "head_blue_s", value.asInstanceOf[js.Any])
      
      inline def setHead_default_l(value: ViewStyle): Self = StObject.set(x, "head_default_l", value.asInstanceOf[js.Any])
      
      inline def setHead_default_s(value: ViewStyle): Self = StObject.set(x, "head_default_s", value.asInstanceOf[js.Any])
      
      inline def setHead_gray_l(value: ViewStyle): Self = StObject.set(x, "head_gray_l", value.asInstanceOf[js.Any])
      
      inline def setHead_gray_s(value: ViewStyle): Self = StObject.set(x, "head_gray_s", value.asInstanceOf[js.Any])
      
      inline def setHead_red_l(value: ViewStyle): Self = StObject.set(x, "head_red_l", value.asInstanceOf[js.Any])
      
      inline def setHead_red_s(value: ViewStyle): Self = StObject.set(x, "head_red_s", value.asInstanceOf[js.Any])
      
      inline def setIcon_l(value: TextStyle): Self = StObject.set(x, "icon_l", value.asInstanceOf[js.Any])
      
      inline def setIcon_s(value: TextStyle): Self = StObject.set(x, "icon_s", value.asInstanceOf[js.Any])
      
      inline def setTail_blue(value: ViewStyle): Self = StObject.set(x, "tail_blue", value.asInstanceOf[js.Any])
      
      inline def setTail_default_l(value: ViewStyle): Self = StObject.set(x, "tail_default_l", value.asInstanceOf[js.Any])
      
      inline def setTail_default_s(value: ViewStyle): Self = StObject.set(x, "tail_default_s", value.asInstanceOf[js.Any])
      
      inline def setTail_default_s_h(value: ViewStyle): Self = StObject.set(x, "tail_default_s_h", value.asInstanceOf[js.Any])
      
      inline def setTail_error(value: ViewStyle): Self = StObject.set(x, "tail_error", value.asInstanceOf[js.Any])
      
      inline def setTail_gray(value: ViewStyle): Self = StObject.set(x, "tail_gray", value.asInstanceOf[js.Any])
      
      inline def setTail_last(value: ViewStyle): Self = StObject.set(x, "tail_last", value.asInstanceOf[js.Any])
      
      inline def setTitle_l(value: TextStyle): Self = StObject.set(x, "title_l", value.asInstanceOf[js.Any])
      
      inline def setTitle_s(value: TextStyle): Self = StObject.set(x, "title_s", value.asInstanceOf[js.Any])
    }
  }
}
