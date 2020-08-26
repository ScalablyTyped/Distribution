package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDomainAssociationResult extends js.Object {
  /**
    *  Describes the structure of a domain association, which associates a custom domain with an Amplify app. 
    */
  var domainAssociation: DomainAssociation = js.native
}

object CreateDomainAssociationResult {
  @scala.inline
  def apply(domainAssociation: DomainAssociation): CreateDomainAssociationResult = {
    val __obj = js.Dynamic.literal(domainAssociation = domainAssociation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainAssociationResult]
  }
  @scala.inline
  implicit class CreateDomainAssociationResultOps[Self <: CreateDomainAssociationResult] (val x: Self) extends AnyVal {
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

