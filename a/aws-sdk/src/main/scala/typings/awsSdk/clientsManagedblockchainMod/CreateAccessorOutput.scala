package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAccessorOutput extends StObject {
  
  /**
    * The unique identifier of the accessor.
    */
  var AccessorId: js.UndefOr[ResourceIdString] = js.undefined
  
  /**
    * The billing token is a property of the Accessor. Use this token to make Ethereum API calls to your Ethereum node. The billing token is used to track your accessor object for billing Ethereum API requests made to your Ethereum nodes.
    */
  var BillingToken: js.UndefOr[AccessorBillingTokenString] = js.undefined
}
object CreateAccessorOutput {
  
  inline def apply(): CreateAccessorOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAccessorOutput]
  }
  
  extension [Self <: CreateAccessorOutput](x: Self) {
    
    inline def setAccessorId(value: ResourceIdString): Self = StObject.set(x, "AccessorId", value.asInstanceOf[js.Any])
    
    inline def setAccessorIdUndefined: Self = StObject.set(x, "AccessorId", js.undefined)
    
    inline def setBillingToken(value: AccessorBillingTokenString): Self = StObject.set(x, "BillingToken", value.asInstanceOf[js.Any])
    
    inline def setBillingTokenUndefined: Self = StObject.set(x, "BillingToken", js.undefined)
  }
}
