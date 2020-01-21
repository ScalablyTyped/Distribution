package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTimeoutNumber extends js.Object {
  /**
    * a timeout value in milliseconds to wait before aborting the connection. Set to 0 for no timeout.
    */
  var timeout: Double = js.native
}

object AnonTimeoutNumber {
  @scala.inline
  def apply(timeout: Double): AnonTimeoutNumber = {
    val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTimeoutNumber]
  }
}

