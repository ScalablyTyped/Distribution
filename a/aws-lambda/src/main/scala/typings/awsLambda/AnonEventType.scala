package typings.awsLambda

import typings.awsLambda.awsLambdaStrings.`origin-request`
import typings.awsLambda.awsLambdaStrings.`origin-response`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventType extends js.Object {
  val eventType: `origin-request` | `origin-response`
}

object AnonEventType {
  @scala.inline
  def apply(eventType: `origin-request` | `origin-response`): AnonEventType = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEventType]
  }
}

