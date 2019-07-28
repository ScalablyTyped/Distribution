package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrganizationNode extends js.Object {
  /**
    * The organization node type.
    */
  var Type: js.UndefOr[OrganizationNodeType] = js.undefined
  /**
    * The identifier of the organization node.
    */
  var Value: js.UndefOr[OrganizationNodeValue] = js.undefined
}

object OrganizationNode {
  @scala.inline
  def apply(Type: OrganizationNodeType = null, Value: OrganizationNodeValue = null): OrganizationNode = {
    val __obj = js.Dynamic.literal()
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[OrganizationNode]
  }
}

