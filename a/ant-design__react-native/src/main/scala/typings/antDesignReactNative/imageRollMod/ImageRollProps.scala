package typings.antDesignReactNative.imageRollMod

import typings.antDesignReactNative.cameraRollPickerMod.CameraRollPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageRollProps extends ImageRollTexts {
  var cameraPickerProps: js.UndefOr[CameraRollPickerProps] = js.native
  def onCancel(): Unit = js.native
  def onSelected(imgObj: js.Object): Unit = js.native
}

object ImageRollProps {
  @scala.inline
  def apply(onCancel: () => Unit, onSelected: js.Object => Unit): ImageRollProps = {
    val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), onSelected = js.Any.fromFunction1(onSelected))
    __obj.asInstanceOf[ImageRollProps]
  }
  @scala.inline
  implicit class ImageRollPropsOps[Self <: ImageRollProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnCancel(value: () => Unit): Self = this.set("onCancel", js.Any.fromFunction0(value))
    @scala.inline
    def setOnSelected(value: js.Object => Unit): Self = this.set("onSelected", js.Any.fromFunction1(value))
    @scala.inline
    def setCameraPickerProps(value: CameraRollPickerProps): Self = this.set("cameraPickerProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCameraPickerProps: Self = this.set("cameraPickerProps", js.undefined)
  }
  
}

