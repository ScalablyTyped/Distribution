package typings
package atAntDashDesignReactDashNativeLib.libTabsTabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateType extends js.Object {
  var containerWidth: scala.Double
  var currentTab: scala.Double
  var scrollValue: reactDashNativeLib.reactDashNativeMod.AnimatedNs.Value
  var scrollX: reactDashNativeLib.reactDashNativeMod.AnimatedNs.Value
}

object StateType {
  @scala.inline
  def apply(
    containerWidth: scala.Double,
    currentTab: scala.Double,
    scrollValue: reactDashNativeLib.reactDashNativeMod.AnimatedNs.Value,
    scrollX: reactDashNativeLib.reactDashNativeMod.AnimatedNs.Value
  ): StateType = {
    val __obj = js.Dynamic.literal(containerWidth = containerWidth, currentTab = currentTab, scrollValue = scrollValue, scrollX = scrollX)
  
    __obj.asInstanceOf[StateType]
  }
}

