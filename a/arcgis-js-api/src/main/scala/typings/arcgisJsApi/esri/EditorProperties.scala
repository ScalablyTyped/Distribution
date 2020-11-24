package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorProperties extends WidgetProperties {
  
  /**
    * An array of string values which specifies what end users are allowed to edit.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#allowedWorkflows)
    */
  var allowedWorkflows: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * An array of editing configurations for individual layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#layerInfos)
    */
  var layerInfos: js.UndefOr[js.Array[LayerInfo]] = js.native
  
  /**
    * This property allows customization of supporting Editor widgets and their default behavior.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#supportingWidgetDefaults)
    */
  var supportingWidgetDefaults: js.UndefOr[SupportingWidgetDefaults] = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#viewModel)
    */
  var viewModel: js.UndefOr[EditorViewModelProperties] = js.native
}
object EditorProperties {
  
  @scala.inline
  def apply(): EditorProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorProperties]
  }
  
  @scala.inline
  implicit class EditorPropertiesOps[Self <: EditorProperties] (val x: Self) extends AnyVal {
    
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
    def setAllowedWorkflowsVarargs(value: String*): Self = this.set("allowedWorkflows", js.Array(value :_*))
    
    @scala.inline
    def setAllowedWorkflows(value: js.Array[String]): Self = this.set("allowedWorkflows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedWorkflows: Self = this.set("allowedWorkflows", js.undefined)
    
    @scala.inline
    def setLayerInfosVarargs(value: LayerInfo*): Self = this.set("layerInfos", js.Array(value :_*))
    
    @scala.inline
    def setLayerInfos(value: js.Array[LayerInfo]): Self = this.set("layerInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayerInfos: Self = this.set("layerInfos", js.undefined)
    
    @scala.inline
    def setSupportingWidgetDefaults(value: SupportingWidgetDefaults): Self = this.set("supportingWidgetDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportingWidgetDefaults: Self = this.set("supportingWidgetDefaults", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    
    @scala.inline
    def setViewModel(value: EditorViewModelProperties): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
  }
}
