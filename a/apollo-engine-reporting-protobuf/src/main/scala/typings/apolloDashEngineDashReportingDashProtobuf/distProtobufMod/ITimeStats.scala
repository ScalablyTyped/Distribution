package typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimeStats extends js.Object {
  /** TimeStats realNsDelta */
  var realNsDelta: js.UndefOr[Double | Null] = js.undefined
  /** TimeStats sysNsDelta */
  var sysNsDelta: js.UndefOr[Double | Null] = js.undefined
  /** TimeStats uptimeNs */
  var uptimeNs: js.UndefOr[Double | Null] = js.undefined
  /** TimeStats userNsDelta */
  var userNsDelta: js.UndefOr[Double | Null] = js.undefined
}

object ITimeStats {
  @scala.inline
  def apply(
    realNsDelta: Int | Double = null,
    sysNsDelta: Int | Double = null,
    uptimeNs: Int | Double = null,
    userNsDelta: Int | Double = null
  ): ITimeStats = {
    val __obj = js.Dynamic.literal()
    if (realNsDelta != null) __obj.updateDynamic("realNsDelta")(realNsDelta.asInstanceOf[js.Any])
    if (sysNsDelta != null) __obj.updateDynamic("sysNsDelta")(sysNsDelta.asInstanceOf[js.Any])
    if (uptimeNs != null) __obj.updateDynamic("uptimeNs")(uptimeNs.asInstanceOf[js.Any])
    if (userNsDelta != null) __obj.updateDynamic("userNsDelta")(userNsDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimeStats]
  }
}

