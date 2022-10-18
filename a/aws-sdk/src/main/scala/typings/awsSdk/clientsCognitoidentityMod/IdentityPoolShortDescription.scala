package typings.awsSdk.clientsCognitoidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityPoolShortDescription extends StObject {
  
  /**
    * An identity pool ID in the format REGION:GUID.
    */
  var IdentityPoolId: js.UndefOr[typings.awsSdk.clientsCognitoidentityMod.IdentityPoolId] = js.undefined
  
  /**
    * A string that you provide.
    */
  var IdentityPoolName: js.UndefOr[typings.awsSdk.clientsCognitoidentityMod.IdentityPoolName] = js.undefined
}
object IdentityPoolShortDescription {
  
  inline def apply(): IdentityPoolShortDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityPoolShortDescription]
  }
  
  extension [Self <: IdentityPoolShortDescription](x: Self) {
    
    inline def setIdentityPoolId(value: IdentityPoolId): Self = StObject.set(x, "IdentityPoolId", value.asInstanceOf[js.Any])
    
    inline def setIdentityPoolIdUndefined: Self = StObject.set(x, "IdentityPoolId", js.undefined)
    
    inline def setIdentityPoolName(value: IdentityPoolName): Self = StObject.set(x, "IdentityPoolName", value.asInstanceOf[js.Any])
    
    inline def setIdentityPoolNameUndefined: Self = StObject.set(x, "IdentityPoolName", js.undefined)
  }
}
