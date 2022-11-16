package typings.arcgisJsApi.esri

import typings.std.FormData
import typings.std.HTMLFormElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenerateSymbolParameters extends StObject {
  
  /**
    * The SVG image to convert.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-symbolService.html#GenerateSymbolParameters)
    */
  var svgImage: js.UndefOr[String | FormData | HTMLFormElement] = js.undefined
}
object GenerateSymbolParameters {
  
  inline def apply(): GenerateSymbolParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateSymbolParameters]
  }
  
  extension [Self <: GenerateSymbolParameters](x: Self) {
    
    inline def setSvgImage(value: String | FormData | HTMLFormElement): Self = StObject.set(x, "svgImage", value.asInstanceOf[js.Any])
    
    inline def setSvgImageUndefined: Self = StObject.set(x, "svgImage", js.undefined)
  }
}
