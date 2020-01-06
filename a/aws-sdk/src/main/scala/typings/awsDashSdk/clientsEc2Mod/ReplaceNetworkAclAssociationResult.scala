package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplaceNetworkAclAssociationResult extends js.Object {
  /**
    * The ID of the new association.
    */
  var NewAssociationId: js.UndefOr[String] = js.native
}

object ReplaceNetworkAclAssociationResult {
  @scala.inline
  def apply(NewAssociationId: String = null): ReplaceNetworkAclAssociationResult = {
    val __obj = js.Dynamic.literal()
    if (NewAssociationId != null) __obj.updateDynamic("NewAssociationId")(NewAssociationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceNetworkAclAssociationResult]
  }
}

