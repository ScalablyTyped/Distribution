package typings
package anchorDashJsLib.anchorDashJsMod.anchorjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnchorOptions extends js.Object {
  var arialabel: js.UndefOr[java.lang.String] = js.undefined
  var `class`: js.UndefOr[java.lang.String] = js.undefined
  var icons: js.UndefOr[java.lang.String] = js.undefined
  var placement: js.UndefOr[AnchorPlacement] = js.undefined
  var truncate: js.UndefOr[scala.Double] = js.undefined
  var visible: js.UndefOr[AnchorVisibility] = js.undefined
}

object AnchorOptions {
  @scala.inline
  def apply(
    arialabel: java.lang.String = null,
    `class`: java.lang.String = null,
    icons: java.lang.String = null,
    placement: AnchorPlacement = null,
    truncate: scala.Int | scala.Double = null,
    visible: AnchorVisibility = null
  ): AnchorOptions = {
    val __obj = js.Dynamic.literal()
    if (arialabel != null) __obj.updateDynamic("arialabel")(arialabel)
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (truncate != null) __obj.updateDynamic("truncate")(truncate.asInstanceOf[js.Any])
    if (visible != null) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[AnchorOptions]
  }
}

