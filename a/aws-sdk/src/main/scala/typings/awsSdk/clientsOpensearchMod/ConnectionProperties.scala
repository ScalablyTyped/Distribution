package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionProperties extends StObject {
  
  /**
    * The endpoint of the remote domain.
    */
  var Endpoint: js.UndefOr[typings.awsSdk.clientsOpensearchMod.Endpoint] = js.undefined
}
object ConnectionProperties {
  
  inline def apply(): ConnectionProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectionProperties] (val x: Self) extends AnyVal {
    
    inline def setEndpoint(value: Endpoint): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
  }
}
