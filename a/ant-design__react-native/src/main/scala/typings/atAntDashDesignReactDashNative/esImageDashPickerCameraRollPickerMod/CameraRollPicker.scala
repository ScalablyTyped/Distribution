package typings.atAntDashDesignReactDashNative.esImageDashPickerCameraRollPickerMod

import typings.atAntDashDesignReactDashNative.Anon_Uri
import typings.react.reactMod.Component
import typings.react.reactMod._Global_.JSX.Element
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
  def _selectImage(image: Anon_Uri): Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MCameraRollPicker(nextProps: CameraRollPickerProps): Unit = js.native
  def onFetch(`_`: js.UndefOr[scala.Nothing], startFetch: js.Any, abortFetch: js.Function0[Unit]): js.Promise[Unit] = js.native
  def onFetch(`_`: Double, startFetch: js.Any, abortFetch: js.Function0[Unit]): js.Promise[Unit] = js.native
}

