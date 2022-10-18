package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDomainRequest extends StObject {
  
  /**
    * The domain ID.
    */
  var DomainId: typings.awsSdk.clientsSagemakerMod.DomainId
  
  /**
    * The retention policy for this domain, which specifies whether resources will be retained after the Domain is deleted. By default, all resources are retained (not automatically deleted). 
    */
  var RetentionPolicy: js.UndefOr[typings.awsSdk.clientsSagemakerMod.RetentionPolicy] = js.undefined
}
object DeleteDomainRequest {
  
  inline def apply(DomainId: DomainId): DeleteDomainRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDomainRequest]
  }
  
  extension [Self <: DeleteDomainRequest](x: Self) {
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setRetentionPolicy(value: RetentionPolicy): Self = StObject.set(x, "RetentionPolicy", value.asInstanceOf[js.Any])
    
    inline def setRetentionPolicyUndefined: Self = StObject.set(x, "RetentionPolicy", js.undefined)
  }
}
