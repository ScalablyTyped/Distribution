package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.euclidean
import typings.arcgisJsApi.arcgisJsApiStrings.geodesic
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AreaMeasurement3DViewModelMeasurement extends Object {
  
  /**
    * The area of the polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement3D-AreaMeasurement3DViewModel.html#measurement)
    */
  var area: MeasurementValue = js.native
  
  /**
    * Describes the mode in which the measurement was taken.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement3D-AreaMeasurement3DViewModel.html#measurement)
    */
  var measurementMode: euclidean | geodesic = js.native
  
  /**
    * The perimeter length of the polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-AreaMeasurement3D-AreaMeasurement3DViewModel.html#measurement)
    */
  var perimeterLength: MeasurementValue = js.native
}
object AreaMeasurement3DViewModelMeasurement {
  
  @scala.inline
  def apply(
    area: MeasurementValue,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    measurementMode: euclidean | geodesic,
    perimeterLength: MeasurementValue,
    propertyIsEnumerable: PropertyKey => Boolean
  ): AreaMeasurement3DViewModelMeasurement = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), measurementMode = measurementMode.asInstanceOf[js.Any], perimeterLength = perimeterLength.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[AreaMeasurement3DViewModelMeasurement]
  }
  
  @scala.inline
  implicit class AreaMeasurement3DViewModelMeasurementOps[Self <: AreaMeasurement3DViewModelMeasurement] (val x: Self) extends AnyVal {
    
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
    def setArea(value: MeasurementValue): Self = this.set("area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeasurementMode(value: euclidean | geodesic): Self = this.set("measurementMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerimeterLength(value: MeasurementValue): Self = this.set("perimeterLength", value.asInstanceOf[js.Any])
  }
}
