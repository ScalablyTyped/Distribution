package typings.antDesignReactNative.styleTabsMod

import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabsStyle extends js.Object {
  var bottomTabBarSplitLine: ViewStyle = js.native
  var container: ViewStyle = js.native
  var topTabBarSplitLine: ViewStyle = js.native
}

object TabsStyle {
  @scala.inline
  def apply(bottomTabBarSplitLine: ViewStyle, container: ViewStyle, topTabBarSplitLine: ViewStyle): TabsStyle = {
    val __obj = js.Dynamic.literal(bottomTabBarSplitLine = bottomTabBarSplitLine.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], topTabBarSplitLine = topTabBarSplitLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsStyle]
  }
  @scala.inline
  implicit class TabsStyleOps[Self <: TabsStyle] (val x: Self) extends AnyVal {
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
    def setBottomTabBarSplitLine(value: ViewStyle): Self = this.set("bottomTabBarSplitLine", value.asInstanceOf[js.Any])
    @scala.inline
    def setContainer(value: ViewStyle): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopTabBarSplitLine(value: ViewStyle): Self = this.set("topTabBarSplitLine", value.asInstanceOf[js.Any])
  }
  
}

