package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveLayerInfo extends Accessor {
  /**
    * A collection of child activeLayerInfos. This only applies to renderers of [Sublayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html) or the children of [GroupLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#children)
    */
  var children: Collection[ActiveLayerInfo] = js.native
  /**
    * Indicates if the legend's display of the layer's renderer is driven by the scale of the view. This is true of [Sublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html) renderers, any renderer that uses a `valueExpression` (Arcade expression), [DotDensityRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html), and layers that have [clustering](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#featureReduction) enabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#isScaleDriven)
    */
  var isScaleDriven: Boolean = js.native
  /**
    * The layer represented by the ActiveLayerInfo object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#layer)
    */
  var layer: Layer = js.native
  /**
    * The legendElements is constructed using the layer [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html). It reflects the actual structure of the legend. Each `legendElement` has the following specification:
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#legendElements)
    */
  var legendElements: js.Array[LegendElement] = js.native
  /**
    * The ActiveLayerInfo of the parent [Sublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html) or [GroupLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#parent)
    */
  var parent: ActiveLayerInfo = js.native
  /**
    * Indicates if the activeLayerInfo is ready. It is set to `true` when all its [legendElements](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#legendElements) are computed. It is set to `false` when the layer renderer changes so that the legendElements can recomputed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ready)
    */
  var ready: Boolean = js.native
  /**
    * The scale of the view instance in which the Legend is rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#scale)
    */
  var scale: Double = js.native
  /**
    * The text string that represents the legend's title. This value is read from the `layerInfo` of the corresponding layer in the legend. If not provided, this value comes from the [title](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#title) of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#title)
    */
  var title: String = js.native
  /**
    * The version of the ActiveLayerInfo. It increases by `1` whenever [ready](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#ready) property of ActiveLayerInfo changes. This property should watched in the view for ActiveLayerInfo changes and update the DOM accordingly.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#version)
    */
  var version: Double = js.native
  /**
    * The view in which the Legend is rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#view)
    */
  var view: View = js.native
}

@JSGlobal("__esri.ActiveLayerInfo")
@js.native
object ActiveLayerInfo extends TopLevel[ActiveLayerInfoConstructor]

