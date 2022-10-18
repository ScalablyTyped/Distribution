package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListThreatIntelSetsResponse extends StObject {
  
  /**
    * The pagination parameter to be used on the next list operation to retrieve more items.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The IDs of the ThreatIntelSet resources.
    */
  var ThreatIntelSetIds: typings.awsSdk.clientsGuarddutyMod.ThreatIntelSetIds
}
object ListThreatIntelSetsResponse {
  
  inline def apply(ThreatIntelSetIds: ThreatIntelSetIds): ListThreatIntelSetsResponse = {
    val __obj = js.Dynamic.literal(ThreatIntelSetIds = ThreatIntelSetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListThreatIntelSetsResponse]
  }
  
  extension [Self <: ListThreatIntelSetsResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setThreatIntelSetIds(value: ThreatIntelSetIds): Self = StObject.set(x, "ThreatIntelSetIds", value.asInstanceOf[js.Any])
    
    inline def setThreatIntelSetIdsVarargs(value: String*): Self = StObject.set(x, "ThreatIntelSetIds", js.Array(value*))
  }
}
