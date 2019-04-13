package typings
package awsDashSdkLib.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealtimeEndpointInfo extends js.Object {
  /**
    * The time that the request to create the real-time endpoint for the MLModel was received. The time is expressed in epoch time.
    */
  var CreatedAt: js.UndefOr[EpochTime] = js.undefined
  /**
    *  The current status of the real-time endpoint for the MLModel. This element can have one of the following values:    NONE - Endpoint does not exist or was previously deleted.  READY - Endpoint is ready to be used for real-time predictions.  UPDATING - Updating/creating the endpoint.  
    */
  var EndpointStatus: js.UndefOr[RealtimeEndpointStatus] = js.undefined
  /**
    * The URI that specifies where to send real-time prediction requests for the MLModel. Note The application must wait until the real-time endpoint is ready before using this URI. 
    */
  var EndpointUrl: js.UndefOr[VipURL] = js.undefined
  /**
    *  The maximum processing rate for the real-time endpoint for MLModel, measured in incoming requests per second.
    */
  var PeakRequestsPerSecond: js.UndefOr[IntegerType] = js.undefined
}

object RealtimeEndpointInfo {
  @scala.inline
  def apply(
    CreatedAt: EpochTime = null,
    EndpointStatus: RealtimeEndpointStatus = null,
    EndpointUrl: VipURL = null,
    PeakRequestsPerSecond: js.UndefOr[IntegerType] = js.undefined
  ): RealtimeEndpointInfo = {
    val __obj = js.Dynamic.literal()
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt)
    if (EndpointStatus != null) __obj.updateDynamic("EndpointStatus")(EndpointStatus.asInstanceOf[js.Any])
    if (EndpointUrl != null) __obj.updateDynamic("EndpointUrl")(EndpointUrl)
    if (!js.isUndefined(PeakRequestsPerSecond)) __obj.updateDynamic("PeakRequestsPerSecond")(PeakRequestsPerSecond)
    __obj.asInstanceOf[RealtimeEndpointInfo]
  }
}

