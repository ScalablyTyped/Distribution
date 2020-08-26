package typings.arcgisJsApi.esri

import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectionsViewModelSelectedTravelMode extends TravelMode {
  /**
    * The description explaining the selected travel mode. A listing of these descriptions can be found in the [ArcGIS Online documentation](https://doc.arcgis.com/en/arcgis-online/reference/travel-modes.htm#GUID-96DF7F50-E0B2-4BF3-8271-EB515D3F0107).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#selectedTravelMode)
    */
  @JSName("description")
  var description_DirectionsViewModelSelectedTravelMode: String = js.native
  /**
    * The unique identifier specific for this travel mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#selectedTravelMode)
    */
  @JSName("id")
  var id_DirectionsViewModelSelectedTravelMode: String = js.native
  /**
    * The cost attribute on which to optimize the analysis. For example `Miles`, `Minutes`, `Travel Time`, `Kilometers`, `TimeAt1KPH`, `WalkTime`, and `TruckTravelTime`. Take note that attribute names are specific to the network dataset. They may be different if using another Network Analysis service besides the one hosted via ArcGIS Online.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#selectedTravelMode)
    */
  @JSName("impedanceAttributeName")
  var impedanceAttributeName_DirectionsViewModelSelectedTravelMode: String = js.native
  /**
    * Name of the travel mode. Users of ArcGIS Online or ArcGIS Enterprise can define custom travel modes inside their Organization settings. Authors of stand alone Network Analysis Services can define their own travel modes inside a network dataset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#selectedTravelMode)
    */
  @JSName("name")
  var name_DirectionsViewModelSelectedTravelMode: String = js.native
  /**
    * The time-based cost attribute for reporting directions. For example, `Minutes`, `Travel Time`, `TimeAt1KPH`, `WalkTime`, and `TruckTravelTime`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#selectedTravelMode)
    */
  @JSName("timeAttributeName")
  var timeAttributeName_DirectionsViewModelSelectedTravelMode: String = js.native
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
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id.asInstanceOf[js.Any], impedanceAttributeName = impedanceAttributeName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), timeAttributeName = timeAttributeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsViewModelSelectedTravelMode]
  }
  @scala.inline
  implicit class DirectionsViewModelSelectedTravelModeOps[Self <: DirectionsViewModelSelectedTravelMode] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setImpedanceAttributeName(value: String): Self = this.set("impedanceAttributeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeAttributeName(value: String): Self = this.set("timeAttributeName", value.asInstanceOf[js.Any])
  }
  
}

