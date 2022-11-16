package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintResponse extends StObject {
  
  /**
    * URL pointing to the location of the generated printout of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-print.html#PrintResponse)
    */
  var url: String
}
object PrintResponse {
  
  inline def apply(url: String): PrintResponse = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintResponse]
  }
  
  extension [Self <: PrintResponse](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
