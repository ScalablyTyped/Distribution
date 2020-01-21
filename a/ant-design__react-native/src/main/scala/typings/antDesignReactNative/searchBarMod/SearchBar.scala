package typings.antDesignReactNative.searchBarMod

import typings.antDesignReactNative.AnonNativeEvent
import typings.antDesignReactNative.searchBarPropsTypeMod.SearchBarState
import typings.react.mod.Component
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.TextInput
import typings.reactNative.mod.TextInputFocusEventData
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
  def onSubmit(_underscore: AnonNativeEvent): Unit = js.native
}

