package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoxelVariableStyleProperties extends StObject {
  
  /**
    * The collection of continuous variable isosurfaces.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariableStyle.html#isosurfaces)
    */
  var isosurfaces: js.UndefOr[CollectionProperties[VoxelIsosurface]] = js.undefined
  
  /**
    * The variable label.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariableStyle.html#label)
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * The transferFunction describes how to render continuous variable volumes and sections.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariableStyle.html#transferFunction)
    */
  var transferFunction: js.UndefOr[VoxelTransferFunctionStyleProperties] = js.undefined
  
  /**
    * The collection of unique values describes how to render discrete variable volumes and sections.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariableStyle.html#uniqueValues)
    */
  var uniqueValues: js.UndefOr[CollectionProperties[VoxelUniqueValue]] = js.undefined
  
  /**
    * Id of the [VoxelVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariable.html) that the style applies to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariableStyle.html#variableId)
    */
  var variableId: js.UndefOr[Double] = js.undefined
}
object VoxelVariableStyleProperties {
  
  inline def apply(): VoxelVariableStyleProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoxelVariableStyleProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VoxelVariableStyleProperties] (val x: Self) extends AnyVal {
    
    inline def setIsosurfaces(value: CollectionProperties[VoxelIsosurface]): Self = StObject.set(x, "isosurfaces", value.asInstanceOf[js.Any])
    
    inline def setIsosurfacesUndefined: Self = StObject.set(x, "isosurfaces", js.undefined)
    
    inline def setIsosurfacesVarargs(value: VoxelIsosurface*): Self = StObject.set(x, "isosurfaces", js.Array(value*))
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setTransferFunction(value: VoxelTransferFunctionStyleProperties): Self = StObject.set(x, "transferFunction", value.asInstanceOf[js.Any])
    
    inline def setTransferFunctionUndefined: Self = StObject.set(x, "transferFunction", js.undefined)
    
    inline def setUniqueValues(value: CollectionProperties[VoxelUniqueValue]): Self = StObject.set(x, "uniqueValues", value.asInstanceOf[js.Any])
    
    inline def setUniqueValuesUndefined: Self = StObject.set(x, "uniqueValues", js.undefined)
    
    inline def setUniqueValuesVarargs(value: VoxelUniqueValue*): Self = StObject.set(x, "uniqueValues", js.Array(value*))
    
    inline def setVariableId(value: Double): Self = StObject.set(x, "variableId", value.asInstanceOf[js.Any])
    
    inline def setVariableIdUndefined: Self = StObject.set(x, "variableId", js.undefined)
  }
}
