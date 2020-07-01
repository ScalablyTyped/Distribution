package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDomainAssociationResult extends js.Object {
  /**
    *  Describes the structure of a domain association, which associates a custom domain with an Amplify app. 
    */
  var domainAssociation: DomainAssociation = js.native
}

object GetDomainAssociationResult {
  @scala.inline
  def apply(domainAssociation: DomainAssociation): GetDomainAssociationResult = {
    val __obj = js.Dynamic.literal(domainAssociation = domainAssociation.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainAssociationResult]
  }
}

