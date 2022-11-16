package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Collection
import typings.arcgisJsApi.esri.VoxelIsosurface
import typings.arcgisJsApi.esri.VoxelTransferFunctionStyle
import typings.arcgisJsApi.esri.VoxelUniqueValue
import typings.arcgisJsApi.esri.VoxelVariableStyle
import typings.arcgisJsApi.esri.VoxelVariableStyleProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriLayersVoxelVoxelVariableStyleMod {
  
  @JSImport("esri/layers/voxel/VoxelVariableStyle", JSImport.Namespace)
  @js.native
  /**
    * The VoxelVariableStyle allows you to define how an individual variable is rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariableStyle.html)
    */
  open class ^ ()
    extends StObject
       with VoxelVariableStyle {
    def this(properties: VoxelVariableStyleProperties) = this()
    
    /**
      * The collection of continuous variable isosurfaces.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariableStyle.html#isosurfaces)
      */
    /* CompleteClass */
    var isosurfaces: Collection[VoxelIsosurface] = js.native
    
    /**
      * The variable label.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariableStyle.html#label)
      */
    /* CompleteClass */
    var label: String = js.native
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
    
    /**
      * The transferFunction describes how to render continuous variable volumes and sections.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariableStyle.html#transferFunction)
      */
    /* CompleteClass */
    var transferFunction: VoxelTransferFunctionStyle = js.native
    
    /**
      * The collection of unique values describes how to render discrete variable volumes and sections.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariableStyle.html#uniqueValues)
      */
    /* CompleteClass */
    var uniqueValues: Collection[VoxelUniqueValue] = js.native
    
    /**
      * Id of the [VoxelVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariable.html) that the style applies to.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-voxel-VoxelVariableStyle.html#variableId)
      */
    /* CompleteClass */
    var variableId: Double = js.native
  }
  @JSImport("esri/layers/voxel/VoxelVariableStyle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): VoxelVariableStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[VoxelVariableStyle]
}
