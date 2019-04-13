package typings
package awsDashSdkLib.clientsGlobalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeListenerResponse extends js.Object {
  /**
    * The description of a listener.
    */
  var Listener: js.UndefOr[Listener] = js.undefined
}

object DescribeListenerResponse {
  @scala.inline
  def apply(Listener: Listener = null): DescribeListenerResponse = {
    val __obj = js.Dynamic.literal()
    if (Listener != null) __obj.updateDynamic("Listener")(Listener)
    __obj.asInstanceOf[DescribeListenerResponse]
  }
}

