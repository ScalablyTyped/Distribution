package typings.applicationinsightsJs.Microsoft.ApplicationInsights.Context

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISample extends js.Object {
  /**
    * Sample rate
    */
  var sampleRate: Double
}

object ISample {
  @scala.inline
  def apply(sampleRate: Double): ISample = {
    val __obj = js.Dynamic.literal(sampleRate = sampleRate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISample]
  }
}

