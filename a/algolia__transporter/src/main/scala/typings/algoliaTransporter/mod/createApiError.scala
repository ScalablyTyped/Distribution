package typings.algoliaTransporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/transporter", "createApiError")
@js.native
object createApiError extends js.Object {
  def apply(message: String, status: Double, transporterStackTrace: js.Array[StackFrame]): ApiError = js.native
}

