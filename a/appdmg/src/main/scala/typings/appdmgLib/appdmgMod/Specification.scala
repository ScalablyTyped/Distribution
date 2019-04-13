package typings
package appdmgLib.appdmgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Specification extends js.Object {
  var background: js.UndefOr[java.lang.String] = js.undefined
  var `background-color`: js.UndefOr[java.lang.String] = js.undefined
  var `code-sign`: js.UndefOr[SpecificationCodeSign] = js.undefined
  var contents: js.Array[SpecificationContents]
  var format: appdmgLib.appdmgLibStrings.UDRW | appdmgLib.appdmgLibStrings.UDRO | appdmgLib.appdmgLibStrings.UDCO | appdmgLib.appdmgLibStrings.UDZO | appdmgLib.appdmgLibStrings.UDBZ | appdmgLib.appdmgLibStrings.ULFO
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var `icon-size`: js.UndefOr[scala.Double] = js.undefined
  var title: java.lang.String
  var window: js.UndefOr[SpecificationWindow] = js.undefined
}

object Specification {
  @scala.inline
  def apply(
    contents: js.Array[SpecificationContents],
    format: appdmgLib.appdmgLibStrings.UDRW | appdmgLib.appdmgLibStrings.UDRO | appdmgLib.appdmgLibStrings.UDCO | appdmgLib.appdmgLibStrings.UDZO | appdmgLib.appdmgLibStrings.UDBZ | appdmgLib.appdmgLibStrings.ULFO,
    title: java.lang.String,
    background: java.lang.String = null,
    `background-color`: java.lang.String = null,
    `code-sign`: SpecificationCodeSign = null,
    icon: java.lang.String = null,
    `icon-size`: scala.Int | scala.Double = null,
    window: SpecificationWindow = null
  ): Specification = {
    val __obj = js.Dynamic.literal(contents = contents, format = format.asInstanceOf[js.Any], title = title)
    if (background != null) __obj.updateDynamic("background")(background)
    if (`background-color` != null) __obj.updateDynamic("background-color")(`background-color`)
    if (`code-sign` != null) __obj.updateDynamic("code-sign")(`code-sign`)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (`icon-size` != null) __obj.updateDynamic("icon-size")(`icon-size`.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window)
    __obj.asInstanceOf[Specification]
  }
}

