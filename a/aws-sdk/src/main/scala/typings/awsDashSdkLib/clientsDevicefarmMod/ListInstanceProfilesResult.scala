package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListInstanceProfilesResult extends js.Object {
  /**
    * An object containing information about your instance profiles.
    */
  var instanceProfiles: js.UndefOr[InstanceProfiles] = js.undefined
  /**
    * An identifier that can be used in the next call to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListInstanceProfilesResult {
  @scala.inline
  def apply(instanceProfiles: InstanceProfiles = null, nextToken: PaginationToken = null): ListInstanceProfilesResult = {
    val __obj = js.Dynamic.literal()
    if (instanceProfiles != null) __obj.updateDynamic("instanceProfiles")(instanceProfiles)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListInstanceProfilesResult]
  }
}

