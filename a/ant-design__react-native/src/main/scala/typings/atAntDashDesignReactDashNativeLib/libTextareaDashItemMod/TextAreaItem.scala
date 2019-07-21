package typings
package atAntDashDesignReactDashNativeLib.libTextareaDashItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextAreaItem
  extends reactLib.reactMod.Component[TextareaItemProps, js.Any, js.Any] {
  var textAreaRef: reactDashNativeLib.reactDashNativeMod.TextInput | scala.Null = js.native
  def getHeight(theme: atAntDashDesignReactDashNativeLib.libStyleMod.Theme): js.Any = js.native
  def onChange(
    event: reactDashNativeLib.reactDashNativeMod.NativeSyntheticEvent[reactDashNativeLib.reactDashNativeMod.TextInputChangeEventData]
  ): scala.Unit = js.native
  def onContentSizeChange(theme: atAntDashDesignReactDashNativeLib.libStyleMod.Theme): js.Function1[
    /* event */ atAntDashDesignReactDashNativeLib.Anon_NativeEventAnonContentSize, 
    scala.Unit
  ] = js.native
}

