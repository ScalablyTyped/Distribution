package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeImagePermissionsResult extends js.Object {
  /**
    * The name of the private image.
    */
  var Name: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.Name] = js.undefined
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The permissions for a private image that you own. 
    */
  var SharedImagePermissionsList: js.UndefOr[typings.awsDashSdk.clientsAppstreamMod.SharedImagePermissionsList] = js.undefined
}

object DescribeImagePermissionsResult {
  @scala.inline
  def apply(
    Name: Name = null,
    NextToken: String = null,
    SharedImagePermissionsList: SharedImagePermissionsList = null
  ): DescribeImagePermissionsResult = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SharedImagePermissionsList != null) __obj.updateDynamic("SharedImagePermissionsList")(SharedImagePermissionsList)
    __obj.asInstanceOf[DescribeImagePermissionsResult]
  }
}

