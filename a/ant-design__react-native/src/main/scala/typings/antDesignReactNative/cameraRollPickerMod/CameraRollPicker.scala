package typings.antDesignReactNative.cameraRollPickerMod

import typings.antDesignReactNative.anon.Uri
import typings.react.mod.Component
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CameraRollPicker
  extends Component[CameraRollPickerProps, CameraRollPickerState, js.Any] {
  
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MCameraRollPicker(nextProps: CameraRollPickerProps): Unit = js.native
  
  def _arrayObjectIndexOf(array: js.Any, property: String, value: js.Any): js.Any = js.native
  
  def _nEveryRow(data: js.Any, n: Double): js.Array[js.Array[_]] = js.native
  
  def _renderImage(item: js.Any): Element = js.native
  
  def _selectImage(image: Uri): Unit = js.native
  
  var after: js.UndefOr[String] = js.native
  
  def onFetch(_underscore: js.UndefOr[scala.Nothing], startFetch: js.Any, abortFetch: js.Function0[Unit]): js.Promise[Unit] = js.native
  def onFetch(_underscore: Double, startFetch: js.Any, abortFetch: js.Function0[Unit]): js.Promise[Unit] = js.native
}
