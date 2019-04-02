package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntegratedMeshLayerProperties
  extends LayerProperties
     with SceneServiceProperties
     with PortalLayerProperties {
  /**
    * Specifies how the mesh is placed on the vertical axis (z). This property only affects [IntegratedMeshLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html) when using the `absolute-height` mode. Integrated mesh layers always render in front of the ground surface, so setting negative offset values will not render them below the ground.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html#elevationInfo)
    */
  var elevationInfo: js.UndefOr[IntegratedMeshLayerElevationInfo] = js.undefined
}

object IntegratedMeshLayerProperties {
  @scala.inline
  def apply(
    copyright: java.lang.String = null,
    elevationInfo: IntegratedMeshLayerElevationInfo = null,
    fullExtent: ExtentProperties = null,
    id: java.lang.String = null,
    layerId: scala.Int | scala.Double = null,
    listMode: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.show | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.hide | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`hide-children` = null,
    opacity: scala.Int | scala.Double = null,
    portalItem: PortalItemProperties = null,
    spatialReference: SpatialReferenceProperties = null,
    title: java.lang.String = null,
    url: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): IntegratedMeshLayerProperties = {
    val __obj = js.Dynamic.literal()
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (elevationInfo != null) __obj.updateDynamic("elevationInfo")(elevationInfo)
    if (fullExtent != null) __obj.updateDynamic("fullExtent")(fullExtent)
    if (id != null) __obj.updateDynamic("id")(id)
    if (layerId != null) __obj.updateDynamic("layerId")(layerId.asInstanceOf[js.Any])
    if (listMode != null) __obj.updateDynamic("listMode")(listMode.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (portalItem != null) __obj.updateDynamic("portalItem")(portalItem)
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference)
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[IntegratedMeshLayerProperties]
  }
}

