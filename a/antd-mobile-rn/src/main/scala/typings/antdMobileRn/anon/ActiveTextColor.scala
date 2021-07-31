package typings.antdMobileRn.anon

import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveTextColor extends StObject {
  
  var activeTextColor: String
  
  var inactiveTextColor: String
  
  var tab: ViewStyle
  
  var tabs: ViewStyle
  
  var textStyle: ViewStyle
  
  var underline: ViewStyle
}
object ActiveTextColor {
  
  @scala.inline
  def apply(
    activeTextColor: String,
    inactiveTextColor: String,
    tab: ViewStyle,
    tabs: ViewStyle,
    textStyle: ViewStyle,
    underline: ViewStyle
  ): ActiveTextColor = {
    val __obj = js.Dynamic.literal(activeTextColor = activeTextColor.asInstanceOf[js.Any], inactiveTextColor = inactiveTextColor.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any], textStyle = textStyle.asInstanceOf[js.Any], underline = underline.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveTextColor]
  }
  
  @scala.inline
  implicit class ActiveTextColorMutableBuilder[Self <: ActiveTextColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveTextColor(value: String): Self = StObject.set(x, "activeTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInactiveTextColor(value: String): Self = StObject.set(x, "inactiveTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTab(value: ViewStyle): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabs(value: ViewStyle): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextStyle(value: ViewStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderline(value: ViewStyle): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
  }
}
