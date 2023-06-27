package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait univariateColorSizeCreateContinuousRendererParamsSymbolOptionsSymbols extends StObject {
  
  /**
  		 * The symbol to use for the above portion of the `above-and-below` visualization.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer)
  		 */
  var above: Symbol
  
  /**
  		 * The symbol to use for the below portion of the `above-and-below` visualization.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer)
  		 */
  var below: Symbol
}
object univariateColorSizeCreateContinuousRendererParamsSymbolOptionsSymbols {
  
  inline def apply(above: Symbol, below: Symbol): univariateColorSizeCreateContinuousRendererParamsSymbolOptionsSymbols = {
    val __obj = js.Dynamic.literal(above = above.asInstanceOf[js.Any], below = below.asInstanceOf[js.Any])
    __obj.asInstanceOf[univariateColorSizeCreateContinuousRendererParamsSymbolOptionsSymbols]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: univariateColorSizeCreateContinuousRendererParamsSymbolOptionsSymbols] (val x: Self) extends AnyVal {
    
    inline def setAbove(value: Symbol): Self = StObject.set(x, "above", value.asInstanceOf[js.Any])
    
    inline def setBelow(value: Symbol): Self = StObject.set(x, "below", value.asInstanceOf[js.Any])
  }
}
