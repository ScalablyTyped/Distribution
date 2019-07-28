package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStaticIpsResult extends js.Object {
  /**
    * A token used for advancing to the next page of results from your get static IPs request.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /**
    * An array of key-value pairs containing information about your get static IPs request.
    */
  var staticIps: js.UndefOr[StaticIpList] = js.undefined
}

object GetStaticIpsResult {
  @scala.inline
  def apply(nextPageToken: String = null, staticIps: StaticIpList = null): GetStaticIpsResult = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (staticIps != null) __obj.updateDynamic("staticIps")(staticIps)
    __obj.asInstanceOf[GetStaticIpsResult]
  }
}

