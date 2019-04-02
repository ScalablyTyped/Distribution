package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseDynamicLayerProperties
  extends LayerProperties
     with ScaleRangeLayerProperties
     with RefreshableLayerProperties

object BaseDynamicLayerProperties {
  @scala.inline
  def apply(
    fullExtent: ExtentProperties = null,
    id: java.lang.String = null,
    listMode: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.show | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.hide | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`hide-children` = null,
    maxScale: scala.Int | scala.Double = null,
    minScale: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null,
    refreshInterval: scala.Int | scala.Double = null,
    title: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): BaseDynamicLayerProperties = {
    val __obj = js.Dynamic.literal()
    if (fullExtent != null) __obj.updateDynamic("fullExtent")(fullExtent)
    if (id != null) __obj.updateDynamic("id")(id)
    if (listMode != null) __obj.updateDynamic("listMode")(listMode.asInstanceOf[js.Any])
    if (maxScale != null) __obj.updateDynamic("maxScale")(maxScale.asInstanceOf[js.Any])
    if (minScale != null) __obj.updateDynamic("minScale")(minScale.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (refreshInterval != null) __obj.updateDynamic("refreshInterval")(refreshInterval.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[BaseDynamicLayerProperties]
  }
}

