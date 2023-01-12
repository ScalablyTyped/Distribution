package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.tall
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait symbolUtilsRenderPreviewHTMLOptions extends StObject {
  
  /**
    * Indicates whether to disable upsampling for raster images.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#renderPreviewHTML)
    */
  var disableUpsampling: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum size of the symbol preview in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#renderPreviewHTML)
    */
  var maxSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The parent node to append to the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#renderPreviewHTML)
    */
  var node: js.UndefOr[HTMLElement] = js.undefined
  
  /**
    * The opacity of the layer represented by the `symbol`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#renderPreviewHTML)
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * _Since 4.25_ The text that will be displayed in the symbol preview of a TextSymbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#renderPreviewHTML)
    */
  var overrideText: js.UndefOr[String] = js.undefined
  
  /**
    * The rotation of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#renderPreviewHTML)
    */
  var rotation: js.UndefOr[Double] = js.undefined
  
  /**
    * When `true` the size of the symbol preview will include the outline in the measurement of the entire symbol.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#renderPreviewHTML)
    */
  var scale: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Use a number to set the size (in points) of the symbol preview for any symbol representing a point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#renderPreviewHTML)
    */
  var size: js.UndefOr[Double | symbolUtilsRenderPreviewHTMLOptionsSize] = js.undefined
  
  /**
    * Options for setting the shape of a fill symbol preview.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-symbolUtils.html#renderPreviewHTML)
    */
  var symbolConfig: js.UndefOr[tall | symbolUtilsRenderPreviewHTMLOptionsSymbolConfig] = js.undefined
}
object symbolUtilsRenderPreviewHTMLOptions {
  
  inline def apply(): symbolUtilsRenderPreviewHTMLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[symbolUtilsRenderPreviewHTMLOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: symbolUtilsRenderPreviewHTMLOptions] (val x: Self) extends AnyVal {
    
    inline def setDisableUpsampling(value: Boolean): Self = StObject.set(x, "disableUpsampling", value.asInstanceOf[js.Any])
    
    inline def setDisableUpsamplingUndefined: Self = StObject.set(x, "disableUpsampling", js.undefined)
    
    inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    inline def setNode(value: HTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setOverrideText(value: String): Self = StObject.set(x, "overrideText", value.asInstanceOf[js.Any])
    
    inline def setOverrideTextUndefined: Self = StObject.set(x, "overrideText", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setScale(value: Boolean): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setSize(value: Double | symbolUtilsRenderPreviewHTMLOptionsSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSymbolConfig(value: tall | symbolUtilsRenderPreviewHTMLOptionsSymbolConfig): Self = StObject.set(x, "symbolConfig", value.asInstanceOf[js.Any])
    
    inline def setSymbolConfigUndefined: Self = StObject.set(x, "symbolConfig", js.undefined)
  }
}
