package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayersMixinProperties extends js.Object {
  /**
    * A collection of operational [layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html). This property only contains interactive operational layers, such as [FeatureLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [WebTileLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html) and {@link module:esri/layers/GraphicsLayer GraphicsLayers}  that may be queried, assigned different renderers, analyzed, etc. It does not include [basemaps](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html).  A [layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) is a collection of one or more features, or {@link module:esri/Graphic graphics}, that represent real-world phenomena. Each feature contains a {@link module:esri/symbols/Symbol symbol}  and [geographic data](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html) that allows it to be rendered on the map as a graphic with spatial context. Features within the layer may also contain data attributes that provide additional information that may be viewed in [popup windows](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) and used for {@link module:esri/renderers/Renderer rendering the layer}.  Layers may be added in the [constructor](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-LayersMixin.html#constructors-summary), with the [add()](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-LayersMixin.html#add) or [addMany()](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-LayersMixin.html#addMany) methods, or directly to the layers collection using [add()](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#add) or [addMany()](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html#addMany).
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
  var layers: js.UndefOr[CollectionProperties[LayerProperties] | js.Array[LayerProperties]] = js.undefined
}

object LayersMixinProperties {
  @scala.inline
  def apply(layers: CollectionProperties[LayerProperties] | js.Array[LayerProperties] = null): LayersMixinProperties = {
    val __obj = js.Dynamic.literal()
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayersMixinProperties]
  }
}

