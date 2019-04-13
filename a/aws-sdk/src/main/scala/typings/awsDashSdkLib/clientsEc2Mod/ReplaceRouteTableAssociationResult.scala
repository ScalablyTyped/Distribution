package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceRouteTableAssociationResult extends js.Object {
  /**
    * The ID of the new association.
    */
  var NewAssociationId: js.UndefOr[String] = js.undefined
}

object ReplaceRouteTableAssociationResult {
  @scala.inline
  def apply(NewAssociationId: String = null): ReplaceRouteTableAssociationResult = {
    val __obj = js.Dynamic.literal()
    if (NewAssociationId != null) __obj.updateDynamic("NewAssociationId")(NewAssociationId)
    __obj.asInstanceOf[ReplaceRouteTableAssociationResult]
  }
}

