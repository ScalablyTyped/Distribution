package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Principal extends StObject {
  
  /**
    * The ARN of the principal (user, role, or group). This field allows for an ARN with no accountID if the PrincipalType is an IAM_PATTERN. 
    */
  var PrincipalARN: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.PrincipalARN] = js.undefined
  
  /**
    * The principal type. The supported value is IAM if you use a fully defined ARN, or IAM_PATTERN if you use an ARN with no accountID. 
    */
  var PrincipalType: js.UndefOr[typings.awsSdk.clientsServicecatalogMod.PrincipalType] = js.undefined
}
object Principal {
  
  inline def apply(): Principal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Principal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Principal] (val x: Self) extends AnyVal {
    
    inline def setPrincipalARN(value: PrincipalARN): Self = StObject.set(x, "PrincipalARN", value.asInstanceOf[js.Any])
    
    inline def setPrincipalARNUndefined: Self = StObject.set(x, "PrincipalARN", js.undefined)
    
    inline def setPrincipalType(value: PrincipalType): Self = StObject.set(x, "PrincipalType", value.asInstanceOf[js.Any])
    
    inline def setPrincipalTypeUndefined: Self = StObject.set(x, "PrincipalType", js.undefined)
  }
}
