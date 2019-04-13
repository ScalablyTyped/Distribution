package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeUserStackAssociationsResult extends js.Object {
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The UserStackAssociation objects.
    */
  var UserStackAssociations: js.UndefOr[UserStackAssociationList] = js.undefined
}

object DescribeUserStackAssociationsResult {
  @scala.inline
  def apply(NextToken: String = null, UserStackAssociations: UserStackAssociationList = null): DescribeUserStackAssociationsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (UserStackAssociations != null) __obj.updateDynamic("UserStackAssociations")(UserStackAssociations)
    __obj.asInstanceOf[DescribeUserStackAssociationsResult]
  }
}

