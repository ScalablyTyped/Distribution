package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait heatmapCreateRendererParams extends Object {
  /**
    * The [named string](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap) or basemap object of the Esri basemap that will be paired with the output visualization. Determines optimal colors for the output renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-heatmap.html#createRenderer)
    *
    * @default gray
    */
  var basemap: js.UndefOr[String | Basemap] = js.native
  /**
    * The [blurRadius](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#blurRadius) in pixels that determines the area of influence of each point. A higher blur radius indicates points have more influence on surrounding points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-heatmap.html#createRenderer)
    *
    * @default 10
    */
  var blurRadius: js.UndefOr[Double] = js.native
  /**
    * Indicates whether to fade the lower color stops to a transparent color to create a fuzzy boundary on the edge of the heatmap. A value of `false` makes a discrete boundary on the lower color stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-heatmap.html#createRenderer)
    *
    * @default true
    */
  var fadeToTransparent: js.UndefOr[Boolean] = js.native
  /**
    * The name of the field whose data will be queried for statistics and used for the basis of the data-driven visualization. The value of the `field` is used as a multiplier in the heatmap, making areas with high field values hotter than areas where the features have low field values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-heatmap.html#createRenderer)
    */
  var field: js.UndefOr[String] = js.native
  /**
    * In authoring apps, the user may select a pre-defined heatmap scheme. Pass the scheme object to this property to avoid getting one based on the `basemap`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-heatmap.html#createRenderer)
    */
  var heatmapScheme: js.UndefOr[HeatmapScheme] = js.native
  /**
    * The point layer for which the visualization is generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-heatmap.html#createRenderer)
    */
  var layer: FeatureLayer | CSVLayer | GeoJSONLayer = js.native
  /**
    * The maximum [ratio](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-HeatmapColorStop.html#ratio) used in the [HeatmapRenderer.colorStops](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#colorStops) of the output renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-heatmap.html#createRenderer)
    *
    * @default 1
    */
  var maxRatio: js.UndefOr[Double] = js.native
  /**
    * The minimum [ratio](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-HeatmapColorStop.html#ratio) used in the [HeatmapRenderer.colorStops](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#colorStops) of the output renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-heatmap.html#createRenderer)
    *
    * @default 0.01
    */
  var minRatio: js.UndefOr[Double] = js.native
  /**
    * Allows for cancelable requests. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-heatmap.html#createRenderer)
    */
  var signal: js.UndefOr[AbortSignal] = js.native
  /**
    * A statistics object generated from the [heatmapStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-statistics-heatmapStatistics.html) function. If statistics for the field have already been generated, then pass the object here to avoid making a second statistics query to the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-heatmap.html#createRenderer)
    */
  var statistics: js.UndefOr[HeatmapStatisticsResult] = js.native
  /**
    * The view instance in which the visualization will be rendered.
    *
    * [Read more...](global.html)
    */
  var view: MapView = js.native
}

object heatmapCreateRendererParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer | CSVLayer | GeoJSONLayer,
    propertyIsEnumerable: PropertyKey => Boolean,
    view: MapView
  ): heatmapCreateRendererParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[heatmapCreateRendererParams]
  }
  @scala.inline
  implicit class heatmapCreateRendererParamsOps[Self <: heatmapCreateRendererParams] (val x: Self) extends AnyVal {
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
    def setBasemap(value: String | Basemap): Self = this.set("basemap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasemap: Self = this.set("basemap", js.undefined)
    @scala.inline
    def setBlurRadius(value: Double): Self = this.set("blurRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlurRadius: Self = this.set("blurRadius", js.undefined)
    @scala.inline
    def setFadeToTransparent(value: Boolean): Self = this.set("fadeToTransparent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFadeToTransparent: Self = this.set("fadeToTransparent", js.undefined)
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setHeatmapScheme(value: HeatmapScheme): Self = this.set("heatmapScheme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeatmapScheme: Self = this.set("heatmapScheme", js.undefined)
    @scala.inline
    def setMaxRatio(value: Double): Self = this.set("maxRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRatio: Self = this.set("maxRatio", js.undefined)
    @scala.inline
    def setMinRatio(value: Double): Self = this.set("minRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinRatio: Self = this.set("minRatio", js.undefined)
    @scala.inline
    def setSignal(value: AbortSignal): Self = this.set("signal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
    @scala.inline
    def setStatistics(value: HeatmapStatisticsResult): Self = this.set("statistics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatistics: Self = this.set("statistics", js.undefined)
  }
  
}

