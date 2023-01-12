package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoxelVariableStyle
  extends StObject
     with JSONSupport {
  
  /**
    * The collection of continuous variable isosurfaces.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariableStyle.html#isosurfaces)
    */
  var isosurfaces: Collection[VoxelIsosurface]
  
  /**
    * The variable label.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariableStyle.html#label)
    */
  var label: String
  
  /**
    * The transferFunction describes how to render continuous variable volumes and sections.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariableStyle.html#transferFunction)
    */
  var transferFunction: VoxelTransferFunctionStyle
  
  /**
    * The collection of unique values describes how to render discrete variable volumes and sections.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariableStyle.html#uniqueValues)
    */
  var uniqueValues: Collection[VoxelUniqueValue]
  
  /**
    * Id of the [VoxelVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariable.html) that the style applies to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariableStyle.html#variableId)
    */
  var variableId: Double
}
object VoxelVariableStyle {
  
  inline def apply(
    isosurfaces: Collection[VoxelIsosurface],
    label: String,
    toJSON: () => Any,
    transferFunction: VoxelTransferFunctionStyle,
    uniqueValues: Collection[VoxelUniqueValue],
    variableId: Double
  ): VoxelVariableStyle = {
    val __obj = js.Dynamic.literal(isosurfaces = isosurfaces.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), transferFunction = transferFunction.asInstanceOf[js.Any], uniqueValues = uniqueValues.asInstanceOf[js.Any], variableId = variableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxelVariableStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VoxelVariableStyle] (val x: Self) extends AnyVal {
    
    inline def setIsosurfaces(value: Collection[VoxelIsosurface]): Self = StObject.set(x, "isosurfaces", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setTransferFunction(value: VoxelTransferFunctionStyle): Self = StObject.set(x, "transferFunction", value.asInstanceOf[js.Any])
    
    inline def setUniqueValues(value: Collection[VoxelUniqueValue]): Self = StObject.set(x, "uniqueValues", value.asInstanceOf[js.Any])
    
    inline def setVariableId(value: Double): Self = StObject.set(x, "variableId", value.asInstanceOf[js.Any])
  }
}
