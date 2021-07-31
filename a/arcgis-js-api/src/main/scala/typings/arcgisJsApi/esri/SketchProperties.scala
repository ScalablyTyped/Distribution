package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.continuous
import typings.arcgisJsApi.arcgisJsApiStrings.horizontal
import typings.arcgisJsApi.arcgisJsApiStrings.single
import typings.arcgisJsApi.arcgisJsApiStrings.update
import typings.arcgisJsApi.arcgisJsApiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchProperties
  extends StObject
     with WidgetProperties {
  
  /**
    * Property controlling the visibility and order of create tool buttons.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#availableCreateTools)
    */
  var availableCreateTools: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Defines the default behavior once the [create](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#create) operation is completed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#creationMode)
    */
  var creationMode: js.UndefOr[single | continuous | update] = js.undefined
  
  /**
    * Default create options set for the Sketch widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#defaultCreateOptions)
    */
  var defaultCreateOptions: js.UndefOr[SketchDefaultCreateOptions] = js.undefined
  
  /**
    * Default update options set for the Sketch widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#defaultUpdateOptions)
    */
  var defaultUpdateOptions: js.UndefOr[SketchDefaultUpdateOptions] = js.undefined
  
  /**
    * The Sketch widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.undefined
  
  /**
    * The [GraphicsLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html) associated with the Sketch widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#layer)
    */
  var layer: js.UndefOr[GraphicsLayerProperties] = js.undefined
  
  /**
    * Determines the layout/orientation of the Sketch widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#layout)
    */
  var layout: js.UndefOr[vertical | horizontal] = js.undefined
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
  
  /**
    * The view model for the Sketch widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#viewModel)
    */
  var viewModel: js.UndefOr[SketchViewModelProperties] = js.undefined
}
object SketchProperties {
  
  @scala.inline
  def apply(): SketchProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SketchProperties]
  }
  
  @scala.inline
  implicit class SketchPropertiesMutableBuilder[Self <: SketchProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailableCreateTools(value: js.Array[String]): Self = StObject.set(x, "availableCreateTools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailableCreateToolsUndefined: Self = StObject.set(x, "availableCreateTools", js.undefined)
    
    @scala.inline
    def setAvailableCreateToolsVarargs(value: String*): Self = StObject.set(x, "availableCreateTools", js.Array(value :_*))
    
    @scala.inline
    def setCreationMode(value: single | continuous | update): Self = StObject.set(x, "creationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationModeUndefined: Self = StObject.set(x, "creationMode", js.undefined)
    
    @scala.inline
    def setDefaultCreateOptions(value: SketchDefaultCreateOptions): Self = StObject.set(x, "defaultCreateOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCreateOptionsUndefined: Self = StObject.set(x, "defaultCreateOptions", js.undefined)
    
    @scala.inline
    def setDefaultUpdateOptions(value: SketchDefaultUpdateOptions): Self = StObject.set(x, "defaultUpdateOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUpdateOptionsUndefined: Self = StObject.set(x, "defaultUpdateOptions", js.undefined)
    
    @scala.inline
    def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    @scala.inline
    def setLayer(value: GraphicsLayerProperties): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    @scala.inline
    def setLayout(value: vertical | horizontal): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModel(value: SketchViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
