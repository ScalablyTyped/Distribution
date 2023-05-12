package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetachVerifiedAccessTrustProviderResult extends StObject {
  
  /**
    * The ID of the Verified Access instance.
    */
  var VerifiedAccessInstance: js.UndefOr[typings.awsSdk.clientsEc2Mod.VerifiedAccessInstance] = js.undefined
  
  /**
    * The ID of the Verified Access trust provider.
    */
  var VerifiedAccessTrustProvider: js.UndefOr[typings.awsSdk.clientsEc2Mod.VerifiedAccessTrustProvider] = js.undefined
}
object DetachVerifiedAccessTrustProviderResult {
  
  inline def apply(): DetachVerifiedAccessTrustProviderResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetachVerifiedAccessTrustProviderResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetachVerifiedAccessTrustProviderResult] (val x: Self) extends AnyVal {
    
    inline def setVerifiedAccessInstance(value: VerifiedAccessInstance): Self = StObject.set(x, "VerifiedAccessInstance", value.asInstanceOf[js.Any])
    
    inline def setVerifiedAccessInstanceUndefined: Self = StObject.set(x, "VerifiedAccessInstance", js.undefined)
    
    inline def setVerifiedAccessTrustProvider(value: VerifiedAccessTrustProvider): Self = StObject.set(x, "VerifiedAccessTrustProvider", value.asInstanceOf[js.Any])
    
    inline def setVerifiedAccessTrustProviderUndefined: Self = StObject.set(x, "VerifiedAccessTrustProvider", js.undefined)
  }
}
