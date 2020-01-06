package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnablePolicyTypeResponse extends js.Object {
  /**
    * A structure that shows the root with the updated list of enabled policy types.
    */
  var Root: js.UndefOr[typings.awsDashSdk.clientsOrganizationsMod.Root] = js.native
}

object EnablePolicyTypeResponse {
  @scala.inline
  def apply(Root: Root = null): EnablePolicyTypeResponse = {
    val __obj = js.Dynamic.literal()
    if (Root != null) __obj.updateDynamic("Root")(Root.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnablePolicyTypeResponse]
  }
}

