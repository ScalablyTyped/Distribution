package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupLayerProperties
  extends LayerProperties
     with LayersMixinProperties
     with PortalLayerProperties {
  /**
    * Indicates how to manage the visibility of the children layers. Possible values are described in the table below.
    *
    * Value | Description
    * ------|------------
    * independent | Each child layer manages its visibility independent from other layers.
    * inherited | Each child layer's visibility matches the [GroupLayer’s visibility](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html#visible).
    * exclusive | Only one child layer is visible at a time.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html#visibilityMode)
    */
  var visibilityMode: js.UndefOr[java.lang.String] = js.undefined
}

object GroupLayerProperties {
  @scala.inline
  def apply(
    fullExtent: ExtentProperties = null,
    id: java.lang.String = null,
    layers: CollectionProperties[LayerProperties] | js.Array[LayerProperties] = null,
    listMode: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.show | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.hide | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`hide-children` = null,
    opacity: scala.Int | scala.Double = null,
    portalItem: PortalItemProperties = null,
    title: java.lang.String = null,
    visibilityMode: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): GroupLayerProperties = {
    val __obj = js.Dynamic.literal()
    if (fullExtent != null) __obj.updateDynamic("fullExtent")(fullExtent)
    if (id != null) __obj.updateDynamic("id")(id)
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (listMode != null) __obj.updateDynamic("listMode")(listMode.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (portalItem != null) __obj.updateDynamic("portalItem")(portalItem)
    if (title != null) __obj.updateDynamic("title")(title)
    if (visibilityMode != null) __obj.updateDynamic("visibilityMode")(visibilityMode)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[GroupLayerProperties]
  }
}

