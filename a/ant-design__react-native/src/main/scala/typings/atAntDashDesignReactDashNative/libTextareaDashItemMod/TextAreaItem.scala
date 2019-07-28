package typings.atAntDashDesignReactDashNative.libTextareaDashItemMod

import typings.atAntDashDesignReactDashNative.Anon_NativeEventAnonContentSize
import typings.atAntDashDesignReactDashNative.libStyleMod.Theme
import typings.react.reactMod.Component
import typings.reactDashNative.reactDashNativeMod.NativeSyntheticEvent
import typings.reactDashNative.reactDashNativeMod.TextInput
import typings.reactDashNative.reactDashNativeMod.TextInputChangeEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextAreaItem
  extends Component[TextareaItemProps, js.Any, js.Any] {
  var textAreaRef: TextInput | Null = js.native
  def getHeight(theme: Theme): js.Any = js.native
  def onChange(event: NativeSyntheticEvent[TextInputChangeEventData]): Unit = js.native
  def onContentSizeChange(theme: Theme): js.Function1[/* event */ Anon_NativeEventAnonContentSize, Unit] = js.native
}

