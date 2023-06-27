package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildingExplorerViewModelProperties extends StObject {
  
  /**
  		 * A collection of layers of type [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html) that are added to the widget for exploration.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingExplorerViewModel.html#layers)
  		 */
  var layers: js.UndefOr[CollectionProperties[BuildingSceneLayerProperties]] = js.undefined
  
  /**
  		 * The view in which the BuildingExplorer is used.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingExplorerViewModel.html#view)
  		 */
  var view: js.UndefOr[SceneViewProperties] = js.undefined
}
object BuildingExplorerViewModelProperties {
  
  inline def apply(): BuildingExplorerViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildingExplorerViewModelProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildingExplorerViewModelProperties] (val x: Self) extends AnyVal {
    
    inline def setLayers(value: CollectionProperties[BuildingSceneLayerProperties]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: BuildingSceneLayerProperties*): Self = StObject.set(x, "layers", js.Array(value*))
    
    inline def setView(value: SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
