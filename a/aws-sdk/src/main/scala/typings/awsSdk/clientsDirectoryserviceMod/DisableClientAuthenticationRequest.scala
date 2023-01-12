package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableClientAuthenticationRequest extends StObject {
  
  /**
    * The identifier of the directory 
    */
  var DirectoryId: typings.awsSdk.clientsDirectoryserviceMod.DirectoryId
  
  /**
    * The type of client authentication to disable. Currently, only the parameter, SmartCard is supported.
    */
  var Type: ClientAuthenticationType
}
object DisableClientAuthenticationRequest {
  
  inline def apply(DirectoryId: DirectoryId, Type: ClientAuthenticationType): DisableClientAuthenticationRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableClientAuthenticationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisableClientAuthenticationRequest] (val x: Self) extends AnyVal {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setType(value: ClientAuthenticationType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
