package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSitesInput extends StObject {
  
  var MaxResults: js.UndefOr[MaxResults1000] = js.undefined
  
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * Filters the results by city.
    */
  var OperatingAddressCityFilter: js.UndefOr[CityList] = js.undefined
  
  /**
    * Filters the results by country code.
    */
  var OperatingAddressCountryCodeFilter: js.UndefOr[CountryCodeList] = js.undefined
  
  /**
    * Filters the results by state or region.
    */
  var OperatingAddressStateOrRegionFilter: js.UndefOr[StateOrRegionList] = js.undefined
}
object ListSitesInput {
  
  inline def apply(): ListSitesInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSitesInput]
  }
  
  extension [Self <: ListSitesInput](x: Self) {
    
    inline def setMaxResults(value: MaxResults1000): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOperatingAddressCityFilter(value: CityList): Self = StObject.set(x, "OperatingAddressCityFilter", value.asInstanceOf[js.Any])
    
    inline def setOperatingAddressCityFilterUndefined: Self = StObject.set(x, "OperatingAddressCityFilter", js.undefined)
    
    inline def setOperatingAddressCityFilterVarargs(value: City*): Self = StObject.set(x, "OperatingAddressCityFilter", js.Array(value*))
    
    inline def setOperatingAddressCountryCodeFilter(value: CountryCodeList): Self = StObject.set(x, "OperatingAddressCountryCodeFilter", value.asInstanceOf[js.Any])
    
    inline def setOperatingAddressCountryCodeFilterUndefined: Self = StObject.set(x, "OperatingAddressCountryCodeFilter", js.undefined)
    
    inline def setOperatingAddressCountryCodeFilterVarargs(value: CountryCode*): Self = StObject.set(x, "OperatingAddressCountryCodeFilter", js.Array(value*))
    
    inline def setOperatingAddressStateOrRegionFilter(value: StateOrRegionList): Self = StObject.set(x, "OperatingAddressStateOrRegionFilter", value.asInstanceOf[js.Any])
    
    inline def setOperatingAddressStateOrRegionFilterUndefined: Self = StObject.set(x, "OperatingAddressStateOrRegionFilter", js.undefined)
    
    inline def setOperatingAddressStateOrRegionFilterVarargs(value: StateOrRegion*): Self = StObject.set(x, "OperatingAddressStateOrRegionFilter", js.Array(value*))
  }
}
