package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildingExplorerViewModelProperties extends js.Object {
  
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
  implicit class BuildingExplorerViewModelPropertiesOps[Self <: BuildingExplorerViewModelProperties] (val x: Self) extends AnyVal {
    
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
    def setLayersVarargs(value: BuildingSceneLayerProperties*): Self = this.set("layers", js.Array(value :_*))
    
    @scala.inline
    def setLayers(value: CollectionProperties[BuildingSceneLayerProperties]): Self = this.set("layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayers: Self = this.set("layers", js.undefined)
    
    @scala.inline
    def setView(value: SceneViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
}
