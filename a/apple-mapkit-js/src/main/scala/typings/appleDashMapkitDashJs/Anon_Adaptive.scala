package typings.appleDashMapkitDashJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Adaptive extends js.Object {
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

object Anon_Adaptive {
  @scala.inline
  def apply(Adaptive: String, Imperial: String, Metric: String): Anon_Adaptive = {
    val __obj = js.Dynamic.literal(Adaptive = Adaptive, Imperial = Imperial, Metric = Metric)
  
    __obj.asInstanceOf[Anon_Adaptive]
  }
}

