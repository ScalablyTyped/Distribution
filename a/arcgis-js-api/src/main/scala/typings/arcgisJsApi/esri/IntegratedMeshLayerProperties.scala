package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntegratedMeshLayerProperties
  extends LayerProperties
     with SceneServiceProperties
     with PortalLayerProperties
     with ScaleRangeLayerProperties {
  
  /**
    * Specifies how the mesh is placed on the vertical axis (z).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html#elevationInfo)
    */
  var elevationInfo: js.UndefOr[IntegratedMeshLayerElevationInfo] = js.native
  
  /**
    * A collection of [SceneModification](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SceneModification.html) with polygons and types to apply client-side modifications.
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
