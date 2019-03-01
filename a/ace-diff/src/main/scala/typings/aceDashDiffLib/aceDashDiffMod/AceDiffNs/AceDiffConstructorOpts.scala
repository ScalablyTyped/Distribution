package typings
package aceDashDiffLib.aceDashDiffMod.AceDiffNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AceDiffConstructorOpts extends AceDiffOpts {
  var element: java.lang.String | stdLib.HTMLElement
  @JSName("left")
  var left_AceDiffConstructorOpts: AceDiffLROpts
  @JSName("right")
  var right_AceDiffConstructorOpts: AceDiffLROpts
}

object AceDiffConstructorOpts {
  @scala.inline
  def apply(
    element: java.lang.String | stdLib.HTMLElement,
    left: AceDiffLROpts,
    right: AceDiffLROpts,
    classes: aceDashDiffLib.Anon_Connector = null,
    diffGranularity: aceDashDiffLib.aceDashDiffLibStrings.specific | aceDashDiffLib.aceDashDiffLibStrings.broad = null,
    maxDiffs: scala.Int | scala.Double = null,
    mode: java.lang.String = null,
    showConnectors: js.UndefOr[scala.Boolean] = js.undefined,
    showDiffs: js.UndefOr[scala.Boolean] = js.undefined,
    theme: java.lang.String = null
  ): AceDiffConstructorOpts = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("right")(right)
    if (classes != null) __obj.updateDynamic("classes")(classes)
    if (diffGranularity != null) __obj.updateDynamic("diffGranularity")(diffGranularity.asInstanceOf[js.Any])
    if (maxDiffs != null) __obj.updateDynamic("maxDiffs")(maxDiffs.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (!js.isUndefined(showConnectors)) __obj.updateDynamic("showConnectors")(showConnectors)
    if (!js.isUndefined(showDiffs)) __obj.updateDynamic("showDiffs")(showDiffs)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[AceDiffConstructorOpts]
  }
}

