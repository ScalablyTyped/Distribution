package typings.aceDashDiff.aceDashDiffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AceDiffLROpts extends js.Object {
  var content: js.UndefOr[String | Null] = js.undefined
  var copyLinkEnabled: js.UndefOr[Boolean] = js.undefined
  var editable: js.UndefOr[Boolean] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
}

object AceDiffLROpts {
  @scala.inline
  def apply(
    content: String = null,
    copyLinkEnabled: js.UndefOr[Boolean] = js.undefined,
    editable: js.UndefOr[Boolean] = js.undefined,
    mode: String = null,
    theme: String = null
  ): AceDiffLROpts = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (!js.isUndefined(copyLinkEnabled)) __obj.updateDynamic("copyLinkEnabled")(copyLinkEnabled)
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[AceDiffLROpts]
  }
}

