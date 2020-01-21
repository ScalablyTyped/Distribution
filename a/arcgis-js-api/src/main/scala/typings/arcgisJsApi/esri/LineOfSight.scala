package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineOfSight extends Widget_ {
  /**
    * A reference to the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight.html#view)
    */
  var view: SceneView = js.native
  /**
    * The view model for this widget. This is a class that contains the properties and methods that control this widget's behavior. See the {@link module:esri/widgets/LineOfSight/LineOfSightViewModel} class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight.html#viewModel)
    */
  var viewModel: LineOfSightViewModel = js.native
}

@JSGlobal("__esri.LineOfSight")
@js.native
object LineOfSight extends TopLevel[LineOfSightConstructor]

