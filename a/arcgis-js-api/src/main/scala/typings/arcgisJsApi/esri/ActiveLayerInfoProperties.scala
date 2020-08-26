package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveLayerInfoProperties extends js.Object {
  /**
    * A collection of child activeLayerInfos. This only applies to renderers of [Sublayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html) or the children of [GroupLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#children)
    */
  var children: js.UndefOr[CollectionProperties[ActiveLayerInfoProperties]] = js.native
  /**
    * Indicates if the legend's display of the layer's renderer is driven by the scale of the view. This is true of [Sublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html) renderers, any renderer that uses a `valueExpression` (Arcade expression), [DotDensityRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html), and layers that have [clustering](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#featureReduction) enabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#isScaleDriven)
    */
  var isScaleDriven: js.UndefOr[Boolean] = js.native
  /**
    * The layer represented by the ActiveLayerInfo object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#layer)
    */
  var layer: js.UndefOr[LayerProperties] = js.native
  /**
    * The layerView represented by the ActiveLayerInfo object's layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#layerView)
    */
  var layerView: js.UndefOr[LayerViewProperties] = js.native
  /**
    * The legendElements is constructed using the layer [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html). It reflects the actual structure of the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#legendElements)
    */
  var legendElements: js.UndefOr[js.Array[LegendElement]] = js.native
  /**
    * The ActiveLayerInfo of the parent [Sublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html) or [GroupLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#parent)
    */
  var parent: js.UndefOr[ActiveLayerInfoProperties] = js.native
  /**
    * Indicates if the activeLayerInfo is ready. It is set to `true` when all its [legendElements](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#legendElements) are computed. It is set to `false` when the layer renderer changes so that the legendElements can recomputed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ready)
    */
  var ready: js.UndefOr[Boolean] = js.native
  /**
    * The scale of the view instance in which the Legend is rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#scale)
    */
  var scale: js.UndefOr[Double] = js.native
  /**
    * The text string that represents the legend's title. This value is read from the `layerInfo` of the corresponding layer in the legend. If not provided, this value comes from the [title](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#title) of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#title)
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The version of the ActiveLayerInfo. It increases by `1` whenever [ready](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ready) property of ActiveLayerInfo changes. This property should watched in the view for ActiveLayerInfo changes and update the DOM accordingly.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#version)
    */
  var version: js.UndefOr[Double] = js.native
  /**
    * The view in which the Legend is rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#view)
    */
  var view: js.UndefOr[ViewProperties] = js.native
}

object ActiveLayerInfoProperties {
  @scala.inline
  def apply(): ActiveLayerInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActiveLayerInfoProperties]
  }
  @scala.inline
  implicit class ActiveLayerInfoPropertiesOps[Self <: ActiveLayerInfoProperties] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: ActiveLayerInfoProperties*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: CollectionProperties[ActiveLayerInfoProperties]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setIsScaleDriven(value: Boolean): Self = this.set("isScaleDriven", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsScaleDriven: Self = this.set("isScaleDriven", js.undefined)
    @scala.inline
    def setLayer(value: LayerProperties): Self = this.set("layer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayer: Self = this.set("layer", js.undefined)
    @scala.inline
    def setLayerView(value: LayerViewProperties): Self = this.set("layerView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerView: Self = this.set("layerView", js.undefined)
    @scala.inline
    def setLegendElementsVarargs(value: LegendElement*): Self = this.set("legendElements", js.Array(value :_*))
    @scala.inline
    def setLegendElements(value: js.Array[LegendElement]): Self = this.set("legendElements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendElements: Self = this.set("legendElements", js.undefined)
    @scala.inline
    def setParent(value: ActiveLayerInfoProperties): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setReady(value: Boolean): Self = this.set("ready", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReady: Self = this.set("ready", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    @scala.inline
    def setView(value: ViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
  
}

