package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Collection
import typings.arcgisJsApi.esri.VoxelDynamicSection
import typings.arcgisJsApi.esri.VoxelSlice
import typings.arcgisJsApi.esri.VoxelVolumeStyle
import typings.arcgisJsApi.esri.VoxelVolumeStyleProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriLayersSupportVoxelVolumeStyleMod {
  
  @JSImport("esri/layers/support/VoxelVolumeStyle", JSImport.Namespace)
  @js.native
  /**
    * The VolumeStyle allows you to define rendering properties that apply to the volume itself, such as vertical exaggeration and offset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-VoxelVolumeStyle.html)
    */
  open class ^ ()
    extends StObject
       with VoxelVolumeStyle {
    def this(properties: VoxelVolumeStyleProperties) = this()
    
    /**
      * The collection of [VoxelDynamicSection](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelDynamicSection.html).
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-VoxelVolumeStyle.html#dynamicSections)
      */
    /* CompleteClass */
    var dynamicSections: Collection[VoxelDynamicSection] = js.native
    
    /**
      * The collection of [VoxelSlice](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelSlice.html).
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-VoxelVolumeStyle.html#slices)
      */
    /* CompleteClass */
    var slices: Collection[VoxelSlice] = js.native
    
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
  @JSImport("esri/layers/support/VoxelVolumeStyle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): VoxelVolumeStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[VoxelVolumeStyle]
}
