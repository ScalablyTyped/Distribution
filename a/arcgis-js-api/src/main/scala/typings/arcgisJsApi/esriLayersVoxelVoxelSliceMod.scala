package typings.arcgisJsApi

import typings.arcgisJsApi.esri.VoxelSlice
import typings.arcgisJsApi.esri.VoxelSliceProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriLayersVoxelVoxelSliceMod {
  
  @JSImport("esri/layers/voxel/VoxelSlice", JSImport.Namespace)
  @js.native
  /**
  		 * The VoxelSlice allows you to define the properties of an individual slice.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelSlice.html)
  		 */
  open class ^ ()
    extends StObject
       with VoxelSlice {
    def this(properties: VoxelSliceProperties) = this()
    
    /**
    		 * Whether or not the slice is enabled.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelSlice.html#enabled)
    		 */
    /* CompleteClass */
    var enabled: Boolean = js.native
    
    /**
    		 * The label for the slice.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelSlice.html#label)
    		 */
    /* CompleteClass */
    var label: String = js.native
    
    /**
    		 * The orientation angle (in the degrees) of the slice plane.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelSlice.html#orientation)
    		 */
    /* CompleteClass */
    var orientation: Double = js.native
    
    /**
    		 * A point on the slice plane specified as [x ,y, z] in voxel space for XYZ and XYZT volumes and as [x, y, t] for XYT volumes.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelSlice.html#point)
    		 */
    /* CompleteClass */
    var point: js.Array[Double] = js.native
    
    /**
    		 * The tilt angle (in degrees) of the slice plane.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelSlice.html#tilt)
    		 */
    /* CompleteClass */
    var tilt: Double = js.native
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/layers/voxel/VoxelSlice", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): VoxelSlice = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[VoxelSlice]
}
