package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListFunctionsResponse extends js.Object {
  /**
    * A list of Lambda functions.
    */
  var Functions: js.UndefOr[FunctionList] = js.native
  /**
    * The pagination token that's included if more results are available.
    */
  var NextMarker: js.UndefOr[String] = js.native
}

object ListFunctionsResponse {
  @scala.inline
  def apply(Functions: FunctionList = null, NextMarker: String = null): ListFunctionsResponse = {
    val __obj = js.Dynamic.literal()
    if (Functions != null) __obj.updateDynamic("Functions")(Functions.asInstanceOf[js.Any])
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFunctionsResponse]
  }
}

