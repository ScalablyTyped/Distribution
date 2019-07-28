package typings.atAntDashDesignReactDashNative.libImageDashPickerImageRollMod

import typings.atAntDashDesignReactDashNative.libImageDashPickerCameraRollPickerMod.CameraRollPickerProps
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageRollProps extends ImageRollTexts {
  var cameraPickerProps: js.UndefOr[CameraRollPickerProps] = js.undefined
  def onCancel(): Unit
  def onSelected(imgObj: js.Object): Unit
}

object ImageRollProps {
  @scala.inline
  def apply(
    onCancel: () => Unit,
    onSelected: js.Object => Unit,
    cameraPickerProps: CameraRollPickerProps = null,
    cancelText: ReactNode = null,
    title: ReactNode = null
  ): ImageRollProps = {
    val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), onSelected = js.Any.fromFunction1(onSelected))
    if (cameraPickerProps != null) __obj.updateDynamic("cameraPickerProps")(cameraPickerProps)
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageRollProps]
  }
}

