package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSatellitesResponse extends StObject {
  
  /**
    * Next token that can be supplied in the next call to get the next page of satellites.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * List of satellites.
    */
  var satellites: js.UndefOr[SatelliteList] = js.undefined
}
object ListSatellitesResponse {
  
  inline def apply(): ListSatellitesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSatellitesResponse]
  }
  
  extension [Self <: ListSatellitesResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSatellites(value: SatelliteList): Self = StObject.set(x, "satellites", value.asInstanceOf[js.Any])
    
    inline def setSatellitesUndefined: Self = StObject.set(x, "satellites", js.undefined)
    
    inline def setSatellitesVarargs(value: SatelliteListItem*): Self = StObject.set(x, "satellites", js.Array(value*))
  }
}
