package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Timeout extends js.Object {
  /**
    * debounce timeout
    */
  var timeout: Double
}

object Anon_Timeout {
  @scala.inline
  def apply(timeout: Double): Anon_Timeout = {
    val __obj = js.Dynamic.literal(timeout = timeout)
  
    __obj.asInstanceOf[Anon_Timeout]
  }
}

