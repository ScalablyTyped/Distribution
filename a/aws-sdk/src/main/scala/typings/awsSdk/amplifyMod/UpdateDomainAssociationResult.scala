package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDomainAssociationResult extends js.Object {
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
}

