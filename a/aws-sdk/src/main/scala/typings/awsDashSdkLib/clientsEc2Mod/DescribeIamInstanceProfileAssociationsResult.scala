package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeIamInstanceProfileAssociationsResult extends js.Object {
  /**
    * Information about one or more IAM instance profile associations.
    */
  var IamInstanceProfileAssociations: js.UndefOr[IamInstanceProfileAssociationSet] = js.undefined
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeIamInstanceProfileAssociationsResult {
  @scala.inline
  def apply(
    IamInstanceProfileAssociations: IamInstanceProfileAssociationSet = null,
    NextToken: NextToken = null
  ): DescribeIamInstanceProfileAssociationsResult = {
    val __obj = js.Dynamic.literal()
    if (IamInstanceProfileAssociations != null) __obj.updateDynamic("IamInstanceProfileAssociations")(IamInstanceProfileAssociations)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeIamInstanceProfileAssociationsResult]
  }
}

