package typings.antDesignReactNative.tabsStyleMod

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabBarStyle extends js.Object {
  var container: ViewStyle = js.native
  var tab: ViewStyle = js.native
  var tabs: ViewStyle = js.native
  var textStyle: TextStyle = js.native
  var underline: ViewStyle = js.native
}

object TabBarStyle {
  @scala.inline
  def apply(container: ViewStyle, tab: ViewStyle, tabs: ViewStyle, textStyle: TextStyle, underline: ViewStyle): TabBarStyle = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any], textStyle = textStyle.asInstanceOf[js.Any], underline = underline.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabBarStyle]
  }
  @scala.inline
  implicit class TabBarStyleOps[Self <: TabBarStyle] (val x: Self) extends AnyVal {
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
    def setContainer(value: ViewStyle): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setTab(value: ViewStyle): Self = this.set("tab", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabs(value: ViewStyle): Self = this.set("tabs", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextStyle(value: TextStyle): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnderline(value: ViewStyle): Self = this.set("underline", value.asInstanceOf[js.Any])
  }
  
}

