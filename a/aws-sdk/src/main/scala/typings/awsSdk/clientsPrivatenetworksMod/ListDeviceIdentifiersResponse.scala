package typings.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDeviceIdentifiersResponse extends StObject {
  
  /**
    * Information about the device identifiers.
    */
  var deviceIdentifiers: js.UndefOr[DeviceIdentifierList] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListDeviceIdentifiersResponse {
  
  inline def apply(): ListDeviceIdentifiersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeviceIdentifiersResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDeviceIdentifiersResponse] (val x: Self) extends AnyVal {
    
    inline def setDeviceIdentifiers(value: DeviceIdentifierList): Self = StObject.set(x, "deviceIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdentifiersUndefined: Self = StObject.set(x, "deviceIdentifiers", js.undefined)
    
    inline def setDeviceIdentifiersVarargs(value: DeviceIdentifier*): Self = StObject.set(x, "deviceIdentifiers", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
