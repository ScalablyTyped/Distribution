package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.VoxelColorStop
import typings.arcgisJsApi.esri.VoxelOpacityStop
import typings.arcgisJsApi.esri.VoxelRangeFilter
import typings.arcgisJsApi.esri.VoxelTransferFunctionStyleProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.VoxelTransferFunctionStyle")
@js.native
/**
  * The VoxelTransferFunctionStyle allows you to define how an individual continuous variable is rendered as a volume or as sections.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelTransferFunctionStyle.html)
  */
open class VoxelTransferFunctionStyle ()
  extends StObject
     with typings.arcgisJsApi.esri.VoxelTransferFunctionStyle {
  def this(properties: VoxelTransferFunctionStyleProperties) = this()
  
  /**
    * A collection of colors and normalized positions which describe how to colorize the data values that are within the [stretchRange](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelTransferFunctionStyle.html#stretchRange).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelTransferFunctionStyle.html#colorStops)
    */
  /* CompleteClass */
  var colorStops: typings.arcgisJsApi.esri.Collection[VoxelColorStop] = js.native
  
  /**
    * A collection of transparency values and normalized positions which describe how to apply transparency to the data values that are within the [stretchRange](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelTransferFunctionStyle.html#stretchRange).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelTransferFunctionStyle.html#opacityStops)
    */
  /* CompleteClass */
  var opacityStops: typings.arcgisJsApi.esri.Collection[VoxelOpacityStop] = js.native
  
  /**
    * Defines the data range which will be rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelTransferFunctionStyle.html#rangeFilter)
    */
  /* CompleteClass */
  var rangeFilter: VoxelRangeFilter = js.native
  
  /**
    * The data range to apply the color and alpha stops to, specified as [minimum, maximum] in the units of the data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelTransferFunctionStyle.html#stretchRange)
    */
  /* CompleteClass */
  var stretchRange: js.Array[Double] = js.native
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object VoxelTransferFunctionStyle {
  
  @JSGlobal("__esri.VoxelTransferFunctionStyle")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.VoxelTransferFunctionStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.VoxelTransferFunctionStyle]
}
