package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleRendererProperties
  extends StObject
     with RendererProperties
     with VisualVariablesMixinProperties {
  
  /**
    * The label for the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-SimpleRenderer.html#label)
    */
  var label: js.UndefOr[String] = js.undefined
  
  /**
    * The symbol used by the renderer to visualize all features in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-SimpleRenderer.html#symbol)
    */
  var symbol: js.UndefOr[SymbolProperties] = js.undefined
}
object SimpleRendererProperties {
  
  @scala.inline
  def apply(): SimpleRendererProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimpleRendererProperties]
  }
  
  @scala.inline
  implicit class SimpleRendererPropertiesMutableBuilder[Self <: SimpleRendererProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setSymbol(value: SymbolProperties): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
  }
}
