package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDomainAssociationResult extends js.Object {
  /**
    *  Domain Association structure. 
    */
  var domainAssociation: DomainAssociation = js.native
}

object CreateDomainAssociationResult {
  @scala.inline
  def apply(domainAssociation: DomainAssociation): CreateDomainAssociationResult = {
    val __obj = js.Dynamic.literal(domainAssociation = domainAssociation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateDomainAssociationResult]
  }
}

