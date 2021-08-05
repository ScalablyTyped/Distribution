package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`coded-value`
import typings.arcgisJsApi.arcgisJsApiStrings.inherited
import typings.arcgisJsApi.arcgisJsApiStrings.range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainProperties extends StObject {
  
  /**
    * The domain name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html#name)
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The domain type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html#type)
    */
  var `type`: js.UndefOr[range | `coded-value` | inherited] = js.undefined
}
object DomainProperties {
  
  inline def apply(): DomainProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainProperties]
  }
  
  extension [Self <: DomainProperties](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setType(value: range | `coded-value` | inherited): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
