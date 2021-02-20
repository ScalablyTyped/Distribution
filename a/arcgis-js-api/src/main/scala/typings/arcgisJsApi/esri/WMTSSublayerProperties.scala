package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WMTSSublayerProperties extends StObject {
  
  /**
    * Description for the WMTS sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#description)
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The full extent of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#fullExtent)
    */
  var fullExtent: js.UndefOr[ExtentProperties] = js.native
  
  /**
    * The unique ID assigned to the sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#id)
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The map image format (MIME type) to request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#imageFormat)
    */
  var imageFormat: js.UndefOr[String] = js.native
  
  /**
    * Supported image formats as retrieved from the GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#imageFormats)
    */
  var imageFormats: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The [WMTSLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html) to which the sublayer belongs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#layer)
    */
  var layer: js.UndefOr[WMTSLayerProperties] = js.native
  
  /**
    * The [WMTSStyle](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSStyle.html) to request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#styleId)
    */
  var styleId: js.UndefOr[String] = js.native
  
  /**
    * A collection of supported [WMTSStyle](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSStyle.html)s as retrieved from the GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#styles)
    */
  var styles: js.UndefOr[CollectionProperties[WMTSStyleProperties]] = js.native
  
  /**
    * The [TileMatrixSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileMatrixSet.html) to request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#tileMatrixSet)
    */
  var tileMatrixSet: js.UndefOr[TileMatrixSetProperties] = js.native
  
  /**
    * The id of the [TileMatrixSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileMatrixSet.html) to request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#tileMatrixSetId)
    */
  var tileMatrixSetId: js.UndefOr[String] = js.native
  
  /**
    * A collection of supported [TileMatrixSets](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileMatrixSet.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#tileMatrixSets)
    */
  var tileMatrixSets: js.UndefOr[CollectionProperties[TileMatrixSetProperties]] = js.native
  
  /**
    * The title of the WMTS sublayer used to identify it in places such as the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) and [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widgets.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#title)
    */
  var title: js.UndefOr[String] = js.native
}
object WMTSSublayerProperties {
  
  @scala.inline
  def apply(): WMTSSublayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WMTSSublayerProperties]
  }
  
  @scala.inline
  implicit class WMTSSublayerPropertiesMutableBuilder[Self <: WMTSSublayerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFullExtent(value: ExtentProperties): Self = StObject.set(x, "fullExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullExtentUndefined: Self = StObject.set(x, "fullExtent", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setImageFormat(value: String): Self = StObject.set(x, "imageFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageFormatUndefined: Self = StObject.set(x, "imageFormat", js.undefined)
    
    @scala.inline
    def setImageFormats(value: js.Array[String]): Self = StObject.set(x, "imageFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageFormatsUndefined: Self = StObject.set(x, "imageFormats", js.undefined)
    
    @scala.inline
    def setImageFormatsVarargs(value: String*): Self = StObject.set(x, "imageFormats", js.Array(value :_*))
    
    @scala.inline
    def setLayer(value: WMTSLayerProperties): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    @scala.inline
    def setStyleId(value: String): Self = StObject.set(x, "styleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleIdUndefined: Self = StObject.set(x, "styleId", js.undefined)
    
    @scala.inline
    def setStyles(value: CollectionProperties[WMTSStyleProperties]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    @scala.inline
    def setStylesVarargs(value: WMTSStyleProperties*): Self = StObject.set(x, "styles", js.Array(value :_*))
    
    @scala.inline
    def setTileMatrixSet(value: TileMatrixSetProperties): Self = StObject.set(x, "tileMatrixSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileMatrixSetId(value: String): Self = StObject.set(x, "tileMatrixSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileMatrixSetIdUndefined: Self = StObject.set(x, "tileMatrixSetId", js.undefined)
    
    @scala.inline
    def setTileMatrixSetUndefined: Self = StObject.set(x, "tileMatrixSet", js.undefined)
    
    @scala.inline
    def setTileMatrixSets(value: CollectionProperties[TileMatrixSetProperties]): Self = StObject.set(x, "tileMatrixSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileMatrixSetsUndefined: Self = StObject.set(x, "tileMatrixSets", js.undefined)
    
    @scala.inline
    def setTileMatrixSetsVarargs(value: TileMatrixSetProperties*): Self = StObject.set(x, "tileMatrixSets", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
