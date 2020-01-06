package typings.awsDashSdk.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOriginEndpointsResponse extends js.Object {
  /**
    * A token that can be used to resume pagination from the end of the collection.
    */
  var NextToken: js.UndefOr[__string] = js.native
  /**
    * A list of OriginEndpoint records.
    */
  var OriginEndpoints: js.UndefOr[__listOfOriginEndpoint] = js.native
}

object ListOriginEndpointsResponse {
  @scala.inline
  def apply(NextToken: __string = null, OriginEndpoints: __listOfOriginEndpoint = null): ListOriginEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (OriginEndpoints != null) __obj.updateDynamic("OriginEndpoints")(OriginEndpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOriginEndpointsResponse]
  }
}

