package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TimeoutNumber extends js.Object {
  /**
    * a timeout value in milliseconds to wait before aborting the connection. Set to 0 for no timeout.
    */
  var timeout: scala.Double
}

object Anon_TimeoutNumber {
  @scala.inline
  def apply(timeout: scala.Double): Anon_TimeoutNumber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("timeout")(timeout)
    __obj.asInstanceOf[Anon_TimeoutNumber]
  }
}

