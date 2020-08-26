package typings.antDesignReactNative.defaultTabBarMod

import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.tabsPropsTypeMod.TabBarPropsType
import typings.antDesignReactNative.tabsPropsTypeMod.TabData
import typings.antDesignReactNative.tabsStyleMod.TabBarStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropsType
  extends TabBarPropsType
     with WithThemeStyles[TabBarStyle] {
  /** default: false */
  var dynamicTabUnderlineWidth: js.UndefOr[Boolean] = js.native
  var keyboardShouldPersistTaps: js.UndefOr[Boolean] = js.native
  var scrollValue: js.UndefOr[js.Any] = js.native
  var tabStyle: js.UndefOr[ViewStyle] = js.native
  var tabsContainerStyle: js.UndefOr[ViewStyle] = js.native
}

object PropsType {
  @scala.inline
  def apply(
    activeTab: Double,
    animated: Boolean,
    goToTab: Double => Unit,
    instanceId: Double,
    tabs: js.Array[TabData]
  ): PropsType = {
    val __obj = js.Dynamic.literal(activeTab = activeTab.asInstanceOf[js.Any], animated = animated.asInstanceOf[js.Any], goToTab = js.Any.fromFunction1(goToTab), instanceId = instanceId.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsType]
  }
  @scala.inline
  implicit class PropsTypeOps[Self <: PropsType] (val x: Self) extends AnyVal {
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
    def setDynamicTabUnderlineWidth(value: Boolean): Self = this.set("dynamicTabUnderlineWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamicTabUnderlineWidth: Self = this.set("dynamicTabUnderlineWidth", js.undefined)
    @scala.inline
    def setKeyboardShouldPersistTaps(value: Boolean): Self = this.set("keyboardShouldPersistTaps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyboardShouldPersistTaps: Self = this.set("keyboardShouldPersistTaps", js.undefined)
    @scala.inline
    def setScrollValue(value: js.Any): Self = this.set("scrollValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollValue: Self = this.set("scrollValue", js.undefined)
    @scala.inline
    def setTabStyle(value: ViewStyle): Self = this.set("tabStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabStyle: Self = this.set("tabStyle", js.undefined)
    @scala.inline
    def setTabsContainerStyle(value: ViewStyle): Self = this.set("tabsContainerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabsContainerStyle: Self = this.set("tabsContainerStyle", js.undefined)
  }
  
}

