package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Edge extends js.Object {
  /**
    * The unique of the node within the workflow where the edge ends.
    */
  var DestinationId: js.UndefOr[NameString] = js.undefined
  /**
    * The unique of the node within the workflow where the edge starts.
    */
  var SourceId: js.UndefOr[NameString] = js.undefined
}

object Edge {
  @scala.inline
  def apply(DestinationId: NameString = null, SourceId: NameString = null): Edge = {
    val __obj = js.Dynamic.literal()
    if (DestinationId != null) __obj.updateDynamic("DestinationId")(DestinationId)
    if (SourceId != null) __obj.updateDynamic("SourceId")(SourceId)
    __obj.asInstanceOf[Edge]
  }
}

