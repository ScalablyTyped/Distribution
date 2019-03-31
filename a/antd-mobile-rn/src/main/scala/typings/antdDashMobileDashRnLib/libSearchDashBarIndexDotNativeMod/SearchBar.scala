package typings
package antdDashMobileDashRnLib.libSearchDashBarIndexDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchBar
  extends reactLib.reactMod.Component[
      SearchBarNativeProps, 
      antdDashMobileDashRnLib.libSearchDashBarPropsTypeMod.SearchBarState, 
      js.Any
    ] {
  var inputRef: reactDashNativeLib.reactDashNativeMod.TextInput | scala.Null = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MSearchBar(nextProps: SearchBarNativeProps): scala.Unit = js.native
  def onBlur(): scala.Unit = js.native
  def onCancel(): scala.Unit = js.native
  def onChangeText(value: java.lang.String): scala.Unit = js.native
  def onFocus(): scala.Unit = js.native
  def onSubmit(`_`: antdDashMobileDashRnLib.Anon_NativeEvent): scala.Unit = js.native
}

