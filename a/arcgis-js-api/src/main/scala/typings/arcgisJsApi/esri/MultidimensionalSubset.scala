package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultidimensionalSubset
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The spatial area of interest.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MultidimensionalSubset.html#areaOfInterest)
    */
  var areaOfInterest: Extent | Polygon = js.native
  
  /**
    * The aggregated dimension names and their extents or ranges computed from the [subsetDefinitions](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MultidimensionalSubset.html#subsetDefinitions).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MultidimensionalSubset.html#dimensions)
    */
  val dimensions: js.Array[SubsetDimension] = js.native
  
  /**
    * The variable and dimension subset definitions to set the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MultidimensionalSubset.html#subsetDefinitions)
    */
  var subsetDefinitions: js.Array[DimensionalDefinition] = js.native
  
  /**
    * The aggregated variables list computed from the [subsetDefinitions](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MultidimensionalSubset.html#subsetDefinitions).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MultidimensionalSubset.html#variables)
    */
  val variables: js.Array[String] = js.native
}
