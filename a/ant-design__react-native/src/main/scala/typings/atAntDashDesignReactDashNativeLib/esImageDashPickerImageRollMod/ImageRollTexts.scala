package typings
package atAntDashDesignReactDashNativeLib.esImageDashPickerImageRollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageRollTexts extends js.Object {
  var cancelText: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var title: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object ImageRollTexts {
  @scala.inline
  def apply(cancelText: reactLib.reactMod.ReactNode = null, title: reactLib.reactMod.ReactNode = null): ImageRollTexts = {
    val __obj = js.Dynamic.literal()
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageRollTexts]
  }
}

