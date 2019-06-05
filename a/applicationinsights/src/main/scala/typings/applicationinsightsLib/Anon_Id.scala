package typings
package applicationinsightsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: java.lang.String
  var name: java.lang.String
  var parentId: java.lang.String
  var traceparent: js.UndefOr[applicationinsightsLib.outLibraryTraceparentMod.^] = js.undefined
  var tracestate: js.UndefOr[applicationinsightsLib.outLibraryTracestateMod.^] = js.undefined
}

object Anon_Id {
  @scala.inline
  def apply(
    id: java.lang.String,
    name: java.lang.String,
    parentId: java.lang.String,
    traceparent: applicationinsightsLib.outLibraryTraceparentMod.^ = null,
    tracestate: applicationinsightsLib.outLibraryTracestateMod.^ = null
  ): Anon_Id = {
    val __obj = js.Dynamic.literal(id = id, name = name, parentId = parentId)
    if (traceparent != null) __obj.updateDynamic("traceparent")(traceparent)
    if (tracestate != null) __obj.updateDynamic("tracestate")(tracestate)
    __obj.asInstanceOf[Anon_Id]
  }
}

