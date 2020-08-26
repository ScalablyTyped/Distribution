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
  def apply(domainAssociations: DomainAssociations): ListDomainAssociationsResult = {
    val __obj = js.Dynamic.literal(domainAssociations = domainAssociations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDomainAssociationsResult]
  }
  @scala.inline
  implicit class ListDomainAssociationsResultOps[Self <: ListDomainAssociationsResult] (val x: Self) extends AnyVal {
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
    def setDomainAssociationsVarargs(value: DomainAssociation*): Self = this.set("domainAssociations", js.Array(value :_*))
    @scala.inline
    def setDomainAssociations(value: DomainAssociations): Self = this.set("domainAssociations", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

