package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.disabled
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.ready
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributionViewModel extends Accessor {
  /**
    * A collection of [AttributionItem](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution-AttributionViewModel.html#AttributionItem)s.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution-AttributionViewModel.html#items)
    */
  val items: Collection[AttributionItem] = js.native
  /**
    * The view model's state.  **Possible Values:** ready | disabled
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution-AttributionViewModel.html#state)
    *
    * @default disabled
    */
  val state: ready | disabled = js.native
  /**
    * The view from which the view model will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution-AttributionViewModel.html#view)
    */
  var view: MapView | SceneView = js.native
}

@JSGlobal("__esri.AttributionViewModel")
@js.native
/**
  * Provides the logic for the [Attribution](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution.html) widget. Displays attribution text for the layers in a map. The text displayed for the layers is either a list of data providers or sources as defined in the layer's custom attribution data, or the copyright text. The attribution is automatically updated based on layer visibility and map extent.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution-AttributionViewModel.html)
  */
class AttributionViewModelCls () extends AttributionViewModel {
  def this(properties: AttributionViewModelProperties) = this()
}

