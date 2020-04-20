package typings.appleMapkitJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdaptive extends js.Object {
  /**
    * A constant indicating the measurement system is adaptive, and determined
    * based on the map's language.
    */
  val Adaptive: String
  /**
    * A constant indicating the measurement system is imperial.
    */
  val Imperial: String
  /**
    * A constant indicating the measurement system is metric.
    */
  val Metric: String
}

object AnonAdaptive {
  @scala.inline
  def apply(Adaptive: String, Imperial: String, Metric: String): AnonAdaptive = {
    val __obj = js.Dynamic.literal(Adaptive = Adaptive.asInstanceOf[js.Any], Imperial = Imperial.asInstanceOf[js.Any], Metric = Metric.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdaptive]
  }
}

