package typings
package awsDashSdkLib.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOperationsResponse extends js.Object {
  /**
    * If there are more operations than you specified for MaxItems in the request, submit another request and include the value of NextPageMarker in the value of Marker.
    */
  var NextPageMarker: js.UndefOr[PageMarker] = js.undefined
  /**
    * Lists summaries of the operations.
    */
  var Operations: OperationSummaryList
}

object ListOperationsResponse {
  @scala.inline
  def apply(Operations: OperationSummaryList, NextPageMarker: PageMarker = null): ListOperationsResponse = {
    val __obj = js.Dynamic.literal(Operations = Operations)
    if (NextPageMarker != null) __obj.updateDynamic("NextPageMarker")(NextPageMarker)
    __obj.asInstanceOf[ListOperationsResponse]
  }
}

