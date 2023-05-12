package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVerifiedAccessTrustProviderResult extends StObject {
  
  /**
    * The ID of the Verified Access trust provider.
    */
  var VerifiedAccessTrustProvider: js.UndefOr[typings.awsSdk.clientsEc2Mod.VerifiedAccessTrustProvider] = js.undefined
}
object CreateVerifiedAccessTrustProviderResult {
  
  inline def apply(): CreateVerifiedAccessTrustProviderResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVerifiedAccessTrustProviderResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVerifiedAccessTrustProviderResult] (val x: Self) extends AnyVal {
    
    inline def setVerifiedAccessTrustProvider(value: VerifiedAccessTrustProvider): Self = StObject.set(x, "VerifiedAccessTrustProvider", value.asInstanceOf[js.Any])
    
    inline def setVerifiedAccessTrustProviderUndefined: Self = StObject.set(x, "VerifiedAccessTrustProvider", js.undefined)
  }
}
