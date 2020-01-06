package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentationPartIds extends js.Object {
  /**
    * A list of the returned documentation part identifiers.
    */
  var ids: js.UndefOr[ListOfString] = js.native
  /**
    * A list of warning messages reported during import of documentation parts.
    */
  var warnings: js.UndefOr[ListOfString] = js.native
}

object DocumentationPartIds {
  @scala.inline
  def apply(ids: ListOfString = null, warnings: ListOfString = null): DocumentationPartIds = {
    val __obj = js.Dynamic.literal()
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (warnings != null) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentationPartIds]
  }
}

