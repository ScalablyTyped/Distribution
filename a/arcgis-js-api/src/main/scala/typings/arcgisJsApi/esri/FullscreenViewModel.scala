package typings.arcgisJsApi.esri

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullscreenViewModel extends Accessor {
  /**
    * The [HTMLElement](https://developer.mozilla.org/en-US/docs/Web/API/HTMLElement) to present in fullscreen mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Fullscreen-FullscreenViewModel.html#element)
    */
  var element: HTMLElement = js.native
  /**
    * The view model's state.  **Possible Values:** active | ready | feature-unsupported | disabled
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Fullscreen-FullscreenViewModel.html#state)
    *
    * @default disabled
    */
  val state: String = js.native
  /**
    * The view associated with the widget instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Fullscreen-FullscreenViewModel.html#view)
    */
  var view: MapView | SceneView = js.native
  /**
    * Enter fullscreen
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Fullscreen-FullscreenViewModel.html#enter)
    *
    *
    */
  def enter(): Unit = js.native
  /**
    * Exit fullscreen
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Fullscreen-FullscreenViewModel.html#exit)
    *
    *
    */
  def exit(): Unit = js.native
  /**
    * Toggle fullscreen
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Fullscreen-FullscreenViewModel.html#toggle)
    *
    *
    */
  def toggle(): Unit = js.native
}

