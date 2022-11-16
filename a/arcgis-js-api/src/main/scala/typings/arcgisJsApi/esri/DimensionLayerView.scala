package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DimensionLayerView
  extends StObject
     with LayerView {
  
  /**
    * Starts the interactive creation of new dimensions and adds them to the layer [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-DimensionLayer.html#source).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-DimensionLayerView.html#createLengthDimensions)
    */
  def createLengthDimensions(): js.Promise[Any] = js.native
  def createLengthDimensions(options: DimensionLayerViewCreateLengthDimensionsOptions): js.Promise[Any] = js.native
  
  /**
    * Set to `true` to enable interactivity for the [layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-DimensionLayerView.html#layer).
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-DimensionLayerView.html#interactive)
    */
  var interactive: Boolean = js.native
  
  /**
    * The layer being viewed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-DimensionLayerView.html#layer)
    */
  @JSName("layer")
  val layer_DimensionLayerView: DimensionLayer = js.native
  
  /**
    * Results for each dimension in the layer [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-DimensionLayer.html#source).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-DimensionLayerView.html#results)
    */
  val results: Collection[LengthDimensionResult] = js.native
  
  /**
    * The selected dimension.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-DimensionLayerView.html#selectedDimension)
    */
  var selectedDimension: LengthDimension = js.native
}
