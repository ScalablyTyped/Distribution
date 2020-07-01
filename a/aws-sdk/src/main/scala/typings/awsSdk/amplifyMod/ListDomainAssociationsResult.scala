package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDomainAssociationsResult extends js.Object {
  /**
    *  A list of domain associations. 
    */
  var domainAssociations: DomainAssociations = js.native
  /**
    *  A pagination token. If non-null, a pagination token is returned in a result. Pass its value in another request to retrieve more entries. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListDomainAssociationsResult {
  @scala.inline
  def apply(domainAssociations: DomainAssociations, nextToken: NextToken = null): ListDomainAssociationsResult = {
    val __obj = js.Dynamic.literal(domainAssociations = domainAssociations.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDomainAssociationsResult]
  }
}

