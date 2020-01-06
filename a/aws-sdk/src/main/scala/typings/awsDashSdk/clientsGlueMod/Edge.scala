package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Edge extends js.Object {
  /**
    * The unique of the node within the workflow where the edge ends.
    */
  var DestinationId: js.UndefOr[NameString] = js.native
  /**
    * The unique of the node within the workflow where the edge starts.
    */
  var SourceId: js.UndefOr[NameString] = js.native
}

object Edge {
  @scala.inline
  def apply(DestinationId: NameString = null, SourceId: NameString = null): Edge = {
    val __obj = js.Dynamic.literal()
    if (DestinationId != null) __obj.updateDynamic("DestinationId")(DestinationId.asInstanceOf[js.Any])
    if (SourceId != null) __obj.updateDynamic("SourceId")(SourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Edge]
  }
}

