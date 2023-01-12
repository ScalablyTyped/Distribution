package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoxelDynamicSection
  extends StObject
     with JSONSupport {
  
  /**
    * Whether or not the dynamic section is enabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelDynamicSection.html#enabled)
    */
  var enabled: Boolean
  
  /**
    * The label for the dynamic section.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelDynamicSection.html#label)
    */
  var label: String
  
  /**
    * The orientation angle (in the degrees) of the dynamic section plane.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelDynamicSection.html#orientation)
    */
  var orientation: Double
  
  /**
    * A point on the dynamic section plane specified as [x ,y, z] in voxel space for XYZ and XYZT volumes and as [x, y, t] for XYT volumes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelDynamicSection.html#point)
    */
  var point: js.Array[Double]
  
  /**
    * The tilt angle (in degrees) of the dynamic section plane.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelDynamicSection.html#tilt)
    */
  var tilt: Double
}
object VoxelDynamicSection {
  
  inline def apply(
    enabled: Boolean,
    label: String,
    orientation: Double,
    point: js.Array[Double],
    tilt: Double,
    toJSON: () => Any
  ): VoxelDynamicSection = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], tilt = tilt.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[VoxelDynamicSection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VoxelDynamicSection] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setOrientation(value: Double): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: js.Array[Double]): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointVarargs(value: Double*): Self = StObject.set(x, "point", js.Array(value*))
    
    inline def setTilt(value: Double): Self = StObject.set(x, "tilt", value.asInstanceOf[js.Any])
  }
}
