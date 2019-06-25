package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeListenersOutput extends js.Object {
  /**
    * Information about the listeners.
    */
  var Listeners: js.UndefOr[Listeners] = js.undefined
  /**
    * If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
    */
  var NextMarker: js.UndefOr[Marker] = js.undefined
}

object DescribeListenersOutput {
  @scala.inline
  def apply(Listeners: Listeners = null, NextMarker: Marker = null): DescribeListenersOutput = {
    val __obj = js.Dynamic.literal()
    if (Listeners != null) __obj.updateDynamic("Listeners")(Listeners)
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    __obj.asInstanceOf[DescribeListenersOutput]
  }
}

