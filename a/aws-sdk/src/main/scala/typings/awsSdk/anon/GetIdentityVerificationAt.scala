package typings.awsSdk.anon

import typings.awsSdk.serviceMod.WaiterConfiguration
import typings.awsSdk.sesMod.Identity
import typings.awsSdk.sesMod.IdentityList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/ses.GetIdentityVerificationAttributesRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait GetIdentityVerificationAt extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * A list of identities.
    */
  var Identities: IdentityList
}
object GetIdentityVerificationAt {
  
  inline def apply(Identities: IdentityList): GetIdentityVerificationAt = {
    val __obj = js.Dynamic.literal(Identities = Identities.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityVerificationAt]
  }
  
  extension [Self <: GetIdentityVerificationAt](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setIdentities(value: IdentityList): Self = StObject.set(x, "Identities", value.asInstanceOf[js.Any])
    
    inline def setIdentitiesVarargs(value: Identity*): Self = StObject.set(x, "Identities", js.Array(value :_*))
  }
}
