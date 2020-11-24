package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.date
import typings.arcgisJsApi.arcgisJsApiStrings.season
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DaylightProperties extends WidgetProperties {
  
  /**
    * Controls whether the widget displays a date or a season picker.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#dateOrSeason)
    */
  var dateOrSeason: js.UndefOr[season | date] = js.native
  
  /**
    * Controls the speed of the daytime and date animation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#playSpeedMultiplier)
    */
  var playSpeedMultiplier: js.UndefOr[Double] = js.native
  
  /**
    * Sets steps, or intervals, on the time slider to restrict the times of the day that can be selected when dragging the thumb.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#timeSliderSteps)
    */
  var timeSliderSteps: js.UndefOr[Double | js.Array[Double]] = js.native
  
  /**
    * A reference to the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#view)
    */
  var view: js.UndefOr[SceneViewProperties] = js.native
  
  /**
    * The view model for the Daylight widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#viewModel)
    */
  var viewModel: js.UndefOr[DaylightViewModelProperties] = js.native
  
  /**
    * This property provides the ability to display or hide the individual elements of the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#visibleElements)
    */
  var visibleElements: js.UndefOr[DaylightVisibleElements] = js.native
}
object DaylightProperties {
  
  @scala.inline
  def apply(): DaylightProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DaylightProperties]
  }
  
  @scala.inline
  implicit class DaylightPropertiesOps[Self <: DaylightProperties] (val x: Self) extends AnyVal {
    
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
    def setDateOrSeason(value: season | date): Self = this.set("dateOrSeason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateOrSeason: Self = this.set("dateOrSeason", js.undefined)
    
    @scala.inline
    def setPlaySpeedMultiplier(value: Double): Self = this.set("playSpeedMultiplier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaySpeedMultiplier: Self = this.set("playSpeedMultiplier", js.undefined)
    
    @scala.inline
    def setTimeSliderStepsVarargs(value: Double*): Self = this.set("timeSliderSteps", js.Array(value :_*))
    
    @scala.inline
    def setTimeSliderSteps(value: Double | js.Array[Double]): Self = this.set("timeSliderSteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeSliderSteps: Self = this.set("timeSliderSteps", js.undefined)
    
    @scala.inline
    def setView(value: SceneViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    
    @scala.inline
    def setViewModel(value: DaylightViewModelProperties): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
    
    @scala.inline
    def setVisibleElements(value: DaylightVisibleElements): Self = this.set("visibleElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleElements: Self = this.set("visibleElements", js.undefined)
  }
}
