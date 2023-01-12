package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackendDefaults extends StObject {
  
  /**
    * A reference to an object that represents a client policy.
    */
  var clientPolicy: js.UndefOr[ClientPolicy] = js.undefined
}
object BackendDefaults {
  
  inline def apply(): BackendDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackendDefaults]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackendDefaults] (val x: Self) extends AnyVal {
    
    inline def setClientPolicy(value: ClientPolicy): Self = StObject.set(x, "clientPolicy", value.asInstanceOf[js.Any])
    
    inline def setClientPolicyUndefined: Self = StObject.set(x, "clientPolicy", js.undefined)
  }
}
