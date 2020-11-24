package typings.antDesignReactNative.tabsTabsMod

import typings.reactNative.mod.Animated.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StateType extends js.Object {
  
  var containerWidth: Double = js.native
  
  var currentTab: Double = js.native
  
  var scrollValue: Value = js.native
  
  var scrollX: Value = js.native
}
object StateType {
  
  @scala.inline
  def apply(containerWidth: Double, currentTab: Double, scrollValue: Value, scrollX: Value): StateType = {
    val __obj = js.Dynamic.literal(containerWidth = containerWidth.asInstanceOf[js.Any], currentTab = currentTab.asInstanceOf[js.Any], scrollValue = scrollValue.asInstanceOf[js.Any], scrollX = scrollX.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateType]
  }
  
  @scala.inline
  implicit class StateTypeOps[Self <: StateType] (val x: Self) extends AnyVal {
    
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
    def setContainerWidth(value: Double): Self = this.set("containerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTab(value: Double): Self = this.set("currentTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollValue(value: Value): Self = this.set("scrollValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollX(value: Value): Self = this.set("scrollX", value.asInstanceOf[js.Any])
  }
}
