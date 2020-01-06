package typings.awsDashSdk.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAccessPointsResult extends js.Object {
  /**
    * Contains identification and configuration information for one or more access points associated with the specified bucket.
    */
  var AccessPointList: js.UndefOr[typings.awsDashSdk.clientsS3controlMod.AccessPointList] = js.native
  /**
    * If the specified bucket has more access points than can be returned in one call to this API, then this field contains a continuation token that you can provide in subsequent calls to this API to retrieve additional access points.
    */
  var NextToken: js.UndefOr[NonEmptyMaxLength1024String] = js.native
}

object ListAccessPointsResult {
  @scala.inline
  def apply(AccessPointList: AccessPointList = null, NextToken: NonEmptyMaxLength1024String = null): ListAccessPointsResult = {
    val __obj = js.Dynamic.literal()
    if (AccessPointList != null) __obj.updateDynamic("AccessPointList")(AccessPointList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAccessPointsResult]
  }
}

