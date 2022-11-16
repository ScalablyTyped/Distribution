package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoxelDynamicSectionProperties extends StObject {
  
  /**
    * Whether or not the dynamic section is enabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelDynamicSection.html#enabled)
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The label for the dynamic section.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelDynamicSection.html#label)
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * The orientation angle (in the degrees) of the dynamic section plane.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelDynamicSection.html#orientation)
    */
  var orientation: js.UndefOr[Double] = js.undefined
  
  /**
    * A point on the dynamic section plane specified as [x ,y, z] in voxel space for XYZ and XYZT volumes and as [x, y, t] for XYT volumes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelDynamicSection.html#point)
    */
  var point: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The tilt angle (in degrees) of the dynamic section plane.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelDynamicSection.html#tilt)
    */
  var tilt: js.UndefOr[Double] = js.undefined
}
object VoxelDynamicSectionProperties {
  
  inline def apply(): VoxelDynamicSectionProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoxelDynamicSectionProperties]
  }
  
  extension [Self <: VoxelDynamicSectionProperties](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOrientation(value: Double): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPoint(value: js.Array[Double]): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    
    inline def setPointVarargs(value: Double*): Self = StObject.set(x, "point", js.Array(value*))
    
    inline def setTilt(value: Double): Self = StObject.set(x, "tilt", value.asInstanceOf[js.Any])
    
    inline def setTiltUndefined: Self = StObject.set(x, "tilt", js.undefined)
  }
}
