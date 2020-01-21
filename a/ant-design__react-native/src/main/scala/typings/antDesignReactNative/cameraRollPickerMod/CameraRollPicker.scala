package typings.antDesignReactNative.cameraRollPickerMod

import typings.antDesignReactNative.AnonUri
import typings.react.mod.Component
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CameraRollPicker
  extends Component[CameraRollPickerProps, CameraRollPickerState, js.Any] {
  var after: js.UndefOr[String] = js.native
  def _arrayObjectIndexOf(array: js.Any, property: String, value: js.Any): js.Any = js.native
  def _nEveryRow(data: js.Any, n: Double): js.Array[js.Array[_]] = js.native
  def _renderImage(item: js.Any): Element = js.native
  def _selectImage(image: AnonUri): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MCameraRollPicker(nextProps: CameraRollPickerProps): Unit = js.native
  def onFetch(_underscore: js.UndefOr[scala.Nothing], startFetch: js.Any, abortFetch: js.Function0[Unit]): js.Promise[Unit] = js.native
  def onFetch(_underscore: Double, startFetch: js.Any, abortFetch: js.Function0[Unit]): js.Promise[Unit] = js.native
}

