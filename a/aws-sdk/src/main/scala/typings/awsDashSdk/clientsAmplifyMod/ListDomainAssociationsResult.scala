package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDomainAssociationsResult extends js.Object {
  /**
    *  List of Domain Associations. 
    */
  var domainAssociations: DomainAssociations
  /**
    *  Pagination token. If non-null pagination token is returned in a result, then pass its value in another request to fetch more entries. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListDomainAssociationsResult {
  @scala.inline
  def apply(domainAssociations: DomainAssociations, nextToken: NextToken = null): ListDomainAssociationsResult = {
    val __obj = js.Dynamic.literal(domainAssociations = domainAssociations)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListDomainAssociationsResult]
  }
}

