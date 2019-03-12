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
    current: paginatedResultCallback[js.Any] => scala.Unit,
    errorCode: scala.Double,
    errorMessage: java.lang.String,
    first: paginatedResultCallback[js.Any] => scala.Unit,
    hasNext: () => scala.Boolean,
    headers: js.Any,
    isLast: () => scala.Boolean,
    items: js.Array[java.lang.String],
    next: paginatedResultCallback[js.Any] => scala.Unit,
    statusCode: scala.Double,
    success: scala.Boolean
  ): HttpPaginatedResponse = {
    val __obj = js.Dynamic.literal(current = js.Any.fromFunction1(current), errorCode = errorCode, errorMessage = errorMessage, first = js.Any.fromFunction1(first), hasNext = js.Any.fromFunction0(hasNext), headers = headers, isLast = js.Any.fromFunction0(isLast), items = items, next = js.Any.fromFunction1(next), statusCode = statusCode, success = success)
  
    __obj.asInstanceOf[HttpPaginatedResponse]
  }
}

