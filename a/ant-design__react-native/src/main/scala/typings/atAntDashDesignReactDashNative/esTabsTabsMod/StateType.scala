package typings.atAntDashDesignReactDashNative.esTabsTabsMod

import typings.reactDashNative.reactDashNativeMod.AnimatedNs.Value
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
    val __obj = js.Dynamic.literal(containerWidth = containerWidth, currentTab = currentTab, scrollValue = scrollValue, scrollX = scrollX)
  
    __obj.asInstanceOf[StateType]
  }
}

