package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Slice extends Widget {
  /**
    * A reference to the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice.html#view)
    */
  var view: SceneView = js.native
  /**
    * The view model for this widget. This is a class that contains the properties and methods that control this widget's behavior.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice.html#viewModel)
    */
  var viewModel: SliceViewModel = js.native
  /**
    * *This method is primarily used by developers when implementing custom widgets.* It must be implemented by subclasses for rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice.html#render)
    *
    *
    */
  def render(): js.Any = js.native
}

@JSGlobal("__esri.Slice")
@js.native
/**
  * The slice widget is a 3D analysis tool that can be used to reveal occluded content in a {@link module:esri/views/SceneView}. The slice widget can be applied to any layer type, making it possible to see inside buildings or to explore geological surfaces.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice.html)
  */
class SliceCls () extends Slice {
  def this(properties: SliceProperties) = this()
}

