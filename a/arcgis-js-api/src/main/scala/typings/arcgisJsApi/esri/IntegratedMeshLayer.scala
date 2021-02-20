package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`integrated-mesh`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntegratedMeshLayer
  extends Layer
     with SceneService
     with PortalLayer
     with ScaleRangeLayer {
  
  /**
    * Specifies how the mesh is placed on the vertical axis (z).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html#elevationInfo)
    */
  var elevationInfo: IntegratedMeshLayerElevationInfo = js.native
  
  /**
    * A collection of [SceneModification](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-SceneModification.html) with polygons and types to apply client-side modifications.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html#modifications)
    */
  var modifications: SceneModifications = js.native
  
  @JSName("type")
  val type_IntegratedMeshLayer: `integrated-mesh` = js.native
}
