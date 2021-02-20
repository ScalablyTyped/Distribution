package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildingExplorerViewModelProperties extends StObject {
  
  /**
    * A collection of layers of type [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html) that are added to the widget for exploration.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingExplorerViewModel.html#layers)
    */
  var layers: js.UndefOr[CollectionProperties[BuildingSceneLayerProperties]] = js.native
  
  /**
    * The view in which the BuildingExplorer is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-BuildingExplorer-BuildingExplorerViewModel.html#view)
    */
  var view: js.UndefOr[SceneViewProperties] = js.native
}
object BuildingExplorerViewModelProperties {
  
  @scala.inline
  def apply(): BuildingExplorerViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildingExplorerViewModelProperties]
  }
  
  @scala.inline
  implicit class BuildingExplorerViewModelPropertiesMutableBuilder[Self <: BuildingExplorerViewModelProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayers(value: CollectionProperties[BuildingSceneLayerProperties]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: BuildingSceneLayerProperties*): Self = StObject.set(x, "layers", js.Array(value :_*))
    
    @scala.inline
    def setView(value: SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
