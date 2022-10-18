package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopRemoteAccessSessionResult extends StObject {
  
  /**
    * A container that represents the metadata from the service about the remote access session you are stopping.
    */
  var remoteAccessSession: js.UndefOr[RemoteAccessSession] = js.undefined
}
object StopRemoteAccessSessionResult {
  
  inline def apply(): StopRemoteAccessSessionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopRemoteAccessSessionResult]
  }
  
  extension [Self <: StopRemoteAccessSessionResult](x: Self) {
    
    inline def setRemoteAccessSession(value: RemoteAccessSession): Self = StObject.set(x, "remoteAccessSession", value.asInstanceOf[js.Any])
    
    inline def setRemoteAccessSessionUndefined: Self = StObject.set(x, "remoteAccessSession", js.undefined)
  }
}
