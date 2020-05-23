package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveTab extends js.Object {
  var activeTab: Double
  var animated: Boolean
  var dynamicTabUnderlineWidth: Boolean
  var page: Double
  var tabBarActiveTextColor: String
  var tabBarBackgroundColor: String
  var tabBarInactiveTextColor: String
  var tabs: js.Array[scala.Nothing]
  def goToTab(): Unit
}

object ActiveTab {
  @scala.inline
  def apply(
    activeTab: Double,
    animated: Boolean,
    dynamicTabUnderlineWidth: Boolean,
    goToTab: () => Unit,
    page: Double,
    tabBarActiveTextColor: String,
    tabBarBackgroundColor: String,
    tabBarInactiveTextColor: String,
    tabs: js.Array[scala.Nothing]
  ): ActiveTab = {
    val __obj = js.Dynamic.literal(activeTab = activeTab.asInstanceOf[js.Any], animated = animated.asInstanceOf[js.Any], dynamicTabUnderlineWidth = dynamicTabUnderlineWidth.asInstanceOf[js.Any], goToTab = js.Any.fromFunction0(goToTab), page = page.asInstanceOf[js.Any], tabBarActiveTextColor = tabBarActiveTextColor.asInstanceOf[js.Any], tabBarBackgroundColor = tabBarBackgroundColor.asInstanceOf[js.Any], tabBarInactiveTextColor = tabBarInactiveTextColor.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveTab]
  }
}

