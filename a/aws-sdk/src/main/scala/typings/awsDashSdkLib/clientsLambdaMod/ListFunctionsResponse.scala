package typings
package awsDashSdkLib.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFunctionsResponse extends js.Object {
  /**
    * A list of Lambda functions.
    */
  var Functions: js.UndefOr[FunctionList] = js.undefined
  /**
    * The pagination token that's included if more results are available.
    */
  var NextMarker: js.UndefOr[String] = js.undefined
}

object ListFunctionsResponse {
  @scala.inline
  def apply(Functions: FunctionList = null, NextMarker: String = null): ListFunctionsResponse = {
    val __obj = js.Dynamic.literal()
    if (Functions != null) __obj.updateDynamic("Functions")(Functions)
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    __obj.asInstanceOf[ListFunctionsResponse]
  }
}

