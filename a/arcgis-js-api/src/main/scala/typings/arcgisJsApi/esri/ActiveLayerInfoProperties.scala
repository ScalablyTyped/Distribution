package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveLayerInfoProperties extends js.Object {
  /**
    * A collection of child activeLayerInfos. This only applies to renderers of [Sublayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html) or the children of [GroupLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#children)
    */
  var children: js.UndefOr[CollectionProperties[ActiveLayerInfoProperties]] = js.undefined
  /**
    * Indicates if the legend's display of the layer's renderer is driven by the scale of the view. This is true of [Sublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html) renderers, any renderer that uses a `valueExpression` (Arcade expression), [DotDensityRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html), and layers that have [clustering](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#featureReduction) enabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#isScaleDriven)
    */
  var isScaleDriven: js.UndefOr[Boolean] = js.undefined
  /**
    * The layer represented by the ActiveLayerInfo object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#layer)
    */
  var layer: js.UndefOr[LayerProperties] = js.undefined
  /**
    * The legendElements is constructed using the layer [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html). It reflects the actual structure of the legend. Each `legendElement` has the following specification:
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#legendElements)
    */
  var legendElements: js.UndefOr[js.Array[LegendElement]] = js.undefined
  /**
    * The ActiveLayerInfo of the parent [Sublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html) or [GroupLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#parent)
    */
  var parent: js.UndefOr[ActiveLayerInfoProperties] = js.undefined
  /**
    * Indicates if the activeLayerInfo is ready. It is set to `true` when all its [legendElements](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#legendElements) are computed. It is set to `false` when the layer renderer changes so that the legendElements can recomputed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ready)
    */
  var ready: js.UndefOr[Boolean] = js.undefined
  /**
    * The scale of the view instance in which the Legend is rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#scale)
    */
  var scale: js.UndefOr[Double] = js.undefined
  /**
    * The text string that represents the legend's title. This value is read from the `layerInfo` of the corresponding layer in the legend. If not provided, this value comes from the [title](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#title) of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#title)
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * The version of the ActiveLayerInfo. It increases by `1` whenever [ready](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ready) property of ActiveLayerInfo changes. This property should watched in the view for ActiveLayerInfo changes and update the DOM accordingly.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#version)
    */
  var version: js.UndefOr[Double] = js.undefined
  /**
    * The view in which the Legend is rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#view)
    */
  var view: js.UndefOr[ViewProperties] = js.undefined
}

object ActiveLayerInfoProperties {
  @scala.inline
  def apply(
    children: CollectionProperties[ActiveLayerInfoProperties] = null,
    isScaleDriven: js.UndefOr[Boolean] = js.undefined,
    layer: LayerProperties = null,
    legendElements: js.Array[LegendElement] = null,
    parent: ActiveLayerInfoProperties = null,
    ready: js.UndefOr[Boolean] = js.undefined,
    scale: Int | Double = null,
    title: String = null,
    version: Int | Double = null,
    view: ViewProperties = null
  ): ActiveLayerInfoProperties = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(isScaleDriven)) __obj.updateDynamic("isScaleDriven")(isScaleDriven.asInstanceOf[js.Any])
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    if (legendElements != null) __obj.updateDynamic("legendElements")(legendElements.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(ready)) __obj.updateDynamic("ready")(ready.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveLayerInfoProperties]
  }
}

