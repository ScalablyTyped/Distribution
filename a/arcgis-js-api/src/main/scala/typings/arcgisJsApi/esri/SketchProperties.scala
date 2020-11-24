package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.continuous
import typings.arcgisJsApi.arcgisJsApiStrings.horizontal
import typings.arcgisJsApi.arcgisJsApiStrings.single
import typings.arcgisJsApi.arcgisJsApiStrings.update
import typings.arcgisJsApi.arcgisJsApiStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchProperties extends WidgetProperties {
  
  /**
    * Property controlling the visibility and order of create tool buttons.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#availableCreateTools)
    */
  var availableCreateTools: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Defines the default behavior once the [create](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#create) operation is completed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#creationMode)
    */
  var creationMode: js.UndefOr[single | continuous | update] = js.native
  
  /**
    * Default create options set for the Sketch widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#defaultCreateOptions)
    */
  var defaultCreateOptions: js.UndefOr[SketchDefaultCreateOptions] = js.native
  
  /**
    * Default update options set for the Sketch widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#defaultUpdateOptions)
    */
  var defaultUpdateOptions: js.UndefOr[SketchDefaultUpdateOptions] = js.native
  
  /**
    * The Sketch widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.native
  
  /**
    * The [GraphicsLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html) associated with the Sketch widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#layer)
    */
  var layer: js.UndefOr[GraphicsLayerProperties] = js.native
  
  /**
    * Determines the layout/orientation of the Sketch widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#layout)
    */
  var layout: js.UndefOr[vertical | horizontal] = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
  
  /**
    * The view model for the Sketch widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#viewModel)
    */
  var viewModel: js.UndefOr[SketchViewModelProperties] = js.native
}
object SketchProperties {
  
  @scala.inline
  def apply(): SketchProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SketchProperties]
  }
  
  @scala.inline
  implicit class SketchPropertiesOps[Self <: SketchProperties] (val x: Self) extends AnyVal {
    
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
    def setAvailableCreateToolsVarargs(value: String*): Self = this.set("availableCreateTools", js.Array(value :_*))
    
    @scala.inline
    def setAvailableCreateTools(value: js.Array[String]): Self = this.set("availableCreateTools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailableCreateTools: Self = this.set("availableCreateTools", js.undefined)
    
    @scala.inline
    def setCreationMode(value: single | continuous | update): Self = this.set("creationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationMode: Self = this.set("creationMode", js.undefined)
    
    @scala.inline
    def setDefaultCreateOptions(value: SketchDefaultCreateOptions): Self = this.set("defaultCreateOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultCreateOptions: Self = this.set("defaultCreateOptions", js.undefined)
    
    @scala.inline
    def setDefaultUpdateOptions(value: SketchDefaultUpdateOptions): Self = this.set("defaultUpdateOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultUpdateOptions: Self = this.set("defaultUpdateOptions", js.undefined)
    
    @scala.inline
    def setIconClass(value: String): Self = this.set("iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconClass: Self = this.set("iconClass", js.undefined)
    
    @scala.inline
    def setLayer(value: GraphicsLayerProperties): Self = this.set("layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayer: Self = this.set("layer", js.undefined)
    
    @scala.inline
    def setLayout(value: vertical | horizontal): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    
    @scala.inline
    def setViewModel(value: SketchViewModelProperties): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
  }
}
