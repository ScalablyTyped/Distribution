package typings.awsSdk.clientsGlacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VaultAccessPolicy extends StObject {
  
  /**
    * The vault access policy.
    */
  var Policy: js.UndefOr[String] = js.undefined
}
object VaultAccessPolicy {
  
  inline def apply(): VaultAccessPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VaultAccessPolicy]
  }
  
  extension [Self <: VaultAccessPolicy](x: Self) {
    
    inline def setPolicy(value: String): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "Policy", js.undefined)
  }
}
