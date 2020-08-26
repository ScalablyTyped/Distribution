package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Format extends js.Object {
  /**
    * Contains information that describes how this Format should be converted.  This property should only be set when creating a custom Format.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#conversionInfo)
    *
    * @default null
    */
  var conversionInfo: ConversionInfo = js.native
  /**
    * A array of [Coordinate Segments](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#CoordinateSegment).  Each segment represents a section of the Format's coordinate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#coordinateSegments)
    *
    * @default null
    */
  var coordinateSegments: js.Array[CoordinateSegment] = js.native
  /**
    * A string that serves as a pattern describing how this Format should be displayed.  The pattern should contain all of aliases specified by the Format's [coordinateSegments property](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#coordinateSegments).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#currentPattern)
    *
    * @default null
    */
  var currentPattern: String = js.native
  /**
    * The default pattern describing how this Format should be displayed.  See [currentPattern](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#currentPattern).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#defaultPattern)
    *
    * @default null
    */
  var defaultPattern: String = js.native
  /**
    * The name of the coordinate.  A [CoordinateConversion](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion.html) widget should not contain multiple Formats with the same name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#name)
    *
    * @default null
    */
  var name: String = js.native
  /**
    * The [SpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html) for this format.  Coordinates generated for a format will be derived from points in this spatial reference.
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

object Format {
  @scala.inline
  def apply(
    conversionInfo: ConversionInfo,
    coordinateSegments: js.Array[CoordinateSegment],
    currentPattern: String,
    defaultPattern: String,
    name: String,
    spatialReference: SpatialReference,
    viewModel: CoordinateConversionViewModel
  ): Format = {
    val __obj = js.Dynamic.literal(conversionInfo = conversionInfo.asInstanceOf[js.Any], coordinateSegments = coordinateSegments.asInstanceOf[js.Any], currentPattern = currentPattern.asInstanceOf[js.Any], defaultPattern = defaultPattern.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], spatialReference = spatialReference.asInstanceOf[js.Any], viewModel = viewModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
  @scala.inline
  implicit class FormatOps[Self <: Format] (val x: Self) extends AnyVal {
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
    def setCoordinateSegmentsVarargs(value: CoordinateSegment*): Self = this.set("coordinateSegments", js.Array(value :_*))
    @scala.inline
    def setCoordinateSegments(value: js.Array[CoordinateSegment]): Self = this.set("coordinateSegments", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentPattern(value: String): Self = this.set("currentPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultPattern(value: String): Self = this.set("defaultPattern", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpatialReference(value: SpatialReference): Self = this.set("spatialReference", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewModel(value: CoordinateConversionViewModel): Self = this.set("viewModel", value.asInstanceOf[js.Any])
  }
  
}

