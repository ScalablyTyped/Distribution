package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.edit
import typings.arcgisJsApi.arcgisJsApiStrings.view
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputQuantizationParameters
  extends StObject
     with Accessor {
  
  /**
    * An extent defining the quantization grid bounds.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-OutputQuantizationParameters.html#extent)
    */
  var extent: OutputQuantizationParametersExtent = js.native
  
  /**
    * Geometry coordinates are optimized for viewing and displaying of data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-OutputQuantizationParameters.html#quantizeMode)
    */
  var quantizeMode: view | edit = js.native
  
  /**
    * The size of one pixel in the units of the [SpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-OutputQuantizationParameters.html#tolerance)
    */
  var tolerance: Double = js.native
}
