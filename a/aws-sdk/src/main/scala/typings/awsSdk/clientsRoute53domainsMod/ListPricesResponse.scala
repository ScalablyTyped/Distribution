package typings.awsSdk.clientsRoute53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPricesResponse extends StObject {
  
  /**
    * If there are more prices than you specified for MaxItems in the request, submit another request and include the value of NextPageMarker in the value of Marker.  Used only for all TLDs. If you specify a TLD, don't specify a NextPageMarker.
    */
  var NextPageMarker: js.UndefOr[PageMarker] = js.undefined
  
  /**
    * A complex type that includes all the pricing information. If you specify a TLD, this array contains only the pricing for that TLD.
    */
  var Prices: js.UndefOr[DomainPriceList] = js.undefined
}
object ListPricesResponse {
  
  inline def apply(): ListPricesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPricesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPricesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageMarker(value: PageMarker): Self = StObject.set(x, "NextPageMarker", value.asInstanceOf[js.Any])
    
    inline def setNextPageMarkerUndefined: Self = StObject.set(x, "NextPageMarker", js.undefined)
    
    inline def setPrices(value: DomainPriceList): Self = StObject.set(x, "Prices", value.asInstanceOf[js.Any])
    
    inline def setPricesUndefined: Self = StObject.set(x, "Prices", js.undefined)
    
    inline def setPricesVarargs(value: DomainPrice*): Self = StObject.set(x, "Prices", js.Array(value*))
  }
}
