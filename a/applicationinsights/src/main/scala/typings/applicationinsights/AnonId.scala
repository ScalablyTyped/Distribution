package typings.applicationinsights

import typings.applicationinsights.traceparentMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonId extends js.Object {
  var id: String
  var name: String
  var parentId: String
  var traceparent: js.UndefOr[^] = js.undefined
  var tracestate: js.UndefOr[typings.applicationinsights.tracestateMod.^] = js.undefined
}

object AnonId {
  @scala.inline
  def apply(
    id: String,
    name: String,
    parentId: String,
    traceparent: ^ = null,
    tracestate: typings.applicationinsights.tracestateMod.^ = null
  ): AnonId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any])
    if (traceparent != null) __obj.updateDynamic("traceparent")(traceparent.asInstanceOf[js.Any])
    if (tracestate != null) __obj.updateDynamic("tracestate")(tracestate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonId]
  }
}

