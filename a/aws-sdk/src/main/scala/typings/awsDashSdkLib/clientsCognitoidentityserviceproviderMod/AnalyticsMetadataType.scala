package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsMetadataType extends js.Object {
  /**
    * The endpoint ID.
    */
  var AnalyticsEndpointId: js.UndefOr[StringType] = js.undefined
}

object AnalyticsMetadataType {
  @scala.inline
  def apply(AnalyticsEndpointId: StringType = null): AnalyticsMetadataType = {
    val __obj = js.Dynamic.literal()
    if (AnalyticsEndpointId != null) __obj.updateDynamic("AnalyticsEndpointId")(AnalyticsEndpointId)
    __obj.asInstanceOf[AnalyticsMetadataType]
  }
}

