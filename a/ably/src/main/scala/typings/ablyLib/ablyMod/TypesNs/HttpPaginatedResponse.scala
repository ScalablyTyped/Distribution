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
    val __obj = js.Dynamic.literal(current = current, errorCode = errorCode, errorMessage = errorMessage, first = first, hasNext = hasNext, headers = headers, isLast = isLast, items = items, next = next, statusCode = statusCode, success = success)
  
    __obj.asInstanceOf[HttpPaginatedResponse]
  }
}

