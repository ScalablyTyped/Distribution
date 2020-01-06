package typings.awsDashSdk.vendorEndpointDashCacheMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointIdentifier
  extends /* key */ StringDictionary[js.UndefOr[String]] {
  var accessKeyId: js.UndefOr[String] = js.native
  var operation: js.UndefOr[String] = js.native
  var region: js.UndefOr[String] = js.native
  var serviceId: js.UndefOr[String] = js.native
}

object EndpointIdentifier {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.UndefOr[String]] = null,
    accessKeyId: String = null,
    operation: String = null,
    region: String = null,
    serviceId: String = null
  ): EndpointIdentifier = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (accessKeyId != null) __obj.updateDynamic("accessKeyId")(accessKeyId.asInstanceOf[js.Any])
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (serviceId != null) __obj.updateDynamic("serviceId")(serviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointIdentifier]
  }
}

