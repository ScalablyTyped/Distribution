package typings
package atAntDashDesignReactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActiveTab extends js.Object {
  var activeTab: scala.Double
  var animated: scala.Boolean
  var dynamicTabUnderlineWidth: scala.Boolean
  var page: scala.Double
  var tabBarActiveTextColor: java.lang.String
  var tabBarBackgroundColor: java.lang.String
  var tabBarInactiveTextColor: java.lang.String
  var tabs: js.Array[scala.Nothing]
  def goToTab(): scala.Unit
}

object Anon_ActiveTab {
  @scala.inline
  def apply(
    activeTab: scala.Double,
    animated: scala.Boolean,
    dynamicTabUnderlineWidth: scala.Boolean,
    goToTab: () => scala.Unit,
    page: scala.Double,
    tabBarActiveTextColor: java.lang.String,
    tabBarBackgroundColor: java.lang.String,
    tabBarInactiveTextColor: java.lang.String,
    tabs: js.Array[scala.Nothing]
  ): Anon_ActiveTab = {
    val __obj = js.Dynamic.literal(activeTab = activeTab, animated = animated, dynamicTabUnderlineWidth = dynamicTabUnderlineWidth, goToTab = js.Any.fromFunction0(goToTab), page = page, tabBarActiveTextColor = tabBarActiveTextColor, tabBarBackgroundColor = tabBarBackgroundColor, tabBarInactiveTextColor = tabBarInactiveTextColor, tabs = tabs)
  
    __obj.asInstanceOf[Anon_ActiveTab]
  }
}

