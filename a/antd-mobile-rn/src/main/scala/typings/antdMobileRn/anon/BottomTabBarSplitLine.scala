package typings.antdMobileRn.anon

import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BottomTabBarSplitLine extends StObject {
  
  var bottomTabBarSplitLine: ViewStyle
  
  var container: ViewStyle
  
  var topTabBarSplitLine: ViewStyle
}
object BottomTabBarSplitLine {
  
  @scala.inline
  def apply(bottomTabBarSplitLine: ViewStyle, container: ViewStyle, topTabBarSplitLine: ViewStyle): BottomTabBarSplitLine = {
    val __obj = js.Dynamic.literal(bottomTabBarSplitLine = bottomTabBarSplitLine.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], topTabBarSplitLine = topTabBarSplitLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomTabBarSplitLine]
  }
  
  @scala.inline
  implicit class BottomTabBarSplitLineMutableBuilder[Self <: BottomTabBarSplitLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottomTabBarSplitLine(value: ViewStyle): Self = StObject.set(x, "bottomTabBarSplitLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopTabBarSplitLine(value: ViewStyle): Self = StObject.set(x, "topTabBarSplitLine", value.asInstanceOf[js.Any])
  }
}
