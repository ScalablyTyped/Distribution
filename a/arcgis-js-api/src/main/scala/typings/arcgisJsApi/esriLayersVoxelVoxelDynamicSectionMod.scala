package typings.arcgisJsApi

import typings.arcgisJsApi.esri.VoxelDynamicSection
import typings.arcgisJsApi.esri.VoxelDynamicSectionProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriLayersVoxelVoxelDynamicSectionMod {
  
  @JSImport("esri/layers/voxel/VoxelDynamicSection", JSImport.Namespace)
  @js.native
  /**
  		 * The VoxelDynamicSection allows you to define the properties of an individual dynamic section.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelDynamicSection.html)
  		 */
  open class ^ ()
    extends StObject
       with VoxelDynamicSection {
    def this(properties: VoxelDynamicSectionProperties) = this()
    
    /**
    		 * Whether or not the dynamic section is enabled.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelDynamicSection.html#enabled)
    		 */
    /* CompleteClass */
    var enabled: Boolean = js.native
    
    /**
    		 * The label for the dynamic section.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelDynamicSection.html#label)
    		 */
    /* CompleteClass */
    var label: String = js.native
    
    /**
    		 * The orientation angle (in the degrees) of the dynamic section plane.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelDynamicSection.html#orientation)
    		 */
    /* CompleteClass */
    var orientation: Double = js.native
    
    /**
    		 * A point on the dynamic section plane specified as [x ,y, z] in voxel space for XYZ and XYZT volumes and as [x, y, t] for XYT volumes.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelDynamicSection.html#point)
    		 */
    /* CompleteClass */
    var point: js.Array[Double] = js.native
    
    /**
    		 * The tilt angle (in degrees) of the dynamic section plane.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelDynamicSection.html#tilt)
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
  @JSImport("esri/layers/voxel/VoxelDynamicSection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): VoxelDynamicSection = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[VoxelDynamicSection]
}
