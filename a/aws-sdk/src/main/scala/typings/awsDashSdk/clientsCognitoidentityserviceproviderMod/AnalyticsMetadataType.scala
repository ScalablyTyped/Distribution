package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsMetadataType extends js.Object {
  /**
    * The endpoint ID.
    */
  var AnalyticsEndpointId: js.UndefOr[StringType] = js.native
}

object AnalyticsMetadataType {
  @scala.inline
  def apply(AnalyticsEndpointId: StringType = null): AnalyticsMetadataType = {
    val __obj = js.Dynamic.literal()
    if (AnalyticsEndpointId != null) __obj.updateDynamic("AnalyticsEndpointId")(AnalyticsEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsMetadataType]
  }
}

