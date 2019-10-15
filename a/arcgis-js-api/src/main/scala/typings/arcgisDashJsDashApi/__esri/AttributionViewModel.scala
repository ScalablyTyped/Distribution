package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.disabled
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.loading
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
    * The view model's state.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution-AttributionViewModel.html#state)
    *
    * @default disabled
    */
  val state: disabled | ready | loading = js.native
  /**
    * The view from which the view model will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution-AttributionViewModel.html#view)
    */
  var view: MapView | SceneView = js.native
}

@JSGlobal("__esri.AttributionViewModel")
@js.native
object AttributionViewModel extends TopLevel[AttributionViewModelConstructor]

