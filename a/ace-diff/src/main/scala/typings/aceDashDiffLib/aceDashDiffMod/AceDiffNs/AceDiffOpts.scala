package typings
package aceDashDiffLib.aceDashDiffMod.AceDiffNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AceDiffOpts extends js.Object {
  var classes: js.UndefOr[aceDashDiffLib.Anon_Connector] = js.undefined
  var diffGranularity: js.UndefOr[
    aceDashDiffLib.aceDashDiffLibStrings.specific | aceDashDiffLib.aceDashDiffLibStrings.broad
  ] = js.undefined
  var left: js.UndefOr[AceDiffLROpts] = js.undefined
  var maxDiffs: js.UndefOr[scala.Double] = js.undefined
  var mode: js.UndefOr[java.lang.String] = js.undefined
  var right: js.UndefOr[AceDiffLROpts] = js.undefined
  var showConnectors: js.UndefOr[scala.Boolean] = js.undefined
  var showDiffs: js.UndefOr[scala.Boolean] = js.undefined
  var theme: js.UndefOr[java.lang.String] = js.undefined
}

object AceDiffOpts {
  @scala.inline
  def apply(
    classes: aceDashDiffLib.Anon_Connector = null,
    diffGranularity: aceDashDiffLib.aceDashDiffLibStrings.specific | aceDashDiffLib.aceDashDiffLibStrings.broad = null,
    left: AceDiffLROpts = null,
    maxDiffs: scala.Int | scala.Double = null,
    mode: java.lang.String = null,
    right: AceDiffLROpts = null,
    showConnectors: js.UndefOr[scala.Boolean] = js.undefined,
    showDiffs: js.UndefOr[scala.Boolean] = js.undefined,
    theme: java.lang.String = null
  ): AceDiffOpts = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (diffGranularity != null) __obj.updateDynamic("diffGranularity")(diffGranularity.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left)
    if (maxDiffs != null) __obj.updateDynamic("maxDiffs")(maxDiffs.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (right != null) __obj.updateDynamic("right")(right)
    if (!js.isUndefined(showConnectors)) __obj.updateDynamic("showConnectors")(showConnectors)
    if (!js.isUndefined(showDiffs)) __obj.updateDynamic("showDiffs")(showDiffs)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[AceDiffOpts]
  }
}

