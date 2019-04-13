package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListNetworkProfilesRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the project for which you want to list network profiles.
    */
  var arn: AmazonResourceName
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * The type of network profile you wish to return information about. Valid values are listed below.
    */
  var `type`: js.UndefOr[NetworkProfileType] = js.undefined
}

object ListNetworkProfilesRequest {
  @scala.inline
  def apply(arn: AmazonResourceName, nextToken: PaginationToken = null, `type`: NetworkProfileType = null): ListNetworkProfilesRequest = {
    val __obj = js.Dynamic.literal(arn = arn)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListNetworkProfilesRequest]
  }
}

