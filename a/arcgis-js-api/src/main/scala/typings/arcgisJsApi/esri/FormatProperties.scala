package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatProperties extends StObject {
  
  /**
    * Contains information that describes how this Format should be converted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#conversionInfo)
    */
  var conversionInfo: js.UndefOr[ConversionInfo] = js.native
  
  /**
    * A array of [Coordinate Segments](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#CoordinateSegment).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#coordinateSegments)
    */
  var coordinateSegments: js.UndefOr[js.Array[CoordinateSegment]] = js.native
  
  /**
    * A string that serves as a pattern describing how this Format should be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#currentPattern)
    */
  var currentPattern: js.UndefOr[String] = js.native
  
  /**
    * The default pattern describing how this Format should be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#defaultPattern)
    */
  var defaultPattern: js.UndefOr[String] = js.native
  
  /**
    * The name of the coordinate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#name)
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The [SpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html) for this format.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
  
  /**
    * The view model of the [CoordinateConversion](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html) widget that is utilizing this format.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#viewModel)
    */
  var viewModel: js.UndefOr[CoordinateConversionViewModelProperties] = js.native
}
object FormatProperties {
  
  @scala.inline
  def apply(): FormatProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatProperties]
  }
  
  @scala.inline
  implicit class FormatPropertiesMutableBuilder[Self <: FormatProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConversionInfo(value: ConversionInfo): Self = StObject.set(x, "conversionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversionInfoUndefined: Self = StObject.set(x, "conversionInfo", js.undefined)
    
    @scala.inline
    def setCoordinateSegments(value: js.Array[CoordinateSegment]): Self = StObject.set(x, "coordinateSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinateSegmentsUndefined: Self = StObject.set(x, "coordinateSegments", js.undefined)
    
    @scala.inline
    def setCoordinateSegmentsVarargs(value: CoordinateSegment*): Self = StObject.set(x, "coordinateSegments", js.Array(value :_*))
    
    @scala.inline
    def setCurrentPattern(value: String): Self = StObject.set(x, "currentPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPatternUndefined: Self = StObject.set(x, "currentPattern", js.undefined)
    
    @scala.inline
    def setDefaultPattern(value: String): Self = StObject.set(x, "defaultPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPatternUndefined: Self = StObject.set(x, "defaultPattern", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    
    @scala.inline
    def setViewModel(value: CoordinateConversionViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
  }
}
