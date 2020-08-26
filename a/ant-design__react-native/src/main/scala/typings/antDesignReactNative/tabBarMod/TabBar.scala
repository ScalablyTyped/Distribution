package typings.antDesignReactNative.tabBarMod

import typings.antDesignReactNative.libStyleMod.Theme
import typings.antDesignReactNative.tabBarStyleMod.TabBarStyle
import typings.react.mod.Component
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabBar
  extends Component[TabBarNativeProps, js.Any, js.Any] {
  def getPanes(styles: ReturnType[js.Function1[/* theme */ Theme, TabBarStyle]], content: Boolean): js.Array[_] = js.native
}

