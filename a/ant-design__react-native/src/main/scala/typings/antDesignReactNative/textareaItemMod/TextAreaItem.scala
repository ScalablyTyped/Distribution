package typings.antDesignReactNative.textareaItemMod

import typings.antDesignReactNative.anon.NativeEventContentSize
import typings.antDesignReactNative.libStyleMod.Theme
import typings.react.mod.Component
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.TextInput
import typings.reactNative.mod.TextInputChangeEventData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextAreaItem
  extends Component[TextareaItemProps, js.Any, js.Any] {
  
  def getHeight(theme: Theme): js.Any = js.native
  
  def onChange(event: NativeSyntheticEvent[TextInputChangeEventData]): Unit = js.native
  
  def onContentSizeChange(theme: Theme): js.Function1[/* event */ NativeEventContentSize, Unit] = js.native
  
  var textAreaRef: TextInput | Null = js.native
}
