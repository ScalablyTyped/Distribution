package typings.awsLambda

import typings.awsLambda.awsLambdaStrings.`viewer-request`
import typings.awsLambda.awsLambdaStrings.`viewer-response`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRequestId extends js.Object {
  val eventType: `viewer-request` | `viewer-response`
  val requestId: String
}

object AnonRequestId {
  @scala.inline
  def apply(eventType: `viewer-request` | `viewer-response`, requestId: String): AnonRequestId = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRequestId]
  }
}

