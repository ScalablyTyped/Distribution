package typings.awsSdk.clientsRoute53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResolverQueryLogConfigAssociationResponse extends StObject {
  
  /**
    * Information about the Resolver query logging configuration association that you specified in a GetQueryLogConfigAssociation request.
    */
  var ResolverQueryLogConfigAssociation: js.UndefOr[typings.awsSdk.clientsRoute53resolverMod.ResolverQueryLogConfigAssociation] = js.undefined
}
object GetResolverQueryLogConfigAssociationResponse {
  
  inline def apply(): GetResolverQueryLogConfigAssociationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResolverQueryLogConfigAssociationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResolverQueryLogConfigAssociationResponse] (val x: Self) extends AnyVal {
    
    inline def setResolverQueryLogConfigAssociation(value: ResolverQueryLogConfigAssociation): Self = StObject.set(x, "ResolverQueryLogConfigAssociation", value.asInstanceOf[js.Any])
    
    inline def setResolverQueryLogConfigAssociationUndefined: Self = StObject.set(x, "ResolverQueryLogConfigAssociation", js.undefined)
  }
}
