package typings.aceDashDiff.aceDashDiffMod

import typings.aceDashDiff.Anon_Connector
import typings.aceDashDiff.aceDashDiffStrings.broad
import typings.aceDashDiff.aceDashDiffStrings.specific
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AceDiffOpts extends js.Object {
  var classes: js.UndefOr[Anon_Connector] = js.undefined
  var diffGranularity: js.UndefOr[specific | broad] = js.undefined
  var left: js.UndefOr[AceDiffLROpts] = js.undefined
  var maxDiffs: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var right: js.UndefOr[AceDiffLROpts] = js.undefined
  var showConnectors: js.UndefOr[Boolean] = js.undefined
  var showDiffs: js.UndefOr[Boolean] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
}

object AceDiffOpts {
  @scala.inline
  def apply(
    classes: Anon_Connector = null,
    diffGranularity: specific | broad = null,
    left: AceDiffLROpts = null,
    maxDiffs: Int | Double = null,
    mode: String = null,
    right: AceDiffLROpts = null,
    showConnectors: js.UndefOr[Boolean] = js.undefined,
    showDiffs: js.UndefOr[Boolean] = js.undefined,
    theme: String = null
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

