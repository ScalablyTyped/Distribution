package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDomainAssociationResult extends StObject {
  
  /**
    *  Describes a domain association, which associates a custom domain with an Amplify app. 
    */
  var domainAssociation: DomainAssociation = js.native
}
object UpdateDomainAssociationResult {
  
  @scala.inline
  def apply(domainAssociation: DomainAssociation): UpdateDomainAssociationResult = {
    val __obj = js.Dynamic.literal(domainAssociation = domainAssociation.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainAssociationResult]
  }
  
  @scala.inline
  implicit class UpdateDomainAssociationResultMutableBuilder[Self <: UpdateDomainAssociationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainAssociation(value: DomainAssociation): Self = StObject.set(x, "domainAssociation", value.asInstanceOf[js.Any])
  }
}
