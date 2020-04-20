package typings.algoliaRequesterCommon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  /**
    * The raw response from the server.
    */
  val content: String
  /**
    * If the request timeouted.
    */
  val isTimedOut: Boolean
  /**
    * The http status code.
    */
  val status: Double
}

object Response {
  @scala.inline
  def apply(content: String, isTimedOut: Boolean, status: Double): Response = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], isTimedOut = isTimedOut.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

