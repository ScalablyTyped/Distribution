package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.bilinear
import typings.arcgisJsApi.arcgisJsApiStrings.cubic
import typings.arcgisJsApi.arcgisJsApiStrings.majority
import typings.arcgisJsApi.arcgisJsApiStrings.nearest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageryTileLayerProperties
  extends LayerProperties
     with PortalLayerProperties
     with RefreshableLayerProperties
     with ScaleRangeLayerProperties {
  /**
    * Defines a band combination using 0-based band indexes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#bandIds)
    */
  var bandIds: js.UndefOr[js.Array[Double]] = js.native
  /**
    * The copyright text as defined by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#copyright)
    */
  var copyright: js.UndefOr[String] = js.native
  /**
    * Defines how to interpolate pixel values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#interpolation)
    *
    * @default "nearest"
    */
  var interpolation: js.UndefOr[nearest | bilinear | cubic | majority] = js.native
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#legendEnabled)
    *
    * @default true
    */
  var legendEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether to display popups when features in the layer are clicked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#popupEnabled)
    *
    * @default true
    */
  var popupEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The popup template for the layer. When set on the layer, the popupTemplate allows users to access attributes and display their values using text and/or charts in the [view's popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#popup) when a pixel is clicked. See [this sample](https://developers.arcgis.com/javascript/latest/sample-code/layers-imagery-popup/index.html) for an example of how [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) interacts with an [ImageryTileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html).  A default popup template is automatically used if no `popupTemplate` has been defined when [Popup.defaultPopupTemplateEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#defaultPopupTemplateEnabled) is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#popupTemplate)
    */
  var popupTemplate: js.UndefOr[PopupTemplateProperties] = js.native
  /**
    * The renderer assigned to the layer. The renderer defines how to visualize pixels in the tile imagery layer. Depending on the renderer type, the pixels may be [stretched](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html) across the color ramp, [classified](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html), have [different symbols](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html) based on values, or show [shaded reliefs](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#renderer)
    */
  var renderer: js.UndefOr[
    ClassBreaksRendererProperties | UniqueValueRendererProperties | RasterStretchRendererProperties | RasterShadedReliefRendererProperties | RasterColormapRendererProperties
  ] = js.native
  /**
    * The [tiled image service's metadata JSON](https://developers.arcgis.com/rest/services-reference/image-service.htm) exposed by the ArcGIS REST API. While most commonly used [properties](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#properties-summary) are exposed on the ImageryTileLayer class directly, this property gives access to all information returned by the tiled image service. This property is useful if working in an application built using an older version of the API which requires access to image service properties from a more recent version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#sourceJSON)
    */
  var sourceJSON: js.UndefOr[js.Any] = js.native
  /**
    * The tiling scheme information for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#tileInfo)
    */
  var tileInfo: js.UndefOr[TileInfoProperties] = js.native
  /**
    * The URL of the REST endpoint of the layer. The URL may either point to a resource on ArcGIS Enterprise or ArcGIS Online.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html#url)
    */
  var url: js.UndefOr[String] = js.native
}

object ImageryTileLayerProperties {
  @scala.inline
  def apply(): ImageryTileLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageryTileLayerProperties]
  }
  @scala.inline
  implicit class ImageryTileLayerPropertiesOps[Self <: ImageryTileLayerProperties] (val x: Self) extends AnyVal {
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
    def setBandIdsVarargs(value: Double*): Self = this.set("bandIds", js.Array(value :_*))
    @scala.inline
    def setBandIds(value: js.Array[Double]): Self = this.set("bandIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBandIds: Self = this.set("bandIds", js.undefined)
    @scala.inline
    def setCopyright(value: String): Self = this.set("copyright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyright: Self = this.set("copyright", js.undefined)
    @scala.inline
    def setInterpolation(value: nearest | bilinear | cubic | majority): Self = this.set("interpolation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterpolation: Self = this.set("interpolation", js.undefined)
    @scala.inline
    def setLegendEnabled(value: Boolean): Self = this.set("legendEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegendEnabled: Self = this.set("legendEnabled", js.undefined)
    @scala.inline
    def setPopupEnabled(value: Boolean): Self = this.set("popupEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupEnabled: Self = this.set("popupEnabled", js.undefined)
    @scala.inline
    def setPopupTemplate(value: PopupTemplateProperties): Self = this.set("popupTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopupTemplate: Self = this.set("popupTemplate", js.undefined)
    @scala.inline
    def setRenderer(
      value: ClassBreaksRendererProperties | UniqueValueRendererProperties | RasterStretchRendererProperties | RasterShadedReliefRendererProperties | RasterColormapRendererProperties
    ): Self = this.set("renderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    @scala.inline
    def setSourceJSON(value: js.Any): Self = this.set("sourceJSON", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceJSON: Self = this.set("sourceJSON", js.undefined)
    @scala.inline
    def setTileInfo(value: TileInfoProperties): Self = this.set("tileInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileInfo: Self = this.set("tileInfo", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

