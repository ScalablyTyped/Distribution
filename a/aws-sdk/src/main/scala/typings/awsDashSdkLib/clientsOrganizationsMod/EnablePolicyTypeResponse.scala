package typings
package awsDashSdkLib.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnablePolicyTypeResponse extends js.Object {
  /**
    * A structure that shows the root with the updated list of enabled policy types.
    */
  var Root: js.UndefOr[Root] = js.undefined
}

object EnablePolicyTypeResponse {
  @scala.inline
  def apply(Root: Root = null): EnablePolicyTypeResponse = {
    val __obj = js.Dynamic.literal()
    if (Root != null) __obj.updateDynamic("Root")(Root)
    __obj.asInstanceOf[EnablePolicyTypeResponse]
  }
}

