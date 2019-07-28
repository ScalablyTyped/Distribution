package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDomainAssociationResult extends js.Object {
  /**
    *  Domain Association structure. 
    */
  var domainAssociation: DomainAssociation
}

object GetDomainAssociationResult {
  @scala.inline
  def apply(domainAssociation: DomainAssociation): GetDomainAssociationResult = {
    val __obj = js.Dynamic.literal(domainAssociation = domainAssociation)
  
    __obj.asInstanceOf[GetDomainAssociationResult]
  }
}

