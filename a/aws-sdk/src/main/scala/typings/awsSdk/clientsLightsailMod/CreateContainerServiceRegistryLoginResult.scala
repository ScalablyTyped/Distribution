package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateContainerServiceRegistryLoginResult extends StObject {
  
  /**
    * An object that describes the log in information for the container service registry of your Lightsail account.
    */
  var registryLogin: js.UndefOr[ContainerServiceRegistryLogin] = js.undefined
}
object CreateContainerServiceRegistryLoginResult {
  
  inline def apply(): CreateContainerServiceRegistryLoginResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateContainerServiceRegistryLoginResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateContainerServiceRegistryLoginResult] (val x: Self) extends AnyVal {
    
    inline def setRegistryLogin(value: ContainerServiceRegistryLogin): Self = StObject.set(x, "registryLogin", value.asInstanceOf[js.Any])
    
    inline def setRegistryLoginUndefined: Self = StObject.set(x, "registryLogin", js.undefined)
  }
}
