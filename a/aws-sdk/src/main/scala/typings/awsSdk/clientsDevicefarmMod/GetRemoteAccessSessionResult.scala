package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRemoteAccessSessionResult extends StObject {
  
  /**
    * A container that lists detailed information about the remote access session.
    */
  var remoteAccessSession: js.UndefOr[RemoteAccessSession] = js.undefined
}
object GetRemoteAccessSessionResult {
  
  inline def apply(): GetRemoteAccessSessionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRemoteAccessSessionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRemoteAccessSessionResult] (val x: Self) extends AnyVal {
    
    inline def setRemoteAccessSession(value: RemoteAccessSession): Self = StObject.set(x, "remoteAccessSession", value.asInstanceOf[js.Any])
    
    inline def setRemoteAccessSessionUndefined: Self = StObject.set(x, "remoteAccessSession", js.undefined)
  }
}
