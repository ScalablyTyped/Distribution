package typings.awsDashSdk.clientsSchemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDiscoverersRequest extends js.Object {
  var DiscovererIdPrefix: js.UndefOr[__string] = js.native
  var Limit: js.UndefOr[__integer] = js.native
  var NextToken: js.UndefOr[__string] = js.native
  var SourceArnPrefix: js.UndefOr[__string] = js.native
}

object ListDiscoverersRequest {
  @scala.inline
  def apply(
    DiscovererIdPrefix: __string = null,
    Limit: Int | Double = null,
    NextToken: __string = null,
    SourceArnPrefix: __string = null
  ): ListDiscoverersRequest = {
    val __obj = js.Dynamic.literal()
    if (DiscovererIdPrefix != null) __obj.updateDynamic("DiscovererIdPrefix")(DiscovererIdPrefix.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SourceArnPrefix != null) __obj.updateDynamic("SourceArnPrefix")(SourceArnPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDiscoverersRequest]
  }
}

