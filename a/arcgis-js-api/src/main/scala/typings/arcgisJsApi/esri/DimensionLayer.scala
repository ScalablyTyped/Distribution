package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.dimension
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DimensionLayer
  extends StObject
     with Layer {
  
  /**
    * The analysis object that stores the dimension shapes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-DimensionLayer.html#source)
    */
  var source: DimensionAnalysis = js.native
  
  /**
    * The spatial reference of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-DimensionLayer.html#spatialReference)
    */
  val spatialReference: SpatialReference = js.native
  
  /**
    * The style defines how the dimension objects of this layer are displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-DimensionLayer.html#style)
    */
  var style: DimensionSimpleStyle = js.native
  
  @JSName("type")
  val type_DimensionLayer: dimension = js.native
}
