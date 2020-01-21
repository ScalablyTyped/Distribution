package typings.appdmg.mod

import typings.appdmg.appdmgStrings.UDBZ
import typings.appdmg.appdmgStrings.UDCO
import typings.appdmg.appdmgStrings.UDRO
import typings.appdmg.appdmgStrings.UDRW
import typings.appdmg.appdmgStrings.UDZO
import typings.appdmg.appdmgStrings.ULFO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Specification extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var `background-color`: js.UndefOr[String] = js.undefined
  var `code-sign`: js.UndefOr[SpecificationCodeSign] = js.undefined
  var contents: js.Array[SpecificationContents]
  var format: UDRW | UDRO | UDCO | UDZO | UDBZ | ULFO
  var icon: js.UndefOr[String] = js.undefined
  var `icon-size`: js.UndefOr[Double] = js.undefined
  var title: String
  var window: js.UndefOr[SpecificationWindow] = js.undefined
}

object Specification {
  @scala.inline
  def apply(
    contents: js.Array[SpecificationContents],
    format: UDRW | UDRO | UDCO | UDZO | UDBZ | ULFO,
    title: String,
    background: String = null,
    `background-color`: String = null,
    `code-sign`: SpecificationCodeSign = null,
    icon: String = null,
    `icon-size`: Int | Double = null,
    window: SpecificationWindow = null
  ): Specification = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (`background-color` != null) __obj.updateDynamic("background-color")(`background-color`.asInstanceOf[js.Any])
    if (`code-sign` != null) __obj.updateDynamic("code-sign")(`code-sign`.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (`icon-size` != null) __obj.updateDynamic("icon-size")(`icon-size`.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[Specification]
  }
}

