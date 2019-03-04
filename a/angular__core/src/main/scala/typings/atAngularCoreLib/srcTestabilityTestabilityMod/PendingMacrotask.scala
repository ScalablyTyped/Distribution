package typings
package atAngularCoreLib.srcTestabilityTestabilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PendingMacrotask extends js.Object {
  var creationLocation: nodeLib.Error
  var data: TaskData
  var runCount: js.UndefOr[scala.Double] = js.undefined
  var source: java.lang.String
}

object PendingMacrotask {
  @scala.inline
  def apply(
    creationLocation: nodeLib.Error,
    data: TaskData,
    source: java.lang.String,
    runCount: scala.Int | scala.Double = null
  ): PendingMacrotask = {
    val __obj = js.Dynamic.literal(creationLocation = creationLocation, data = data, source = source)
    if (runCount != null) __obj.updateDynamic("runCount")(runCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[PendingMacrotask]
  }
}

