package typings.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDomainAssociationResult extends StObject {
  
  var domainAssociation: DomainAssociation
}
object DeleteDomainAssociationResult {
  
  inline def apply(domainAssociation: DomainAssociation): DeleteDomainAssociationResult = {
    val __obj = js.Dynamic.literal(domainAssociation = domainAssociation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDomainAssociationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteDomainAssociationResult] (val x: Self) extends AnyVal {
    
    inline def setDomainAssociation(value: DomainAssociation): Self = StObject.set(x, "domainAssociation", value.asInstanceOf[js.Any])
  }
}
