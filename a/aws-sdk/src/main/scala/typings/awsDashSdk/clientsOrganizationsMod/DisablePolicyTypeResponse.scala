package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisablePolicyTypeResponse extends js.Object {
  /**
    * A structure that shows the root with the updated list of enabled policy types.
    */
  var Root: js.UndefOr[typings.awsDashSdk.clientsOrganizationsMod.Root] = js.undefined
}

object DisablePolicyTypeResponse {
  @scala.inline
  def apply(Root: Root = null): DisablePolicyTypeResponse = {
    val __obj = js.Dynamic.literal()
    if (Root != null) __obj.updateDynamic("Root")(Root)
    __obj.asInstanceOf[DisablePolicyTypeResponse]
  }
}

