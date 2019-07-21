package typings
package atAntDashDesignReactDashNativeLib.esImageDashPickerCameraRollPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CameraRollPicker
  extends reactLib.reactMod.Component[CameraRollPickerProps, CameraRollPickerState, js.Any] {
  var after: js.UndefOr[java.lang.String] = js.native
  def _arrayObjectIndexOf(array: js.Any, property: java.lang.String, value: js.Any): js.Any = js.native
  def _nEveryRow(data: js.Any, n: scala.Double): js.Array[js.Array[_]] = js.native
  def _renderImage(item: js.Any): reactLib.reactMod.Global.JSXNs.Element = js.native
  def _selectImage(image: atAntDashDesignReactDashNativeLib.Anon_Uri): scala.Unit = js.native
  @JSName("componentWillReceiveProps")
  def componentWillReceiveProps_MCameraRollPicker(nextProps: CameraRollPickerProps): scala.Unit = js.native
  def onFetch(`_`: js.UndefOr[scala.Nothing], startFetch: js.Any, abortFetch: js.Function0[scala.Unit]): js.Promise[scala.Unit] = js.native
  def onFetch(`_`: scala.Double, startFetch: js.Any, abortFetch: js.Function0[scala.Unit]): js.Promise[scala.Unit] = js.native
}

