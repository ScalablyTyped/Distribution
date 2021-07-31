package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildingSceneLayerView
  extends StObject
     with LayerView {
  
  /**
    * Highlights the given feature(s).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-BuildingSceneLayerView.html#highlight)
    */
  def highlight(): Handle = js.native
  def highlight(target: js.Array[Graphic]): Handle = js.native
  def highlight(target: Graphic): Handle = js.native
  
  /**
    * The layer being viewed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-BuildingSceneLayerView.html#layer)
    */
  @JSName("layer")
  val layer_BuildingSceneLayerView: BuildingSceneLayer = js.native
  
  /**
    * Collection of [sublayer views](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-BuildingComponentSublayerView.html) for all the component sublayers of the BuildingSceneLayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-BuildingSceneLayerView.html#sublayerViews)
    */
  val sublayerViews: Collection[BuildingComponentSublayerView] = js.native
}
