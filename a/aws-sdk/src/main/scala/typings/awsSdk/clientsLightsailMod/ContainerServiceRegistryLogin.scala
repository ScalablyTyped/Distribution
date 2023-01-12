package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerServiceRegistryLogin extends StObject {
  
  /**
    * The timestamp of when the container image registry username and password expire. The log in credentials expire 12 hours after they are created, at which point you will need to create a new set of log in credentials using the CreateContainerServiceRegistryLogin action.
    */
  var expiresAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The container service registry password to use to push container images to the container image registry of a Lightsail account
    */
  var password: js.UndefOr[String] = js.undefined
  
  /**
    * The address to use to push container images to the container image registry of a Lightsail account.
    */
  var registry: js.UndefOr[String] = js.undefined
  
  /**
    * The container service registry username to use to push container images to the container image registry of a Lightsail account.
    */
  var username: js.UndefOr[String] = js.undefined
}
object ContainerServiceRegistryLogin {
  
  inline def apply(): ContainerServiceRegistryLogin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContainerServiceRegistryLogin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContainerServiceRegistryLogin] (val x: Self) extends AnyVal {
    
    inline def setExpiresAt(value: js.Date): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
    
    inline def setExpiresAtUndefined: Self = StObject.set(x, "expiresAt", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setRegistry(value: String): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
    
    inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
