package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpPaginatedResponse
  extends PaginatedResult[js.Any] {
  var errorCode: Double = js.native
  var errorMessage: String = js.native
  var headers: js.Any = js.native
  @JSName("items")
  var items_HttpPaginatedResponse: js.Array[String] = js.native
  var statusCode: Double = js.native
  var success: Boolean = js.native
}

