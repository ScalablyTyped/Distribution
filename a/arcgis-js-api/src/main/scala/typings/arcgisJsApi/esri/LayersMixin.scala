package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayersMixin extends js.Object {
  /**
    * A collection of operational [layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html). This property contains the operational layers, such as [FeatureLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [WebTileLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html) and {@link module:esri/layers/GraphicsLayer GraphicsLayers}  that may be queried, assigned different renderers, analyzed, etc. It does not include [basemaps](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html).  A [layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) is a collection of one or more features, or {@link module:esri/Graphic graphics}, that represent real-world phenomena. Each feature contains a {@link module:esri/symbols/Symbol symbol}  and [geographic data](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html) that allows it to be rendered on the map as a graphic with spatial context. Features within the layer may also contain data attributes that provide additional information that may be viewed in [popup windows](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) and used for {@link module:esri/renderers/Renderer rendering the layer}.  Layers may be added in the [constructor](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-LayersMixin.html#constructors-summary), with the [add()](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-LayersMixin.html#add) or [addMany()](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-LayersMixin.html#addMany) methods, or directly to the layers collection using [add()](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#add) or [addMany()](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#addMany).
    * > A [layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) may only be added to one parent. Adding the same layer to multiple [Maps](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) or [GroupLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html) is not possible. If you attempt to do so, the layer will automatically be removed from its current parent and placed in the new parent.
    * > ```js
    * > var layer = new GraphicsLayer();
    * > // The layer belongs to map1
    * > map1.layers.add(layer);
    * > // The layer now belongs to map2
    * > // and implicitly does: map1.layers.remove(layer)
    * > map2.layers.add(layer);
    * > ```
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-LayersMixin.html#layers)
    */
  var layers: Collection[Layer] = js.native
  def add(layer: js.Promise[_]): Unit = js.native
  def add(layer: js.Promise[_], index: Double): Unit = js.native
  /**
    * Adds a layer to the [layers collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-LayersMixin.html#layers). The [before-changes](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#event-before-changes), [before-add](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#event-before-add), [after-add](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#event-after-add), [after-changes](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#event-after-changes) and [change](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#event-change) events will be emitted when this method is called.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-LayersMixin.html#add)
    *
    * @param layer Layer or a promise that resolves to a layer to add to the [layers collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-LayersMixin.html#layers).
    * @param index A layer can be added at a specified index in the [layers collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-LayersMixin.html#layers). If no index is specified or the index specified is greater than the current number of layers, the layer is automatically appended to the list of layers in the [layers collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-LayersMixin.html#layers) and the index is normalized.
    *
    */
  def add(layer: Layer): Unit = js.native
  def add(layer: Layer, index: Double): Unit = js.native
  /**
    * Adds a layer or an array of layers to the [layers collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-LayersMixin.html#layers). The [before-changes](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#event-before-changes), [before-add](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#event-before-add), [after-add](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#event-after-add), [after-changes](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#event-after-changes) and [change](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#event-change) events will be emitted when this method is called.  The [push()](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#push) method on the layers collection also can be used to add a layer or layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-LayersMixin.html#addMany)
    *
    * @param layers Layer(s) to be added to the [layers collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-LayersMixin.html#layers).
    * @param index A layer can be added at a specified index in the [layers collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-LayersMixin.html#layers). If no index is specified or the index specified is greater than the current number of layers, the layer is automatically appended to the list of layers in the [layers collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-LayersMixin.html#layers) and the index is normalized.
    *
    */
  def addMany(layers: js.Array[Layer]): Unit = js.native
  def addMany(layers: js.Array[Layer], index: Double): Unit = js.native
  /**
    * Returns a layer based on the given layer id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-LayersMixin.html#findLayerById)
    *
    * @param layerId The ID assigned to the layer.
    *
    */
  def findLayerById(layerId: String): Layer = js.native
  /**
    * Removes the specified layer from the layers collection. The [before-changes](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#event-before-changes), [before-remove](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#event-before-remove), [after-remove](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#event-after-remove), [after-changes](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#event-after-changes) and [change](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#event-change) events will be emitted when this method is called.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-LayersMixin.html#remove)
    *
    * @param layer Layer to remove from the layers collection.
    *
    */
  def remove(layer: Layer): Layer = js.native
  /**
    * Removes all layers. The [before-changes](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#event-before-changes), [before-remove](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#event-before-remove), [after-remove](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#event-after-remove), [after-changes](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#event-after-changes) and [change](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#event-change) events will be emitted when this method is called.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-LayersMixin.html#removeAll)
    *
    *
    */
  def removeAll(): js.Array[Layer] = js.native
  /**
    * Removes the specified layers. The [before-changes](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#event-before-changes), [before-remove](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#event-before-remove), [after-remove](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#event-after-remove), [after-changes](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#event-after-changes) and [change](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#event-change) events will be emitted when this method is called.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-LayersMixin.html#removeMany)
    *
    * @param layers Array of layers to remove from the layers collection.
    *
    */
  def removeMany(layers: js.Array[Layer]): js.Array[Layer] = js.native
  /**
    * Changes the layer order. The first layer added is always the base layer, even if its order is changed. The [change](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#event-change) event will be emitted when this method is called.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-LayersMixin.html#reorder)
    *
    * @param layer The layer to be moved.
    * @param index The index location for placing the layer. The bottom-most layer has an index of `0`.
    *
    */
  def reorder(layer: Layer, index: Double): Layer = js.native
}

