package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineOfSightProperties extends WidgetProperties {
  /**
    * A reference to the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight.html#view)
    */
  var view: js.UndefOr[SceneViewProperties] = js.native
  /**
    * The view model for this widget. This is a class that contains the properties and methods that control this widget's behavior. See the {@link module:esri/widgets/LineOfSight/LineOfSightViewModel} class to access all properties and methods on the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight.html#viewModel)
    */
  var viewModel: js.UndefOr[LineOfSightViewModelProperties] = js.native
}

object LineOfSightProperties {
  @scala.inline
  def apply(): LineOfSightProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineOfSightProperties]
  }
  @scala.inline
  implicit class LineOfSightPropertiesOps[Self <: LineOfSightProperties] (val x: Self) extends AnyVal {
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
    def setView(value: SceneViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    @scala.inline
    def setViewModel(value: LineOfSightViewModelProperties): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
  }
  
}

