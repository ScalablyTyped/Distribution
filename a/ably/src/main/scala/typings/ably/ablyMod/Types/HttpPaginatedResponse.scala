package typings.ably.ablyMod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpPaginatedResponse
  extends PaginatedResult[js.Any] {
  var errorCode: Double
  var errorMessage: String
  var headers: js.Any
  @JSName("items")
  var items_HttpPaginatedResponse: js.Array[String]
  var statusCode: Double
  var success: Boolean
}

object HttpPaginatedResponse {
  @scala.inline
  def apply(
    current: paginatedResultCallback[js.Any] => Unit,
    errorCode: Double,
    errorMessage: String,
    first: paginatedResultCallback[js.Any] => Unit,
    hasNext: () => Boolean,
    headers: js.Any,
    isLast: () => Boolean,
    items: js.Array[String],
    next: paginatedResultCallback[js.Any] => Unit,
    statusCode: Double,
    success: Boolean
  ): HttpPaginatedResponse = {
    val __obj = js.Dynamic.literal(current = js.Any.fromFunction1(current), errorCode = errorCode.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], first = js.Any.fromFunction1(first), hasNext = js.Any.fromFunction0(hasNext), headers = headers.asInstanceOf[js.Any], isLast = js.Any.fromFunction0(isLast), items = items.asInstanceOf[js.Any], next = js.Any.fromFunction1(next), statusCode = statusCode.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HttpPaginatedResponse]
  }
}

