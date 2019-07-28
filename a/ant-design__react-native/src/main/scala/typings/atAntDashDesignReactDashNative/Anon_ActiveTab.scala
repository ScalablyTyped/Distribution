package typings.atAntDashDesignReactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveTab extends js.Object {
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

object Anon_ActiveTab {
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
  ): Anon_ActiveTab = {
    val __obj = js.Dynamic.literal(activeTab = activeTab, animated = animated, dynamicTabUnderlineWidth = dynamicTabUnderlineWidth, goToTab = js.Any.fromFunction0(goToTab), page = page, tabBarActiveTextColor = tabBarActiveTextColor, tabBarBackgroundColor = tabBarBackgroundColor, tabBarInactiveTextColor = tabBarInactiveTextColor, tabs = tabs)
  
    __obj.asInstanceOf[Anon_ActiveTab]
  }
}

