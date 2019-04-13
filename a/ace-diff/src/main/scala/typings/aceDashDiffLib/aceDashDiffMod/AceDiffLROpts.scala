package typings
package aceDashDiffLib.aceDashDiffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AceDiffLROpts extends js.Object {
  var content: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var copyLinkEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var editable: js.UndefOr[scala.Boolean] = js.undefined
  var mode: js.UndefOr[java.lang.String] = js.undefined
  var theme: js.UndefOr[java.lang.String] = js.undefined
}

object AceDiffLROpts {
  @scala.inline
  def apply(
    content: java.lang.String = null,
    copyLinkEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    editable: js.UndefOr[scala.Boolean] = js.undefined,
    mode: java.lang.String = null,
    theme: java.lang.String = null
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

