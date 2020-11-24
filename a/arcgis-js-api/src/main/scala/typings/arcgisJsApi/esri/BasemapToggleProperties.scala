package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasemapToggleProperties extends WidgetProperties {
  
  /**
    * The next basemap for toggling.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle.html#nextBasemap)
    */
  var nextBasemap: js.UndefOr[BasemapProperties | String] = js.native
  
  /**
    * Indicates if the title of the basemap is visible in the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle.html#titleVisible)
    */
  var titleVisible: js.UndefOr[Boolean] = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle.html#viewModel)
    */
  var viewModel: js.UndefOr[BasemapToggleViewModelProperties] = js.native
  
  /**
    * The visible elements that are displayed within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BasemapToggle.html#visibleElements)
    */
  var visibleElements: js.UndefOr[BasemapToggleVisibleElements] = js.native
}
object BasemapToggleProperties {
  
  @scala.inline
  def apply(): BasemapToggleProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasemapToggleProperties]
  }
  
  @scala.inline
  implicit class BasemapTogglePropertiesOps[Self <: BasemapToggleProperties] (val x: Self) extends AnyVal {
    
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
    def setNextBasemap(value: BasemapProperties | String): Self = this.set("nextBasemap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextBasemap: Self = this.set("nextBasemap", js.undefined)
    
    @scala.inline
    def setTitleVisible(value: Boolean): Self = this.set("titleVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleVisible: Self = this.set("titleVisible", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    
    @scala.inline
    def setViewModel(value: BasemapToggleViewModelProperties): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
    
    @scala.inline
    def setVisibleElements(value: BasemapToggleVisibleElements): Self = this.set("visibleElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleElements: Self = this.set("visibleElements", js.undefined)
  }
}
