package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserStackAssociationsResult extends js.Object {
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The UserStackAssociation objects.
    */
  var UserStackAssociations: js.UndefOr[UserStackAssociationList] = js.native
}

object DescribeUserStackAssociationsResult {
  @scala.inline
  def apply(NextToken: String = null, UserStackAssociations: UserStackAssociationList = null): DescribeUserStackAssociationsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (UserStackAssociations != null) __obj.updateDynamic("UserStackAssociations")(UserStackAssociations.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserStackAssociationsResult]
  }
}

