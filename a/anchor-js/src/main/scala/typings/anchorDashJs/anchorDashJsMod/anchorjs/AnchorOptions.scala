package typings.anchorDashJs.anchorDashJsMod.anchorjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnchorOptions extends js.Object {
  var arialabel: js.UndefOr[String] = js.undefined
  var `class`: js.UndefOr[String] = js.undefined
  var icons: js.UndefOr[String] = js.undefined
  var placement: js.UndefOr[AnchorPlacement] = js.undefined
  var truncate: js.UndefOr[Double] = js.undefined
  var visible: js.UndefOr[AnchorVisibility] = js.undefined
}

object AnchorOptions {
  @scala.inline
  def apply(
    arialabel: String = null,
    `class`: String = null,
    icons: String = null,
    placement: AnchorPlacement = null,
    truncate: Int | Double = null,
    visible: AnchorVisibility = null
  ): AnchorOptions = {
    val __obj = js.Dynamic.literal()
    if (arialabel != null) __obj.updateDynamic("arialabel")(arialabel.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (truncate != null) __obj.updateDynamic("truncate")(truncate.asInstanceOf[js.Any])
    if (visible != null) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnchorOptions]
  }
}

