package typings.awsDashLambda

import typings.awsDashLambda.awsDashLambdaStrings.`origin-request`
import typings.awsDashLambda.awsDashLambdaStrings.`origin-response`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventType extends js.Object {
  val eventType: `origin-request` | `origin-response`
}

object Anon_EventType {
  @scala.inline
  def apply(eventType: `origin-request` | `origin-response`): Anon_EventType = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_EventType]
  }
}

