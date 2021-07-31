package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TravelMode
  extends StObject
     with Object {
  
  /**
    * The description explaining the selected travel mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#TravelMode)
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier specific for this travel mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#TravelMode)
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The cost attribute on which to optimize the analysis.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#TravelMode)
    */
  var impedanceAttributeName: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the travel mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#TravelMode)
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The time-based cost attribute for reporting directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#TravelMode)
    */
  var timeAttributeName: js.UndefOr[String] = js.undefined
}
object TravelMode {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): TravelMode = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[TravelMode]
  }
  
  @scala.inline
  implicit class TravelModeMutableBuilder[Self <: TravelMode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setImpedanceAttributeName(value: String): Self = StObject.set(x, "impedanceAttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImpedanceAttributeNameUndefined: Self = StObject.set(x, "impedanceAttributeName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setTimeAttributeName(value: String): Self = StObject.set(x, "timeAttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeAttributeNameUndefined: Self = StObject.set(x, "timeAttributeName", js.undefined)
  }
}
