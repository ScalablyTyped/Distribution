package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.VoxelVolumeStyleProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.VoxelVolumeStyle")
@js.native
/**
  * The VolumeStyle allows you to define rendering properties that apply to the volume itself, such as vertical exaggeration and offset.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-VoxelVolumeStyle.html)
  */
open class VoxelVolumeStyleCls ()
  extends StObject
     with typings.arcgisJsApi.esri.VoxelVolumeStyle {
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
