package typings.appleMapkitJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Adaptive extends js.Object {
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

object Adaptive {
  @scala.inline
  def apply(Adaptive: String, Imperial: String, Metric: String): Adaptive = {
    val __obj = js.Dynamic.literal(Adaptive = Adaptive.asInstanceOf[js.Any], Imperial = Imperial.asInstanceOf[js.Any], Metric = Metric.asInstanceOf[js.Any])
    __obj.asInstanceOf[Adaptive]
  }
}

