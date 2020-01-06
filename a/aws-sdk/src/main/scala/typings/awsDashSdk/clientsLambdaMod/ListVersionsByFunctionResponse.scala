package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListVersionsByFunctionResponse extends js.Object {
  /**
    * The pagination token that's included if more results are available.
    */
  var NextMarker: js.UndefOr[String] = js.native
  /**
    * A list of Lambda function versions.
    */
  var Versions: js.UndefOr[FunctionList] = js.native
}

object ListVersionsByFunctionResponse {
  @scala.inline
  def apply(NextMarker: String = null, Versions: FunctionList = null): ListVersionsByFunctionResponse = {
    val __obj = js.Dynamic.literal()
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    if (Versions != null) __obj.updateDynamic("Versions")(Versions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVersionsByFunctionResponse]
  }
}

