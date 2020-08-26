package typings.antDesignReactNative.cameraRollPickerMod

import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CameraRollPickerStyle extends js.Object {
  var marker: ViewStyle = js.native
  var row: ViewStyle = js.native
  var spinner: ViewStyle = js.native
  var wrapper: ViewStyle = js.native
}

object CameraRollPickerStyle {
  @scala.inline
  def apply(marker: ViewStyle, row: ViewStyle, spinner: ViewStyle, wrapper: ViewStyle): CameraRollPickerStyle = {
    val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], spinner = spinner.asInstanceOf[js.Any], wrapper = wrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraRollPickerStyle]
  }
  @scala.inline
  implicit class CameraRollPickerStyleOps[Self <: CameraRollPickerStyle] (val x: Self) extends AnyVal {
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
    def setMarker(value: ViewStyle): Self = this.set("marker", value.asInstanceOf[js.Any])
    @scala.inline
    def setRow(value: ViewStyle): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpinner(value: ViewStyle): Self = this.set("spinner", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrapper(value: ViewStyle): Self = this.set("wrapper", value.asInstanceOf[js.Any])
  }
  
}

