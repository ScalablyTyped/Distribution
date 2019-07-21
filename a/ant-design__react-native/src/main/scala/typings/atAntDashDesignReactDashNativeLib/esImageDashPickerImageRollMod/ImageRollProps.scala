package typings
package atAntDashDesignReactDashNativeLib.esImageDashPickerImageRollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageRollProps extends ImageRollTexts {
  var cameraPickerProps: js.UndefOr[
    atAntDashDesignReactDashNativeLib.esImageDashPickerCameraRollPickerMod.CameraRollPickerProps
  ] = js.undefined
  def onCancel(): scala.Unit
  def onSelected(imgObj: js.Object): scala.Unit
}

object ImageRollProps {
  @scala.inline
  def apply(
    onCancel: () => scala.Unit,
    onSelected: js.Object => scala.Unit,
    cameraPickerProps: atAntDashDesignReactDashNativeLib.esImageDashPickerCameraRollPickerMod.CameraRollPickerProps = null,
    cancelText: reactLib.reactMod.ReactNode = null,
    title: reactLib.reactMod.ReactNode = null
  ): ImageRollProps = {
    val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), onSelected = js.Any.fromFunction1(onSelected))
    if (cameraPickerProps != null) __obj.updateDynamic("cameraPickerProps")(cameraPickerProps)
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageRollProps]
  }
}

