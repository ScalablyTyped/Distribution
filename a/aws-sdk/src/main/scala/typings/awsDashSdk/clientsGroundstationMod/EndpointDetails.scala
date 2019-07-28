package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointDetails extends js.Object {
  /**
    * A dataflow endpoint.
    */
  var endpoint: js.UndefOr[DataflowEndpoint] = js.undefined
  /**
    * Endpoint security details.
    */
  var securityDetails: js.UndefOr[SecurityDetails] = js.undefined
}

object EndpointDetails {
  @scala.inline
  def apply(endpoint: DataflowEndpoint = null, securityDetails: SecurityDetails = null): EndpointDetails = {
    val __obj = js.Dynamic.literal()
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    if (securityDetails != null) __obj.updateDynamic("securityDetails")(securityDetails)
    __obj.asInstanceOf[EndpointDetails]
  }
}

