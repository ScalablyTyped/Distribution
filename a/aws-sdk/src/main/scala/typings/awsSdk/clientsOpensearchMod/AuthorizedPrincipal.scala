package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizedPrincipal extends StObject {
  
  /**
    * The IAM principal that is allowed access to the domain.
    */
  var Principal: js.UndefOr[String] = js.undefined
  
  /**
    * The type of principal.
    */
  var PrincipalType: js.UndefOr[typings.awsSdk.clientsOpensearchMod.PrincipalType] = js.undefined
}
object AuthorizedPrincipal {
  
  inline def apply(): AuthorizedPrincipal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizedPrincipal]
  }
  
  extension [Self <: AuthorizedPrincipal](x: Self) {
    
    inline def setPrincipal(value: String): Self = StObject.set(x, "Principal", value.asInstanceOf[js.Any])
    
    inline def setPrincipalType(value: PrincipalType): Self = StObject.set(x, "PrincipalType", value.asInstanceOf[js.Any])
    
    inline def setPrincipalTypeUndefined: Self = StObject.set(x, "PrincipalType", js.undefined)
    
    inline def setPrincipalUndefined: Self = StObject.set(x, "Principal", js.undefined)
  }
}
