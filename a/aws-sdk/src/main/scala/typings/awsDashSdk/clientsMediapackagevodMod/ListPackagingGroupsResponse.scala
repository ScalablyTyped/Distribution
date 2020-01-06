package typings.awsDashSdk.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPackagingGroupsResponse extends js.Object {
  /**
    * A token that can be used to resume pagination from the end of the collection.
    */
  var NextToken: js.UndefOr[__string] = js.native
  /**
    * A list of MediaPackage VOD PackagingGroup resources.
    */
  var PackagingGroups: js.UndefOr[__listOfPackagingGroup] = js.native
}

object ListPackagingGroupsResponse {
  @scala.inline
  def apply(NextToken: __string = null, PackagingGroups: __listOfPackagingGroup = null): ListPackagingGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PackagingGroups != null) __obj.updateDynamic("PackagingGroups")(PackagingGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPackagingGroupsResponse]
  }
}

