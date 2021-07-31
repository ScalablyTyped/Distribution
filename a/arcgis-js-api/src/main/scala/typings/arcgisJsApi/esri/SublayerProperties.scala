package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`hide-children`
import typings.arcgisJsApi.arcgisJsApiStrings.hide
import typings.arcgisJsApi.arcgisJsApiStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SublayerProperties
  extends StObject
     with LoadableProperties {
  
  /**
    * A SQL where clause used to filter features in the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#definitionExpression)
    */
  var definitionExpression: js.UndefOr[String] = js.undefined
  
  /**
    * The sublayer's layer ID.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#id)
    */
  var id: js.UndefOr[Double] = js.undefined
  
  /**
    * The label definition for this layer, specified as an array of [LabelClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html) objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#labelingInfo)
    */
  var labelingInfo: js.UndefOr[js.Array[LabelClassProperties]] = js.undefined
  
  /**
    * Indicates if labels for the sublayer will be visible in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#labelsVisible)
    */
  var labelsVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html) or [TileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html) to which the sublayer belongs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#layer)
    */
  var layer: js.UndefOr[MapImageLayerProperties | TileLayerProperties] = js.undefined
  
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#legendEnabled)
    */
  var legendEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates how the layer should display in the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#listMode)
    */
  var listMode: js.UndefOr[show | hide | `hide-children`] = js.undefined
  
  /**
    * The maximum scale (most zoomed in) at which the layer is visible in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#maxScale)
    */
  var maxScale: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum scale (most zoomed out) at which the layer is visible in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#minScale)
    */
  var minScale: js.UndefOr[Double] = js.undefined
  
  /**
    * The level of opacity to set on the sublayer on a scale from 0.0 - 1.0 where `0` is fully transparent and `1.0` is fully opaque.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#opacity)
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates whether to display popups when features in the layer are clicked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#popupEnabled)
    */
  var popupEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The popup template for the sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#popupTemplate)
    */
  var popupTemplate: js.UndefOr[PopupTemplateProperties] = js.undefined
  
  /**
    * The renderer to apply to the sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#renderer)
    */
  var renderer: js.UndefOr[RendererProperties] = js.undefined
  
  /**
    * An object that allows you to create a dynamic layer with data either from the map service sublayers or data from a registered workspace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#source)
    */
  var source: js.UndefOr[DynamicMapLayer | DynamicDataLayer] = js.undefined
  
  /**
    * The [map service's metadata JSON](https://developers.arcgis.com/rest/services-reference/map-service.htm) exposed by the ArcGIS REST API.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#sourceJSON)
    */
  var sourceJSON: js.UndefOr[js.Any] = js.undefined
  
  /**
    * If a sublayer contains sublayers, this property is a [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of [Sublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html) objects belonging to the given sublayer with sublayers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#sublayers)
    */
  var sublayers: js.UndefOr[CollectionProperties[SublayerProperties]] = js.undefined
  
  /**
    * The title of the sublayer used to identify it in places such as the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) and [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widgets.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#title)
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * The URL to the REST endpoint of the sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#url)
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates if the layer is visible in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#visible)
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object SublayerProperties {
  
  @scala.inline
  def apply(): SublayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SublayerProperties]
  }
  
  @scala.inline
  implicit class SublayerPropertiesMutableBuilder[Self <: SublayerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefinitionExpression(value: String): Self = StObject.set(x, "definitionExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionExpressionUndefined: Self = StObject.set(x, "definitionExpression", js.undefined)
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLabelingInfo(value: js.Array[LabelClassProperties]): Self = StObject.set(x, "labelingInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelingInfoUndefined: Self = StObject.set(x, "labelingInfo", js.undefined)
    
    @scala.inline
    def setLabelingInfoVarargs(value: LabelClassProperties*): Self = StObject.set(x, "labelingInfo", js.Array(value :_*))
    
    @scala.inline
    def setLabelsVisible(value: Boolean): Self = StObject.set(x, "labelsVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsVisibleUndefined: Self = StObject.set(x, "labelsVisible", js.undefined)
    
    @scala.inline
    def setLayer(value: MapImageLayerProperties | TileLayerProperties): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    @scala.inline
    def setLegendEnabled(value: Boolean): Self = StObject.set(x, "legendEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendEnabledUndefined: Self = StObject.set(x, "legendEnabled", js.undefined)
    
    @scala.inline
    def setListMode(value: show | hide | `hide-children`): Self = StObject.set(x, "listMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListModeUndefined: Self = StObject.set(x, "listMode", js.undefined)
    
    @scala.inline
    def setMaxScale(value: Double): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxScaleUndefined: Self = StObject.set(x, "maxScale", js.undefined)
    
    @scala.inline
    def setMinScale(value: Double): Self = StObject.set(x, "minScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinScaleUndefined: Self = StObject.set(x, "minScale", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setPopupEnabled(value: Boolean): Self = StObject.set(x, "popupEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupEnabledUndefined: Self = StObject.set(x, "popupEnabled", js.undefined)
    
    @scala.inline
    def setPopupTemplate(value: PopupTemplateProperties): Self = StObject.set(x, "popupTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupTemplateUndefined: Self = StObject.set(x, "popupTemplate", js.undefined)
    
    @scala.inline
    def setRenderer(value: RendererProperties): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    @scala.inline
    def setSource(value: DynamicMapLayer | DynamicDataLayer): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceJSON(value: js.Any): Self = StObject.set(x, "sourceJSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceJSONUndefined: Self = StObject.set(x, "sourceJSON", js.undefined)
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setSublayers(value: CollectionProperties[SublayerProperties]): Self = StObject.set(x, "sublayers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSublayersUndefined: Self = StObject.set(x, "sublayers", js.undefined)
    
    @scala.inline
    def setSublayersVarargs(value: SublayerProperties*): Self = StObject.set(x, "sublayers", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
