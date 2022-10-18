package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDevicePositionsResponse extends StObject {
  
  /**
    * Contains details about each device's last known position. These details includes the device ID, the time when the position was sampled on the device, the time that the service received the update, and the most recent coordinates.
    */
  var Entries: ListDevicePositionsResponseEntryList
  
  /**
    * A pagination token indicating there are additional pages available. You can use the token in a following request to fetch the next set of results.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListDevicePositionsResponse {
  
  inline def apply(Entries: ListDevicePositionsResponseEntryList): ListDevicePositionsResponse = {
    val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDevicePositionsResponse]
  }
  
  extension [Self <: ListDevicePositionsResponse](x: Self) {
    
    inline def setEntries(value: ListDevicePositionsResponseEntryList): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: ListDevicePositionsResponseEntry*): Self = StObject.set(x, "Entries", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
