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

