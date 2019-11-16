package typings.awsDashLambda

import typings.awsDashLambda.awsDashLambdaStrings.`viewer-request`
import typings.awsDashLambda.awsDashLambdaStrings.`viewer-response`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventTypeRequestId extends js.Object {
  val eventType: `viewer-request` | `viewer-response`
  val requestId: String
}

object Anon_EventTypeRequestId {
  @scala.inline
  def apply(eventType: `viewer-request` | `viewer-response`, requestId: String): Anon_EventTypeRequestId = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], requestId = requestId)
  
    __obj.asInstanceOf[Anon_EventTypeRequestId]
  }
}

