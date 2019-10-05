package typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace

import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.CachePolicy.Scope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a CachePolicy. */
trait ICachePolicy extends js.Object {
  /** CachePolicy maxAgeNs */
  var maxAgeNs: js.UndefOr[Double | Null] = js.undefined
  /** CachePolicy scope */
  var scope: js.UndefOr[Scope | Null] = js.undefined
}

object ICachePolicy {
  @scala.inline
  def apply(maxAgeNs: Int | Double = null, scope: Scope = null): ICachePolicy = {
    val __obj = js.Dynamic.literal()
    if (maxAgeNs != null) __obj.updateDynamic("maxAgeNs")(maxAgeNs.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[ICachePolicy]
  }
}

