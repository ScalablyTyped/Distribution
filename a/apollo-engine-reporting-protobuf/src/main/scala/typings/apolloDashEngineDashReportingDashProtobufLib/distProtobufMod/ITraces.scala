package typings
package apolloDashEngineDashReportingDashProtobufLib.distProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITraces extends js.Object {
  /** Traces trace */
  var trace: js.UndefOr[js.Array[ITrace] | scala.Null] = js.undefined
}

object ITraces {
  @scala.inline
  def apply(trace: js.Array[ITrace] = null): ITraces = {
    val __obj = js.Dynamic.literal()
    if (trace != null) __obj.updateDynamic("trace")(trace)
    __obj.asInstanceOf[ITraces]
  }
}

