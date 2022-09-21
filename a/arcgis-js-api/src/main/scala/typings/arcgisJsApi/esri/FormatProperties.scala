package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatProperties extends StObject {
  
  /**
    * Contains information that describes how this Format should be converted.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#conversionInfo)
    */
  var conversionInfo: js.UndefOr[ConversionInfo] = js.undefined
  
  /**
    * A array of [Coordinate Segments](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#CoordinateSegment).
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#coordinateSegments)
    */
  var coordinateSegments: js.UndefOr[js.Array[CoordinateSegment]] = js.undefined
  
  /**
    * A string that serves as a pattern describing how this Format should be displayed.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#currentPattern)
    */
  var currentPattern: js.UndefOr[String] = js.undefined
  
  /**
    * The default pattern describing how this Format should be displayed.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#defaultPattern)
    */
  var defaultPattern: js.UndefOr[String] = js.undefined
  
  /**
    * A string that is used to label this Format in the UI.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#label)
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the coordinate.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#name)
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The [SpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html) for this format.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  
  /**
    * The view model of the [CoordinateConversion](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html) widget that is utilizing this format.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#viewModel)
    */
  var viewModel: js.UndefOr[CoordinateConversionViewModelProperties] = js.undefined
}
object FormatProperties {
  
  inline def apply(): FormatProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatProperties]
  }
  
  extension [Self <: FormatProperties](x: Self) {
    
    inline def setConversionInfo(value: ConversionInfo): Self = StObject.set(x, "conversionInfo", value.asInstanceOf[js.Any])
    
    inline def setConversionInfoUndefined: Self = StObject.set(x, "conversionInfo", js.undefined)
    
    inline def setCoordinateSegments(value: js.Array[CoordinateSegment]): Self = StObject.set(x, "coordinateSegments", value.asInstanceOf[js.Any])
    
    inline def setCoordinateSegmentsUndefined: Self = StObject.set(x, "coordinateSegments", js.undefined)
    
    inline def setCoordinateSegmentsVarargs(value: CoordinateSegment*): Self = StObject.set(x, "coordinateSegments", js.Array(value*))
    
    inline def setCurrentPattern(value: String): Self = StObject.set(x, "currentPattern", value.asInstanceOf[js.Any])
    
    inline def setCurrentPatternUndefined: Self = StObject.set(x, "currentPattern", js.undefined)
    
    inline def setDefaultPattern(value: String): Self = StObject.set(x, "defaultPattern", value.asInstanceOf[js.Any])
    
    inline def setDefaultPatternUndefined: Self = StObject.set(x, "defaultPattern", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    
    inline def setViewModel(value: CoordinateConversionViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
  }
}
