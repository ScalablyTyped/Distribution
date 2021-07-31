package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Format
  extends StObject
     with Accessor {
  
  /**
    * Contains information that describes how this Format should be converted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#conversionInfo)
    */
  var conversionInfo: ConversionInfo = js.native
  
  /**
    * A array of [Coordinate Segments](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#CoordinateSegment).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#coordinateSegments)
    */
  var coordinateSegments: js.Array[CoordinateSegment] = js.native
  
  /**
    * A string that serves as a pattern describing how this Format should be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#currentPattern)
    */
  var currentPattern: String = js.native
  
  /**
    * The default pattern describing how this Format should be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#defaultPattern)
    */
  var defaultPattern: String = js.native
  
  /**
    * The name of the coordinate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#name)
    */
  var name: String = js.native
  
  /**
    * The [SpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html) for this format.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#spatialReference)
    */
  var spatialReference: SpatialReference = js.native
  
  /**
    * The view model of the [CoordinateConversion](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html) widget that is utilizing this format.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#viewModel)
    */
  var viewModel: CoordinateConversionViewModel = js.native
}
