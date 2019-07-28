package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectionsViewModelSelectedTravelMode extends TravelMode {
  /**
    * The description explaining the selected travel mode. A listing of these descriptions can be found in the [ArcGIS Online documentation](https://doc.arcgis.com/en/arcgis-online/reference/travel-modes.htm#GUID-96DF7F50-E0B2-4BF3-8271-EB515D3F0107).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#selectedTravelMode)
    */
  @JSName("description")
  var description_DirectionsViewModelSelectedTravelMode: String
  /**
    * The unique identifier specific for this travel mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#selectedTravelMode)
    */
  @JSName("id")
  var id_DirectionsViewModelSelectedTravelMode: String
  /**
    * The cost attribute on which to optimize the analysis. For example `Miles`, `Minutes`, `Travel Time`, `Kilometers`, `TimeAt1KPH`, `WalkTime`, and `TruckTravelTime`. Take note that attribute names are specific to the network dataset. They may be different if using another Network Analysis service besides the one hosted via ArcGIS Online.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#selectedTravelMode)
    */
  @JSName("impedanceAttributeName")
  var impedanceAttributeName_DirectionsViewModelSelectedTravelMode: String
  /**
    * Name of the travel mode. Users of ArcGIS Online or ArcGIS Enterprise can define custom travel modes inside their Organization settings. Authors of stand alone Network Analysis Services can define their own travel modes inside a network dataset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#selectedTravelMode)
    */
  @JSName("name")
  var name_DirectionsViewModelSelectedTravelMode: String
  /**
    * The time-based cost attribute for reporting directions. For example, `Minutes`, `Travel Time`, `TimeAt1KPH`, `WalkTime`, and `TruckTravelTime`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#selectedTravelMode)
    */
  @JSName("timeAttributeName")
  var timeAttributeName_DirectionsViewModelSelectedTravelMode: String
}

object DirectionsViewModelSelectedTravelMode {
  @scala.inline
  def apply(
    constructor: js.Function,
    description: String,
    hasOwnProperty: PropertyKey => Boolean,
    id: String,
    impedanceAttributeName: String,
    name: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    timeAttributeName: String
  ): DirectionsViewModelSelectedTravelMode = {
    val __obj = js.Dynamic.literal(constructor = constructor, description = description, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id, impedanceAttributeName = impedanceAttributeName, name = name, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), timeAttributeName = timeAttributeName)
  
    __obj.asInstanceOf[DirectionsViewModelSelectedTravelMode]
  }
}

