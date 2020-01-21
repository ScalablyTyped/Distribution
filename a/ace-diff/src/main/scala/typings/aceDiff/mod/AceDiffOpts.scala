package typings.aceDiff.mod

import typings.aceDiff.AnonConnector
import typings.aceDiff.aceDiffStrings.broad
import typings.aceDiff.aceDiffStrings.specific
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AceDiffOpts extends js.Object {
  var classes: js.UndefOr[AnonConnector] = js.undefined
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
    classes: AnonConnector = null,
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
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (diffGranularity != null) __obj.updateDynamic("diffGranularity")(diffGranularity.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (maxDiffs != null) __obj.updateDynamic("maxDiffs")(maxDiffs.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (!js.isUndefined(showConnectors)) __obj.updateDynamic("showConnectors")(showConnectors.asInstanceOf[js.Any])
    if (!js.isUndefined(showDiffs)) __obj.updateDynamic("showDiffs")(showDiffs.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AceDiffOpts]
  }
}

