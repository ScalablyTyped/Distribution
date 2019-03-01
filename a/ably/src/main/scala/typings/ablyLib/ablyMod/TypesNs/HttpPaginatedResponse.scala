package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpPaginatedResponse
  extends PaginatedResult[js.Any] {
  var errorCode: scala.Double
  var errorMessage: java.lang.String
  var headers: js.Any
  @JSName("items")
  var items_HttpPaginatedResponse: js.Array[java.lang.String]
  var statusCode: scala.Double
  var success: scala.Boolean
}

object HttpPaginatedResponse {
  @scala.inline
  def apply(
    current: js.Function1[paginatedResultCallback[js.Any], scala.Unit],
    errorCode: scala.Double,
    errorMessage: java.lang.String,
    first: js.Function1[paginatedResultCallback[js.Any], scala.Unit],
    hasNext: js.Function0[scala.Boolean],
    headers: js.Any,
    isLast: js.Function0[scala.Boolean],
    items: js.Array[java.lang.String],
    next: js.Function1[paginatedResultCallback[js.Any], scala.Unit],
    statusCode: scala.Double,
    success: scala.Boolean
  ): HttpPaginatedResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("current")(current)
    __obj.updateDynamic("errorCode")(errorCode)
    __obj.updateDynamic("errorMessage")(errorMessage)
    __obj.updateDynamic("first")(first)
    __obj.updateDynamic("hasNext")(hasNext)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("isLast")(isLast)
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("next")(next)
    __obj.updateDynamic("statusCode")(statusCode)
    __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[HttpPaginatedResponse]
  }
}

