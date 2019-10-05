package typings.apolloDashTracing.apolloDashTracingMod

import typings.apolloDashTracing.Anon_Resolvers
import typings.apolloDashTracing.apolloDashTracingNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TracingFormat extends js.Object {
  var duration: Double
  var endTime: String
  var execution: Anon_Resolvers
  var startTime: String
  var version: `1`
}

object TracingFormat {
  @scala.inline
  def apply(duration: Double, endTime: String, execution: Anon_Resolvers, startTime: String, version: `1`): TracingFormat = {
    val __obj = js.Dynamic.literal(duration = duration, endTime = endTime, execution = execution, startTime = startTime, version = version)
  
    __obj.asInstanceOf[TracingFormat]
  }
}

