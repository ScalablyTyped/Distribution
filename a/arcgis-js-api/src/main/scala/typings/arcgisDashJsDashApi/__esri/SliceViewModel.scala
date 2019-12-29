package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.disabled
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.ready
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.sliced
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.slicing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SliceViewModel extends Accessor {
  /**
    * Indicates whether the [Ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html) and layers that are draped on the ground surface are excluded from the slice.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SliceViewModel.html#excludeGroundSurface)
    *
    * @default false
    */
  var excludeGroundSurface: Boolean = js.native
  /**
    * Add layers to this collection to exclude them from the slice. Layers that are draped on the ground surface are not affected by this property
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SliceViewModel.html#excludedLayers)
    */
  var excludedLayers: Collection[Layer | BuildingComponentSublayer] = js.native
  /**
    * The view model's state.
    *
    * Value | Description
    * ------------|-------------
    * disabled | not ready yet
    * ready | ready for slicing
    * slicing | currently slicing
    * sliced | finished slicing
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SliceViewModel.html#state)
    *
    * @default disabled
    */
  val state: disabled | ready | slicing | sliced = js.native
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SliceViewModel.html#view)
    */
  var view: SceneView = js.native
  /**
    * Clears the current slice.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SliceViewModel.html#clearSlice)
    *
    *
    */
  def clearSlice(): Unit = js.native
  /**
    * Starts a new slice.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SliceViewModel.html#newSlice)
    *
    *
    */
  def newSlice(): Unit = js.native
}

@JSGlobal("__esri.SliceViewModel")
@js.native
object SliceViewModel extends TopLevel[SliceViewModelConstructor]

