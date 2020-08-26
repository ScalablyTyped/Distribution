package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntegratedMeshLayerProperties
  extends LayerProperties
     with SceneServiceProperties
     with PortalLayerProperties
     with ScaleRangeLayerProperties {
  /**
    * Specifies how the mesh is placed on the vertical axis (z). This property only affects [IntegratedMeshLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html) when using the `absolute-height` mode. Integrated mesh layers always render in front of the ground surface, so setting negative offset values will not render them below the ground.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html#elevationInfo)
    */
  var elevationInfo: js.UndefOr[IntegratedMeshLayerElevationInfo] = js.native
  /**
    * A collection of [SceneModification](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SceneModification.html) with polygons and types to apply client-side modifications.  With [WebScene.save()](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#save) the [SceneModifications](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SceneModifications.html) can be persisted. This allows you to share the modified integrated mesh through web scenes. The following modifications could be applied to the integrated mesh:
    *
    * Illustration | Modification | Description
    * ------|------------|--------
    * <img src="../../assets/img/apiref/layers/modification-clip.png" alt="modification-type-clip" style="width:100px;"/>| <b>clip</b> - removes selected area | Clip-out portions of the integrated mesh to see features below. For example, utility work on gas or water lines in an area. Planners can create a scene in which the integrated mesh is clipped out at a site to expose the water or gas lines below it.
    * <img src="../../assets/img/apiref/layers/modification-mask.png" alt="modification-type-mask" style="width:100px;"/> | <b>mask</b> - displays only selected area |  Define an area of interest. Use a polygon and draw only parts of the integrated mesh inside that polygon. For example, if you want to show only a portion of an integrated mesh within the boundaries of a city.
    * <img src="../../assets/img/apiref/layers/modification-replace.png" alt="modification-type-replace" style="width:100px;"/> | <b>replace</b> - flattens selected area |Replace an area of an integrated mesh based on a 3D polygon. For example, to add constructed buildings, flatten the integrated mesh at the footprint of a building so the new building can be visualized. Create different scenarios of the new construction area and share the scenarios as a web scene to discuss with stakeholders. The integrated mesh flattens to the minimum z-vertex of the modification polygon.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html#modifications)
    */
  var modifications: js.UndefOr[SceneModificationsProperties] = js.native
}

object IntegratedMeshLayerProperties {
  @scala.inline
  def apply(): IntegratedMeshLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntegratedMeshLayerProperties]
  }
  @scala.inline
  implicit class IntegratedMeshLayerPropertiesOps[Self <: IntegratedMeshLayerProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setElevationInfo(value: IntegratedMeshLayerElevationInfo): Self = this.set("elevationInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElevationInfo: Self = this.set("elevationInfo", js.undefined)
    @scala.inline
    def setModifications(value: SceneModificationsProperties): Self = this.set("modifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModifications: Self = this.set("modifications", js.undefined)
  }
  
}

