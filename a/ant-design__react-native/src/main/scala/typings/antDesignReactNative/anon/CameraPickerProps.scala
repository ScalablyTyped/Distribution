package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraPickerProps extends js.Object {
  var cancelText: String
  var title: String
}

object CameraPickerProps {
  @scala.inline
  def apply(cancelText: String, title: String): CameraPickerProps = {
    val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraPickerProps]
  }
}

