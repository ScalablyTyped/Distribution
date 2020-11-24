package typings.antDesignReactNative.paginationStyleMod

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaginationStyle extends js.Object {
  
  var activeTextStyle: TextStyle = js.native
  
  var container: ViewStyle = js.native
  
  var indicatorStyle: ViewStyle = js.native
  
  var numberStyle: ViewStyle = js.native
  
  var pointActiveStyle: ViewStyle = js.native
  
  var pointStyle: ViewStyle = js.native
  
  var spaceStyle: ViewStyle = js.native
  
  var totalStyle: TextStyle = js.native
}
object PaginationStyle {
  
  @scala.inline
  def apply(
    activeTextStyle: TextStyle,
    container: ViewStyle,
    indicatorStyle: ViewStyle,
    numberStyle: ViewStyle,
    pointActiveStyle: ViewStyle,
    pointStyle: ViewStyle,
    spaceStyle: ViewStyle,
    totalStyle: TextStyle
  ): PaginationStyle = {
    val __obj = js.Dynamic.literal(activeTextStyle = activeTextStyle.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], indicatorStyle = indicatorStyle.asInstanceOf[js.Any], numberStyle = numberStyle.asInstanceOf[js.Any], pointActiveStyle = pointActiveStyle.asInstanceOf[js.Any], pointStyle = pointStyle.asInstanceOf[js.Any], spaceStyle = spaceStyle.asInstanceOf[js.Any], totalStyle = totalStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationStyle]
  }
  
  @scala.inline
  implicit class PaginationStyleOps[Self <: PaginationStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setActiveTextStyle(value: TextStyle): Self = this.set("activeTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainer(value: ViewStyle): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorStyle(value: ViewStyle): Self = this.set("indicatorStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberStyle(value: ViewStyle): Self = this.set("numberStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointActiveStyle(value: ViewStyle): Self = this.set("pointActiveStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointStyle(value: ViewStyle): Self = this.set("pointStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceStyle(value: ViewStyle): Self = this.set("spaceStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalStyle(value: TextStyle): Self = this.set("totalStyle", value.asInstanceOf[js.Any])
  }
}
