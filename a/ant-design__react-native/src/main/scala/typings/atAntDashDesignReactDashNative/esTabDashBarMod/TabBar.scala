package typings.atAntDashDesignReactDashNative.esTabDashBarMod

import typings.atAntDashDesignReactDashNative.Anon_Badge
import typings.atAntDashDesignReactDashNative.esStyleMod.Theme
import typings.react.reactMod.Component
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabBar
  extends Component[TabBarNativeProps, js.Any, js.Any] {
  def getPanes(styles: ReturnType[js.Function1[/* theme */ Theme, Anon_Badge]], content: Boolean): js.Array[_] = js.native
}

