package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import typings.arcgisJsApi.arcgisJsApiStrings.sliced
import typings.arcgisJsApi.arcgisJsApiStrings.slicing
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
    * The shape used to slice elements in a 3D scene. Currently the only supported shape is a plane.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SliceViewModel.html#shape)
    */
  var shape: SlicePlane = js.native
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
    * Enable tilting the slice shape. If set to true, the slice shape will orient itself as best as possible to the surface under the cursor when first placing the shape. If set to false, the slice shape is restricted to be either horizontal or vertical.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SliceViewModel.html#tiltEnabled)
    *
    * @default false
    */
  var tiltEnabled: Boolean = js.native
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SliceViewModel.html#view)
    */
  var view: SceneView = js.native
  /**
    * Clears the current slice.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SliceViewModel.html#clear)
    *
    *
    */
  def clear(): Unit = js.native
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
  /**
    * Starts a new slice.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SliceViewModel.html#start)
    *
    *
    */
  def start(): Unit = js.native
}

