package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRemoteAccessSessionsResult extends StObject {
  
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * A container that represents the metadata from the service about each remote access session you are requesting.
    */
  var remoteAccessSessions: js.UndefOr[RemoteAccessSessions] = js.undefined
}
object ListRemoteAccessSessionsResult {
  
  inline def apply(): ListRemoteAccessSessionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRemoteAccessSessionsResult]
  }
  
  extension [Self <: ListRemoteAccessSessionsResult](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRemoteAccessSessions(value: RemoteAccessSessions): Self = StObject.set(x, "remoteAccessSessions", value.asInstanceOf[js.Any])
    
    inline def setRemoteAccessSessionsUndefined: Self = StObject.set(x, "remoteAccessSessions", js.undefined)
    
    inline def setRemoteAccessSessionsVarargs(value: RemoteAccessSession*): Self = StObject.set(x, "remoteAccessSessions", js.Array(value*))
  }
}
