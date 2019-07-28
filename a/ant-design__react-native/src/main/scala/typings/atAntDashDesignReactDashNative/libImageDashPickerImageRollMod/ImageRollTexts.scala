package typings.atAntDashDesignReactDashNative.libImageDashPickerImageRollMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageRollTexts extends js.Object {
  var cancelText: js.UndefOr[ReactNode] = js.undefined
  var title: js.UndefOr[ReactNode] = js.undefined
}

object ImageRollTexts {
  @scala.inline
  def apply(cancelText: ReactNode = null, title: ReactNode = null): ImageRollTexts = {
    val __obj = js.Dynamic.literal()
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageRollTexts]
  }
}

