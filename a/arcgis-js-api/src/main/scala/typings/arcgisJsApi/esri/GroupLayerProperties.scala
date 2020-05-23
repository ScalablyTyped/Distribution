package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`hide-children`
import typings.arcgisJsApi.arcgisJsApiStrings.exclusive
import typings.arcgisJsApi.arcgisJsApiStrings.hide
import typings.arcgisJsApi.arcgisJsApiStrings.independent
import typings.arcgisJsApi.arcgisJsApiStrings.inherited
import typings.arcgisJsApi.arcgisJsApiStrings.show
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
  var visibilityMode: js.UndefOr[independent | inherited | exclusive] = js.undefined
}

object GroupLayerProperties {
  @scala.inline
  def apply(
    fullExtent: ExtentProperties = null,
    id: String = null,
    layers: CollectionProperties[LayerProperties] | js.Array[LayerProperties] = null,
    listMode: show | hide | `hide-children` = null,
    opacity: js.UndefOr[Double] = js.undefined,
    portalItem: PortalItemProperties = null,
    title: String = null,
    visibilityMode: independent | inherited | exclusive = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): GroupLayerProperties = {
    val __obj = js.Dynamic.literal()
    if (fullExtent != null) __obj.updateDynamic("fullExtent")(fullExtent.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (listMode != null) __obj.updateDynamic("listMode")(listMode.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (portalItem != null) __obj.updateDynamic("portalItem")(portalItem.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (visibilityMode != null) __obj.updateDynamic("visibilityMode")(visibilityMode.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupLayerProperties]
  }
}

