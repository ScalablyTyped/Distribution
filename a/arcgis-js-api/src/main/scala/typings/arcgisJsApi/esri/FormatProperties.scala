package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatProperties extends js.Object {
  
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
  implicit class FormatPropertiesOps[Self <: FormatProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConversionInfo(value: ConversionInfo): Self = this.set("conversionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConversionInfo: Self = this.set("conversionInfo", js.undefined)
    
    @scala.inline
    def setCoordinateSegmentsVarargs(value: CoordinateSegment*): Self = this.set("coordinateSegments", js.Array(value :_*))
    
    @scala.inline
    def setCoordinateSegments(value: js.Array[CoordinateSegment]): Self = this.set("coordinateSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoordinateSegments: Self = this.set("coordinateSegments", js.undefined)
    
    @scala.inline
    def setCurrentPattern(value: String): Self = this.set("currentPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentPattern: Self = this.set("currentPattern", js.undefined)
    
    @scala.inline
    def setDefaultPattern(value: String): Self = this.set("defaultPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultPattern: Self = this.set("defaultPattern", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSpatialReference(value: SpatialReferenceProperties): Self = this.set("spatialReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpatialReference: Self = this.set("spatialReference", js.undefined)
    
    @scala.inline
    def setViewModel(value: CoordinateConversionViewModelProperties): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
  }
}
