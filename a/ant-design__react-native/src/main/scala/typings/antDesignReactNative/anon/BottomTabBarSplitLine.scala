package typings.antDesignReactNative.anon

import typings.reactNative.mod.RegisteredStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BottomTabBarSplitLine extends js.Object {
  var bottomTabBarSplitLine: RegisteredStyle[ViewStyle]
  var container: RegisteredStyle[ViewStyle]
  var topTabBarSplitLine: RegisteredStyle[ViewStyle]
}

object BottomTabBarSplitLine {
  @scala.inline
  def apply(
    bottomTabBarSplitLine: RegisteredStyle[ViewStyle],
    container: RegisteredStyle[ViewStyle],
    topTabBarSplitLine: RegisteredStyle[ViewStyle]
  ): BottomTabBarSplitLine = {
    val __obj = js.Dynamic.literal(bottomTabBarSplitLine = bottomTabBarSplitLine.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], topTabBarSplitLine = topTabBarSplitLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomTabBarSplitLine]
  }
}

