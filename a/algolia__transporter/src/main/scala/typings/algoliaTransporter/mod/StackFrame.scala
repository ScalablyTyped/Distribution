package typings.algoliaTransporter.mod

import typings.algoliaRequesterCommon.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackFrame extends js.Object {
  /**
    * The host associated with the `request` and the `response`.
    */
  val host: StatelessHost
  /**
    * The request made.
    */
  val request: typings.algoliaRequesterCommon.mod.Request
  /**
    * The received response.
    */
  val response: Response
  /**
    * The number of tries left.
    */
  val triesLeft: Double
}

object StackFrame {
  @scala.inline
  def apply(
    host: StatelessHost,
    request: typings.algoliaRequesterCommon.mod.Request,
    response: Response,
    triesLeft: Double
  ): StackFrame = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], triesLeft = triesLeft.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StackFrame]
  }
}

