package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

