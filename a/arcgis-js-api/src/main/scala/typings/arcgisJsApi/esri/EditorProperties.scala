package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.MapViewPropertiestype2d
import typings.arcgisJsApi.anon.SceneViewPropertiestype3d
import typings.arcgisJsApi.arcgisJsApiStrings.`create-features`
import typings.arcgisJsApi.arcgisJsApiStrings.create
import typings.arcgisJsApi.arcgisJsApiStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorProperties
  extends StObject
     with WidgetProperties {
  
  /**
    * An array of string values which specifies what end users are allowed to edit.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#allowedWorkflows)
    */
  var allowedWorkflows: js.UndefOr[`create-features` | create | update] = js.undefined
  
  /**
    * Indicates the heading level to use for title of the widget.
    *
    * @default 4
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#headingLevel)
    */
  var headingLevel: js.UndefOr[Double] = js.undefined
  
  /**
    * Options to configure the labels shown next to each segment of the geometry being created or updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#labelOptions)
    */
  var labelOptions: js.UndefOr[SketchLabelOptionsProperties] = js.undefined
  
  /**
    * An array of editing configurations for individual layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#layerInfos)
    */
  var layerInfos: js.UndefOr[js.Array[LayerInfo]] = js.undefined
  
  /**
    * The [SnappingOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-interactive-snapping-SnappingOptions.html) for editing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#snappingOptions)
    */
  var snappingOptions: js.UndefOr[SnappingOptionsProperties] = js.undefined
  
  /**
    * This property allows customization of supporting Editor widgets and their default behavior.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#supportingWidgetDefaults)
    */
  var supportingWidgetDefaults: js.UndefOr[SupportingWidgetDefaults] = js.undefined
  
  /**
    * Options to configure the tooltip shown next to the cursor when creating or updating graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#tooltipOptions)
    */
  var tooltipOptions: js.UndefOr[SketchTooltipOptionsProperties] = js.undefined
  
  /**
    * Indicates whether the Editor should default to use the deprecated [CreateWorkflow](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-CreateWorkflow.html).
    *
    * @default false
    * @deprecated since version 4.23. Although new at 4.23, this property was introduced to help migrate from the legacy {@link module:esri/widgets/Editor/CreateWorkflow} to the updated {@link module:esri/widgets/Editor/CreateFeaturesWorkflow}. Once {@link module:esri/widgets/Editor/CreateWorkflow} is fully removed, this property will no longer be necessary.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#useDeprecatedCreateWorkflow)
    */
  var useDeprecatedCreateWorkflow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#view)
    */
  var view: js.UndefOr[MapViewPropertiestype2d | SceneViewPropertiestype3d] = js.undefined
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#viewModel)
    */
  var viewModel: js.UndefOr[EditorViewModelProperties] = js.undefined
  
  /**
    * The visible elements that are displayed within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#visibleElements)
    */
  var visibleElements: js.UndefOr[EditorVisibleElements] = js.undefined
}
object EditorProperties {
  
  inline def apply(): EditorProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditorProperties] (val x: Self) extends AnyVal {
    
    inline def setAllowedWorkflows(value: `create-features` | create | update): Self = StObject.set(x, "allowedWorkflows", value.asInstanceOf[js.Any])
    
    inline def setAllowedWorkflowsUndefined: Self = StObject.set(x, "allowedWorkflows", js.undefined)
    
    inline def setHeadingLevel(value: Double): Self = StObject.set(x, "headingLevel", value.asInstanceOf[js.Any])
    
    inline def setHeadingLevelUndefined: Self = StObject.set(x, "headingLevel", js.undefined)
    
    inline def setLabelOptions(value: SketchLabelOptionsProperties): Self = StObject.set(x, "labelOptions", value.asInstanceOf[js.Any])
    
    inline def setLabelOptionsUndefined: Self = StObject.set(x, "labelOptions", js.undefined)
    
    inline def setLayerInfos(value: js.Array[LayerInfo]): Self = StObject.set(x, "layerInfos", value.asInstanceOf[js.Any])
    
    inline def setLayerInfosUndefined: Self = StObject.set(x, "layerInfos", js.undefined)
    
    inline def setLayerInfosVarargs(value: LayerInfo*): Self = StObject.set(x, "layerInfos", js.Array(value*))
    
    inline def setSnappingOptions(value: SnappingOptionsProperties): Self = StObject.set(x, "snappingOptions", value.asInstanceOf[js.Any])
    
    inline def setSnappingOptionsUndefined: Self = StObject.set(x, "snappingOptions", js.undefined)
    
    inline def setSupportingWidgetDefaults(value: SupportingWidgetDefaults): Self = StObject.set(x, "supportingWidgetDefaults", value.asInstanceOf[js.Any])
    
    inline def setSupportingWidgetDefaultsUndefined: Self = StObject.set(x, "supportingWidgetDefaults", js.undefined)
    
    inline def setTooltipOptions(value: SketchTooltipOptionsProperties): Self = StObject.set(x, "tooltipOptions", value.asInstanceOf[js.Any])
    
    inline def setTooltipOptionsUndefined: Self = StObject.set(x, "tooltipOptions", js.undefined)
    
    inline def setUseDeprecatedCreateWorkflow(value: Boolean): Self = StObject.set(x, "useDeprecatedCreateWorkflow", value.asInstanceOf[js.Any])
    
    inline def setUseDeprecatedCreateWorkflowUndefined: Self = StObject.set(x, "useDeprecatedCreateWorkflow", js.undefined)
    
    inline def setView(value: MapViewPropertiestype2d | SceneViewPropertiestype3d): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewModel(value: EditorViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setVisibleElements(value: EditorVisibleElements): Self = StObject.set(x, "visibleElements", value.asInstanceOf[js.Any])
    
    inline def setVisibleElementsUndefined: Self = StObject.set(x, "visibleElements", js.undefined)
  }
}
