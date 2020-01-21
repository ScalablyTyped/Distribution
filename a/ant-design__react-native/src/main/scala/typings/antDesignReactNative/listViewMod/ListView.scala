package typings.antDesignReactNative.listViewMod

import typings.antDesignReactNative.AnonRefresh
import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListView[T]
  extends Component[ListViewProps[T], ListViewState, js.Any] {
  var ulv: AnonRefresh = js.native
  def refresh(): Unit = js.native
}

