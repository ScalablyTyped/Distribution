package typings.aceDashDiff.aceDashDiffMod

import typings.aceDashDiff.Anon_Connector
import typings.aceDashDiff.aceDashDiffStrings.broad
import typings.aceDashDiff.aceDashDiffStrings.specific
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AceDiffConstructorOpts extends AceDiffOpts {
  var element: String | HTMLElement
  @JSName("left")
  var left_AceDiffConstructorOpts: AceDiffLROpts
  @JSName("right")
  var right_AceDiffConstructorOpts: AceDiffLROpts
}

object AceDiffConstructorOpts {
  @scala.inline
  def apply(
    element: String | HTMLElement,
    left: AceDiffLROpts,
    right: AceDiffLROpts,
    classes: Anon_Connector = null,
    diffGranularity: specific | broad = null,
    maxDiffs: Int | Double = null,
    mode: String = null,
    showConnectors: js.UndefOr[Boolean] = js.undefined,
    showDiffs: js.UndefOr[Boolean] = js.undefined,
    theme: String = null
  ): AceDiffConstructorOpts = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (diffGranularity != null) __obj.updateDynamic("diffGranularity")(diffGranularity.asInstanceOf[js.Any])
    if (maxDiffs != null) __obj.updateDynamic("maxDiffs")(maxDiffs.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(showConnectors)) __obj.updateDynamic("showConnectors")(showConnectors.asInstanceOf[js.Any])
    if (!js.isUndefined(showDiffs)) __obj.updateDynamic("showDiffs")(showDiffs.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AceDiffConstructorOpts]
  }
}

