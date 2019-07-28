package typings.atAntDashDesignReactDashNative.esImageDashPickerCameraRollPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraRollPickerState extends js.Object {
  var images: js.Array[_]
  var selected: js.Any
}

object CameraRollPickerState {
  @scala.inline
  def apply(images: js.Array[_], selected: js.Any): CameraRollPickerState = {
    val __obj = js.Dynamic.literal(images = images, selected = selected)
  
    __obj.asInstanceOf[CameraRollPickerState]
  }
}

