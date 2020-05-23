package typings.apolloEngineReportingProtobuf.protobufMod.Trace

import typings.apolloEngineReportingProtobuf.protobufMod.Trace.CachePolicy.Scope
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
  def apply(maxAgeNs: js.UndefOr[Null | Double] = js.undefined, scope: js.UndefOr[Null | Scope] = js.undefined): ICachePolicy = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxAgeNs)) __obj.updateDynamic("maxAgeNs")(maxAgeNs.asInstanceOf[js.Any])
    if (!js.isUndefined(scope)) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICachePolicy]
  }
}

