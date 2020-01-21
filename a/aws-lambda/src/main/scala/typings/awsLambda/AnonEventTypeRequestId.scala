package typings.awsLambda

import typings.awsLambda.awsLambdaStrings.`viewer-request`
import typings.awsLambda.awsLambdaStrings.`viewer-response`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventTypeRequestId extends js.Object {
  val eventType: `viewer-request` | `viewer-response`
  val requestId: String
}

object AnonEventTypeRequestId {
  @scala.inline
  def apply(eventType: `viewer-request` | `viewer-response`, requestId: String): AnonEventTypeRequestId = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEventTypeRequestId]
  }
}

