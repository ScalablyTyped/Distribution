package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationNode extends js.Object {
  /**
    * The organization node type.
    */
  var Type: js.UndefOr[OrganizationNodeType] = js.native
  /**
    * The identifier of the organization node.
    */
  var Value: js.UndefOr[OrganizationNodeValue] = js.native
}

object OrganizationNode {
  @scala.inline
  def apply(Type: OrganizationNodeType = null, Value: OrganizationNodeValue = null): OrganizationNode = {
    val __obj = js.Dynamic.literal()
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationNode]
  }
}

