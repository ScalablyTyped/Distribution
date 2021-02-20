package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
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
  implicit class EditorPropertiesMutableBuilder[Self <: EditorProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedWorkflows(value: js.Array[String]): Self = StObject.set(x, "allowedWorkflows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedWorkflowsUndefined: Self = StObject.set(x, "allowedWorkflows", js.undefined)
    
    @scala.inline
    def setAllowedWorkflowsVarargs(value: String*): Self = StObject.set(x, "allowedWorkflows", js.Array(value :_*))
    
    @scala.inline
    def setLayerInfos(value: js.Array[LayerInfo]): Self = StObject.set(x, "layerInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerInfosUndefined: Self = StObject.set(x, "layerInfos", js.undefined)
    
    @scala.inline
    def setLayerInfosVarargs(value: LayerInfo*): Self = StObject.set(x, "layerInfos", js.Array(value :_*))
    
    @scala.inline
    def setSupportingWidgetDefaults(value: SupportingWidgetDefaults): Self = StObject.set(x, "supportingWidgetDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportingWidgetDefaultsUndefined: Self = StObject.set(x, "supportingWidgetDefaults", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModel(value: EditorViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
