package typings
package awsDashSdkLib.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViewBillingResponse extends js.Object {
  /**
    * A summary of billing records.
    */
  var BillingRecords: js.UndefOr[BillingRecords] = js.undefined
  /**
    * If there are more billing records than you specified for MaxItems in the request, submit another request and include the value of NextPageMarker in the value of Marker.
    */
  var NextPageMarker: js.UndefOr[PageMarker] = js.undefined
}

object ViewBillingResponse {
  @scala.inline
  def apply(BillingRecords: BillingRecords = null, NextPageMarker: PageMarker = null): ViewBillingResponse = {
    val __obj = js.Dynamic.literal()
    if (BillingRecords != null) __obj.updateDynamic("BillingRecords")(BillingRecords)
    if (NextPageMarker != null) __obj.updateDynamic("NextPageMarker")(NextPageMarker)
    __obj.asInstanceOf[ViewBillingResponse]
  }
}

