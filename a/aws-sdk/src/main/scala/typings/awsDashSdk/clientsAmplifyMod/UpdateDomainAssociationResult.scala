package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDomainAssociationResult extends js.Object {
  /**
    *  Domain Association structure. 
    */
  var domainAssociation: DomainAssociation
}

object UpdateDomainAssociationResult {
  @scala.inline
  def apply(domainAssociation: DomainAssociation): UpdateDomainAssociationResult = {
    val __obj = js.Dynamic.literal(domainAssociation = domainAssociation)
  
    __obj.asInstanceOf[UpdateDomainAssociationResult]
  }
}

