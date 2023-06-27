package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildingExplorerProperties
  extends StObject
     with WidgetProperties {
  
  /**
  		 * Indicates the heading level to use for the headings in the widget.
  		 *
  		 * @default 3
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer.html#headingLevel)
  		 */
  var headingLevel: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The widget's default CSS icon class.
  		 *
  		 * @deprecated since 4.27. Use {@link module:esri/widgets/BuildingExplorer#icon icon} instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer.html#iconClass)
  		 */
  var iconClass: js.UndefOr[String] = js.undefined
  
  /**
  		 * A [collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of layers of type [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html) that are added to the widget for exploration.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer.html#layers)
  		 */
  var layers: js.UndefOr[CollectionProperties[BuildingSceneLayerProperties]] = js.undefined
  
  /**
  		 * A reference to the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer.html#view)
  		 */
  var view: js.UndefOr[SceneViewProperties] = js.undefined
  
  /**
  		 * The view model for this widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer.html#viewModel)
  		 */
  var viewModel: js.UndefOr[BuildingExplorerViewModelProperties] = js.undefined
  
  /**
  		 * This property provides the ability to display or hide the individual elements of the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer.html#visibleElements)
  		 */
  var visibleElements: js.UndefOr[BuildingExplorerVisibleElements] = js.undefined
}
object BuildingExplorerProperties {
  
  inline def apply(): BuildingExplorerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildingExplorerProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildingExplorerProperties] (val x: Self) extends AnyVal {
    
    inline def setHeadingLevel(value: Double): Self = StObject.set(x, "headingLevel", value.asInstanceOf[js.Any])
    
    inline def setHeadingLevelUndefined: Self = StObject.set(x, "headingLevel", js.undefined)
    
    inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    inline def setLayers(value: CollectionProperties[BuildingSceneLayerProperties]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: BuildingSceneLayerProperties*): Self = StObject.set(x, "layers", js.Array(value*))
    
    inline def setView(value: SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewModel(value: BuildingExplorerViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setVisibleElements(value: BuildingExplorerVisibleElements): Self = StObject.set(x, "visibleElements", value.asInstanceOf[js.Any])
    
    inline def setVisibleElementsUndefined: Self = StObject.set(x, "visibleElements", js.undefined)
  }
}
