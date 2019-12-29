package typings.atAntDashDesignReactDashNative.libSearchDashBarMod

import typings.atAntDashDesignReactDashNative.Anon_NativeEvent
import typings.atAntDashDesignReactDashNative.libSearchDashBarPropsTypeMod.SearchBarState
import typings.react.reactMod.Component
import typings.reactDashNative.reactDashNativeMod.NativeSyntheticEvent
import typings.reactDashNative.reactDashNativeMod.TextInput
import typings.reactDashNative.reactDashNativeMod.TextInputFocusEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchBar
  extends Component[SearchBarProps, SearchBarState, js.Any] {
  var inputRef: TextInput | Null = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MSearchBar(nextProps: SearchBarProps): Unit = js.native
  def onBlur(e: NativeSyntheticEvent[TextInputFocusEventData]): Unit = js.native
  def onCancel(): Unit = js.native
  def onChangeText(value: String): Unit = js.native
  def onFocus(e: NativeSyntheticEvent[TextInputFocusEventData]): Unit = js.native
  def onSubmit(_underscore: Anon_NativeEvent): Unit = js.native
}

