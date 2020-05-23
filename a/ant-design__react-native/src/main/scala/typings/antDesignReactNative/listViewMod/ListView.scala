package typings.antDesignReactNative.listViewMod

import typings.antDesignReactNative.anon.Refresh
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListView[T]
  extends Component[ListViewProps[T], ListViewState, js.Any] {
  var ulv: Refresh = js.native
  def refresh(): Unit = js.native
}

