package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.VoxelVolumeStyleProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.VoxelVolumeStyle")
@js.native
/**
  * The VolumeStyle allows you to define rendering properties that apply to the volume itself, such as vertical exaggeration and offset.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-VoxelVolumeStyle.html)
  */
open class VoxelVolumeStyle ()
  extends StObject
     with typings.arcgisJsApi.esri.VoxelVolumeStyle {
  def this(properties: VoxelVolumeStyleProperties) = this()
  
  /**
    * The collection of [VoxelDynamicSection](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelDynamicSection.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-VoxelVolumeStyle.html#dynamicSections)
    */
  /* CompleteClass */
  var dynamicSections: typings.arcgisJsApi.esri.Collection[typings.arcgisJsApi.esri.VoxelDynamicSection] = js.native
  
  /**
    * The collection of [VoxelSlice](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelSlice.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-VoxelVolumeStyle.html#slices)
    */
  /* CompleteClass */
  var slices: typings.arcgisJsApi.esri.Collection[typings.arcgisJsApi.esri.VoxelSlice] = js.native
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
  
  /**
    * The vertical exaggeration factor.
    *
    * @default 1
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-VoxelVolumeStyle.html#verticalExaggeration)
    */
  /* CompleteClass */
  var verticalExaggeration: Double = js.native
  
  /**
    * The vertical offset amount.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-VoxelVolumeStyle.html#verticalOffset)
    */
  /* CompleteClass */
  var verticalOffset: Double = js.native
  
  /**
    * Id of the volume.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-VoxelVolumeStyle.html#volumeId)
    */
  /* CompleteClass */
  override val volumeId: Double = js.native
}
/* static members */
object VoxelVolumeStyle {
  
  @JSGlobal("__esri.VoxelVolumeStyle")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.VoxelVolumeStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.VoxelVolumeStyle]
}
