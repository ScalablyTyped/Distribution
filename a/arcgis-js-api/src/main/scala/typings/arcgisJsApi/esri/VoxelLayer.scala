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
    * Controls whether or not to globally disable all dynamic sections in the current [VoxelVolumeStyle](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVolumeStyle.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VoxelLayer.html#enableDynamicSections)
    */
  var enableDynamicSections: Boolean = js.native
  
  /**
    * Controls whether or not to globally disable all isosurfaces in the current [VoxelVariableStyle](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariableStyle.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VoxelLayer.html#enableIsosurfaces)
    */
  var enableIsosurfaces: Boolean = js.native
  
  /**
    * Controls whether or not to globally disable all slices in the current [VoxelVolumeStyle](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVolumeStyle.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VoxelLayer.html#enableSlices)
    */
  var enableSlices: Boolean = js.native
  
  /**
    * Returns a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) for a given value for the continuous [VoxelVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariable.html) identified by variableId using the variable's [VoxelTransferFunctionStyle](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelTransferFunctionStyle.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VoxelLayer.html#getColorForContinuousDataValue)
    */
  def getColorForContinuousDataValue(variableId: Double, dataValue: Double, applyOpacityStops: Boolean): Color_ | Null = js.native
  
  /**
    * Returns a [VoxelVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariable.html) based on an id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VoxelLayer.html#getVariable)
    */
  def getVariable(): voxelVoxelVariable | Null = js.native
  def getVariable(variableId: Double): voxelVoxelVariable | Null = js.native
  
  /**
    * Returns a [VoxelVariableStyle](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariableStyle.html) based on an id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VoxelLayer.html#getVariableStyle)
    */
  def getVariableStyle(): VoxelVariableStyle | Null = js.native
  def getVariableStyle(variableId: Double): VoxelVariableStyle | Null = js.native
  
  /**
    * Returns a [VoxelVolume](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVolume.html) based on the id of a [VoxelVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariable.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VoxelLayer.html#getVolume)
    */
  def getVolume(): VoxelVolume | Null = js.native
  def getVolume(variableId: Double): VoxelVolume | Null = js.native
  
  /**
    * Returns a [VoxelVolumeStyle](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVolumeStyle.html) based on the id of a [VoxelVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariable.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VoxelLayer.html#getVolumeStyle)
    */
  def getVolumeStyle(): voxelVoxelVolumeStyle | Null = js.native
  def getVolumeStyle(variableId: Double): voxelVoxelVolumeStyle | Null = js.native
  
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VoxelLayer.html#legendEnabled)
    */
  var legendEnabled: Boolean = js.native
  
  /**
    * Indicates whether to display popups when voxels in the layer are clicked.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VoxelLayer.html#popupEnabled)
    */
  var popupEnabled: Boolean = js.native
  
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
    * The collection of variable styles, containing exactly one [VoxelVariableStyle](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariableStyle.html) for each [VoxelVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariable.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VoxelLayer.html#variableStyles)
    */
  var variableStyles: Collection[VoxelVariableStyle] = js.native
  
  /**
    * The collection of variables that the VoxelLayer has data for.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VoxelLayer.html#variables)
    */
  val variables: Collection[voxelVoxelVariable] = js.native
  
  /**
    * The collection of volume styles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VoxelLayer.html#volumeStyles)
    */
  var volumeStyles: Collection[voxelVoxelVolumeStyle] = js.native
  
  /**
    * The collection of volumes that the VoxelLayer has variables for.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VoxelLayer.html#volumes)
    */
  val volumes: Collection[VoxelVolume] = js.native
}
