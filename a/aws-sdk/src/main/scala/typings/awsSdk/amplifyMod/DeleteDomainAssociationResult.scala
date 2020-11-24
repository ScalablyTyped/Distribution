package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDomainAssociationResult extends js.Object {
  
  var domainAssociation: DomainAssociation = js.native
}
object DeleteDomainAssociationResult {
  
  @scala.inline
  def apply(domainAssociation: DomainAssociation): DeleteDomainAssociationResult = {
    val __obj = js.Dynamic.literal(domainAssociation = domainAssociation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDomainAssociationResult]
  }
  
  @scala.inline
  implicit class DeleteDomainAssociationResultOps[Self <: DeleteDomainAssociationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDomainAssociation(value: DomainAssociation): Self = this.set("domainAssociation", value.asInstanceOf[js.Any])
  }
}
