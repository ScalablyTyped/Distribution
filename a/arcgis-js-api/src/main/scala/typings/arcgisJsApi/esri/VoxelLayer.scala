package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.surfaces
import typings.arcgisJsApi.arcgisJsApiStrings.volume
import typings.arcgisJsApi.arcgisJsApiStrings.voxel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoxelLayer
  extends StObject
     with Layer
     with SceneService
     with PortalLayer
     with ScaleRangeLayer
     with APIKeyMixin {
  
  /**
    * The variable that is being displayed.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VoxelLayer.html#currentVariableId)
    */
  var currentVariableId: Double = js.native
  
  /**
    * Returns a [VoxelVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-VoxelVariable.html) based on an id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VoxelLayer.html#getVariable)
    */
  def getVariable(variableId: Double): scala.Unit = js.native
  def getVariable(variableId: VoxelVariable): scala.Unit = js.native
  
  /**
    * Current rendering mode for the [VoxelLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VoxelLayer.html).
    *
    * @default "volume"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VoxelLayer.html#renderMode)
    */
  var renderMode: volume | surfaces = js.native
  
  @JSName("type")
  val type_VoxelLayer: voxel = js.native
  
  /**
    * The collection of variables that the VoxelLayer has data for.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VoxelLayer.html#variables)
    */
  val variables: Collection[VoxelVariable] = js.native
  
  /**
    * The collection of volume styles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VoxelLayer.html#volumeStyles)
    */
  var volumeStyles: Collection[VoxelVolumeStyle] = js.native
}
