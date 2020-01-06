package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointDetails extends js.Object {
  /**
    * A dataflow endpoint.
    */
  var endpoint: js.UndefOr[DataflowEndpoint] = js.native
  /**
    * Endpoint security details.
    */
  var securityDetails: js.UndefOr[SecurityDetails] = js.native
}

object EndpointDetails {
  @scala.inline
  def apply(endpoint: DataflowEndpoint = null, securityDetails: SecurityDetails = null): EndpointDetails = {
    val __obj = js.Dynamic.literal()
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (securityDetails != null) __obj.updateDynamic("securityDetails")(securityDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointDetails]
  }
}

