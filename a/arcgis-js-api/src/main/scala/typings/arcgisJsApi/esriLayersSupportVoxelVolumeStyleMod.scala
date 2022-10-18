package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.VoxelVolumeStyle
import typings.arcgisJsApi.esri.VoxelVolumeStyleConstructor
import typings.arcgisJsApi.esri.VoxelVolumeStyleProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriLayersSupportVoxelVolumeStyleMod extends Shortcut {
  
  @JSImport("esri/layers/support/VoxelVolumeStyle", JSImport.Namespace)
  @js.native
  val ^ : js.Object & VoxelVolumeStyleConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/support/VoxelVolumeStyle", JSImport.Namespace)
  @js.native
  /**
    * The VolumeStyle allows you to define rendering properties that apply to the volume itself, such as vertical exaggeration and offset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-VoxelVolumeStyle.html)
    */
  open class Class ()
    extends StObject
       with VoxelVolumeStyle {
    def this(properties: VoxelVolumeStyleProperties) = this()
    
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
  
  type _To = js.Object & VoxelVolumeStyleConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriLayersSupportVoxelVolumeStyleMod.foo` */
  override def _to: js.Object & VoxelVolumeStyleConstructor = ^
}
