package typings.awsSdk.clientsPricingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPriceListFileUrlResponse extends StObject {
  
  /**
    * The URL to download your Price List file from. 
    */
  var Url: js.UndefOr[String] = js.undefined
}
object GetPriceListFileUrlResponse {
  
  inline def apply(): GetPriceListFileUrlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPriceListFileUrlResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPriceListFileUrlResponse] (val x: Self) extends AnyVal {
    
    inline def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
