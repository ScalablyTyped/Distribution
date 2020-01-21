package typings.antDesignReactNative.tabsTabsMod

import typings.reactNative.mod.Animated.Value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateType extends js.Object {
  var containerWidth: Double
  var currentTab: Double
  var scrollValue: Value
  var scrollX: Value
}

object StateType {
  @scala.inline
  def apply(containerWidth: Double, currentTab: Double, scrollValue: Value, scrollX: Value): StateType = {
    val __obj = js.Dynamic.literal(containerWidth = containerWidth.asInstanceOf[js.Any], currentTab = currentTab.asInstanceOf[js.Any], scrollValue = scrollValue.asInstanceOf[js.Any], scrollX = scrollX.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StateType]
  }
}

