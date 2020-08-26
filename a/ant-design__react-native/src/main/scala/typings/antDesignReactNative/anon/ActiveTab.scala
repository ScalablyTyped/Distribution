package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveTab extends js.Object {
  var activeTab: Double = js.native
  var animated: Boolean = js.native
  var dynamicTabUnderlineWidth: Boolean = js.native
  var page: Double = js.native
  var tabBarActiveTextColor: String = js.native
  var tabBarBackgroundColor: String = js.native
  var tabBarInactiveTextColor: String = js.native
  var tabs: js.Array[scala.Nothing] = js.native
  def goToTab(): Unit = js.native
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
  @scala.inline
  implicit class ActiveTabOps[Self <: ActiveTab] (val x: Self) extends AnyVal {
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
    def setActiveTab(value: Double): Self = this.set("activeTab", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    @scala.inline
    def setDynamicTabUnderlineWidth(value: Boolean): Self = this.set("dynamicTabUnderlineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setGoToTab(value: () => Unit): Self = this.set("goToTab", js.Any.fromFunction0(value))
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabBarActiveTextColor(value: String): Self = this.set("tabBarActiveTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabBarBackgroundColor(value: String): Self = this.set("tabBarBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabBarInactiveTextColor(value: String): Self = this.set("tabBarInactiveTextColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabsVarargs(value: scala.Nothing*): Self = this.set("tabs", js.Array(value :_*))
    @scala.inline
    def setTabs(value: js.Array[scala.Nothing]): Self = this.set("tabs", value.asInstanceOf[js.Any])
  }
  
}

