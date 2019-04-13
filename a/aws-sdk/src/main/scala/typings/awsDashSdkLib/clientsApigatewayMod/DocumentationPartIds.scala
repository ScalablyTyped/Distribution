package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentationPartIds extends js.Object {
  /**
    * A list of the returned documentation part identifiers.
    */
  var ids: js.UndefOr[ListOfString] = js.undefined
  /**
    * A list of warning messages reported during import of documentation parts.
    */
  var warnings: js.UndefOr[ListOfString] = js.undefined
}

object DocumentationPartIds {
  @scala.inline
  def apply(ids: ListOfString = null, warnings: ListOfString = null): DocumentationPartIds = {
    val __obj = js.Dynamic.literal()
    if (ids != null) __obj.updateDynamic("ids")(ids)
    if (warnings != null) __obj.updateDynamic("warnings")(warnings)
    __obj.asInstanceOf[DocumentationPartIds]
  }
}

