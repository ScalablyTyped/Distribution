package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightLayerViewMixinProperties extends StObject {
  
  /**
    * Options for configuring the highlight.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-HighlightLayerViewMixin.html#highlightOptions)
    */
  var highlightOptions: js.UndefOr[HighlightOptions] = js.undefined
}
object HighlightLayerViewMixinProperties {
  
  inline def apply(): HighlightLayerViewMixinProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HighlightLayerViewMixinProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HighlightLayerViewMixinProperties] (val x: Self) extends AnyVal {
    
    inline def setHighlightOptions(value: HighlightOptions): Self = StObject.set(x, "highlightOptions", value.asInstanceOf[js.Any])
    
    inline def setHighlightOptionsUndefined: Self = StObject.set(x, "highlightOptions", js.undefined)
  }
}
