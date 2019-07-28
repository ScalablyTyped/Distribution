package typings.applicationinsights

import typings.applicationinsights.outLibraryTraceparentMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: String
  var name: String
  var parentId: String
  var traceparent: js.UndefOr[^] = js.undefined
  var tracestate: js.UndefOr[typings.applicationinsights.outLibraryTracestateMod.^] = js.undefined
}

object Anon_Id {
  @scala.inline
  def apply(
    id: String,
    name: String,
    parentId: String,
    traceparent: ^ = null,
    tracestate: typings.applicationinsights.outLibraryTracestateMod.^ = null
  ): Anon_Id = {
    val __obj = js.Dynamic.literal(id = id, name = name, parentId = parentId)
    if (traceparent != null) __obj.updateDynamic("traceparent")(traceparent)
    if (tracestate != null) __obj.updateDynamic("tracestate")(tracestate)
    __obj.asInstanceOf[Anon_Id]
  }
}

