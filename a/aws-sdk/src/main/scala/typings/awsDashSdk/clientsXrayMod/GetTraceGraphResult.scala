package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTraceGraphResult extends js.Object {
  /**
    * Pagination token. Not used.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The services that have processed one of the specified requests.
    */
  var Services: js.UndefOr[ServiceList] = js.undefined
}

object GetTraceGraphResult {
  @scala.inline
  def apply(NextToken: String = null, Services: ServiceList = null): GetTraceGraphResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Services != null) __obj.updateDynamic("Services")(Services)
    __obj.asInstanceOf[GetTraceGraphResult]
  }
}

