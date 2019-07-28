package typings.atAntDashDesignReactDashNative.libSearchDashBarMod

import typings.atAntDashDesignReactDashNative.Anon_NativeEvent
import typings.atAntDashDesignReactDashNative.libSearchDashBarPropsTypeMod.SearchBarState
import typings.react.reactMod.Component
import typings.reactDashNative.reactDashNativeMod.TextInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchBar
  extends Component[SearchBarProps, SearchBarState, js.Any] {
  var inputRef: TextInput | Null = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MSearchBar(nextProps: SearchBarProps): Unit = js.native
  def onBlur(): Unit = js.native
  def onCancel(): Unit = js.native
  def onChangeText(value: String): Unit = js.native
  def onFocus(): Unit = js.native
  def onSubmit(`_`: Anon_NativeEvent): Unit = js.native
}

