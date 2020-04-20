package typings.apolloTracing.mod

import typings.apolloTracing.AnonResolvers
import typings.apolloTracing.apolloTracingNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TracingFormat extends js.Object {
  var duration: Double
  var endTime: String
  var execution: AnonResolvers
  var startTime: String
  var version: `1`
}

object TracingFormat {
  @scala.inline
  def apply(duration: Double, endTime: String, execution: AnonResolvers, startTime: String, version: `1`): TracingFormat = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], execution = execution.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[TracingFormat]
  }
}

