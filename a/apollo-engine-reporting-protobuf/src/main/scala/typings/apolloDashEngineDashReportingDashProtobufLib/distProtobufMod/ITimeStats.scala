package typings
package apolloDashEngineDashReportingDashProtobufLib.distProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimeStats extends js.Object {
  /** TimeStats realNsDelta */
  var realNsDelta: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /** TimeStats sysNsDelta */
  var sysNsDelta: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /** TimeStats uptimeNs */
  var uptimeNs: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /** TimeStats userNsDelta */
  var userNsDelta: js.UndefOr[scala.Double | scala.Null] = js.undefined
}

object ITimeStats {
  @scala.inline
  def apply(
    realNsDelta: scala.Int | scala.Double = null,
    sysNsDelta: scala.Int | scala.Double = null,
    uptimeNs: scala.Int | scala.Double = null,
    userNsDelta: scala.Int | scala.Double = null
  ): ITimeStats = {
    val __obj = js.Dynamic.literal()
    if (realNsDelta != null) __obj.updateDynamic("realNsDelta")(realNsDelta.asInstanceOf[js.Any])
    if (sysNsDelta != null) __obj.updateDynamic("sysNsDelta")(sysNsDelta.asInstanceOf[js.Any])
    if (uptimeNs != null) __obj.updateDynamic("uptimeNs")(uptimeNs.asInstanceOf[js.Any])
    if (userNsDelta != null) __obj.updateDynamic("userNsDelta")(userNsDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimeStats]
  }
}

