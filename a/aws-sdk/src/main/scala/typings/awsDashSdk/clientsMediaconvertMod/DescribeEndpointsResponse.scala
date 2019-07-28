package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEndpointsResponse extends js.Object {
  /**
    * List of endpoints
    */
  var Endpoints: js.UndefOr[__listOfEndpoint] = js.undefined
  /**
    * Use this string to request the next batch of endpoints.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object DescribeEndpointsResponse {
  @scala.inline
  def apply(Endpoints: __listOfEndpoint = null, NextToken: __string = null): DescribeEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    if (Endpoints != null) __obj.updateDynamic("Endpoints")(Endpoints)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeEndpointsResponse]
  }
}

