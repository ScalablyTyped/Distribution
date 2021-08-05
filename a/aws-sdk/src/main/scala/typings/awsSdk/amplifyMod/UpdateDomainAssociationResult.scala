package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDomainAssociationResult extends StObject {
  
  /**
    *  Describes a domain association, which associates a custom domain with an Amplify app. 
    */
  var domainAssociation: DomainAssociation
}
object UpdateDomainAssociationResult {
  
  inline def apply(domainAssociation: DomainAssociation): UpdateDomainAssociationResult = {
    val __obj = js.Dynamic.literal(domainAssociation = domainAssociation.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainAssociationResult]
  }
  
  extension [Self <: UpdateDomainAssociationResult](x: Self) {
    
    inline def setDomainAssociation(value: DomainAssociation): Self = StObject.set(x, "domainAssociation", value.asInstanceOf[js.Any])
  }
}
