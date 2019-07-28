package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the group.
    */
  var Arn: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.Arn] = js.undefined
  /**
    * The group description.
    */
  var Description: js.UndefOr[GroupDescription] = js.undefined
  /**
    * The name of the group.
    */
  var GroupName: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.GroupName] = js.undefined
  /**
    * The principal ID of the group.
    */
  var PrincipalId: js.UndefOr[String] = js.undefined
}

object Group {
  @scala.inline
  def apply(
    Arn: Arn = null,
    Description: GroupDescription = null,
    GroupName: GroupName = null,
    PrincipalId: String = null
  ): Group = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName)
    if (PrincipalId != null) __obj.updateDynamic("PrincipalId")(PrincipalId)
    __obj.asInstanceOf[Group]
  }
}

