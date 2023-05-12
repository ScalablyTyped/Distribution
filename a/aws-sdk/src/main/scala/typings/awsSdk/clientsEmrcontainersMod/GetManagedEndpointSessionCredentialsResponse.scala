package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetManagedEndpointSessionCredentialsResponse extends StObject {
  
  /**
    * The structure containing the session credentials.
    */
  var credentials: js.UndefOr[Credentials] = js.undefined
  
  /**
    * The date and time when the session token will expire.
    */
  var expiresAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier of the session token returned.
    */
  var id: js.UndefOr[ResourceIdString] = js.undefined
}
object GetManagedEndpointSessionCredentialsResponse {
  
  inline def apply(): GetManagedEndpointSessionCredentialsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetManagedEndpointSessionCredentialsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetManagedEndpointSessionCredentialsResponse] (val x: Self) extends AnyVal {
    
    inline def setCredentials(value: Credentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    inline def setExpiresAt(value: js.Date): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
    
    inline def setExpiresAtUndefined: Self = StObject.set(x, "expiresAt", js.undefined)
    
    inline def setId(value: ResourceIdString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
