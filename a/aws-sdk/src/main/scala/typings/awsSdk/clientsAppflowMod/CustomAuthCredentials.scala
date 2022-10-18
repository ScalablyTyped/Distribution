package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomAuthCredentials extends StObject {
  
  /**
    * A map that holds custom authentication credentials.
    */
  var credentialsMap: js.UndefOr[CredentialsMap] = js.undefined
  
  /**
    * The custom authentication type that the connector uses.
    */
  var customAuthenticationType: CustomAuthenticationType
}
object CustomAuthCredentials {
  
  inline def apply(customAuthenticationType: CustomAuthenticationType): CustomAuthCredentials = {
    val __obj = js.Dynamic.literal(customAuthenticationType = customAuthenticationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomAuthCredentials]
  }
  
  extension [Self <: CustomAuthCredentials](x: Self) {
    
    inline def setCredentialsMap(value: CredentialsMap): Self = StObject.set(x, "credentialsMap", value.asInstanceOf[js.Any])
    
    inline def setCredentialsMapUndefined: Self = StObject.set(x, "credentialsMap", js.undefined)
    
    inline def setCustomAuthenticationType(value: CustomAuthenticationType): Self = StObject.set(x, "customAuthenticationType", value.asInstanceOf[js.Any])
  }
}
