package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventSource extends js.Object {
  var applicationName: String
  var eventSource: String | js.Array[String]
}

object EventSource {
  @scala.inline
  def apply(applicationName: String, eventSource: String | js.Array[String]): EventSource = {
    val __obj = js.Dynamic.literal(applicationName = applicationName.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSource]
  }
}

