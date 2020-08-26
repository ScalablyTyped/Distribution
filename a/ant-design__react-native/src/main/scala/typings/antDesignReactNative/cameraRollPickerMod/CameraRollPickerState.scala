package typings.antDesignReactNative.cameraRollPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CameraRollPickerState extends js.Object {
  var images: js.Array[_] = js.native
  var selected: js.Any = js.native
}

object CameraRollPickerState {
  @scala.inline
  def apply(images: js.Array[_], selected: js.Any): CameraRollPickerState = {
    val __obj = js.Dynamic.literal(images = images.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraRollPickerState]
  }
  @scala.inline
  implicit class CameraRollPickerStateOps[Self <: CameraRollPickerState] (val x: Self) extends AnyVal {
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
    def setImagesVarargs(value: js.Any*): Self = this.set("images", js.Array(value :_*))
    @scala.inline
    def setImages(value: js.Array[_]): Self = this.set("images", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelected(value: js.Any): Self = this.set("selected", value.asInstanceOf[js.Any])
  }
  
}

