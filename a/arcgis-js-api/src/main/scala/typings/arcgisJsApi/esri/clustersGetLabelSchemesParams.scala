package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait clustersGetLabelSchemesParams extends Object {
  /**
    * The point layer that has or will have clustering enabled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-labels-clusters.html#getLabelSchemes)
    */
  var layer: FeatureLayer | CSVLayer | GeoJSONLayer = js.native
  /**
    * The renderer to set on the input layer when clustering is enabled. Specify this parameter if the layer's renderer does not match the renderer that will be used when clustering is enabled. This cannot be a [HeatmapRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-labels-clusters.html#getLabelSchemes)
    */
  var renderer: js.UndefOr[Renderer] = js.native
  /**
    * The view where the input layer will be rendered.
    *
    * [Read more...](global.html)
    */
  var view: MapView = js.native
}

object clustersGetLabelSchemesParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer | CSVLayer | GeoJSONLayer,
    propertyIsEnumerable: PropertyKey => Boolean,
    view: MapView
  ): clustersGetLabelSchemesParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[clustersGetLabelSchemesParams]
  }
  @scala.inline
  implicit class clustersGetLabelSchemesParamsOps[Self <: clustersGetLabelSchemesParams] (val x: Self) extends AnyVal {
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
    def setLayer(value: FeatureLayer | CSVLayer | GeoJSONLayer): Self = this.set("layer", value.asInstanceOf[js.Any])
    @scala.inline
    def setView(value: MapView): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderer(value: Renderer): Self = this.set("renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
  }
  
}

