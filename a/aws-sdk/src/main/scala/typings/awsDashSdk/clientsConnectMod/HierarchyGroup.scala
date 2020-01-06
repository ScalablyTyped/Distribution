package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HierarchyGroup extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the hierarchy group.
    */
  var Arn: js.UndefOr[ARN] = js.native
  /**
    * Information about the levels in the hierarchy group.
    */
  var HierarchyPath: js.UndefOr[typings.awsDashSdk.clientsConnectMod.HierarchyPath] = js.native
  /**
    * The identifier of the hierarchy group.
    */
  var Id: js.UndefOr[HierarchyGroupId] = js.native
  /**
    * The identifier of the level in the hierarchy group.
    */
  var LevelId: js.UndefOr[HierarchyLevelId] = js.native
  /**
    * The name of the hierarchy group.
    */
  var Name: js.UndefOr[HierarchyGroupName] = js.native
}

object HierarchyGroup {
  @scala.inline
  def apply(
    Arn: ARN = null,
    HierarchyPath: HierarchyPath = null,
    Id: HierarchyGroupId = null,
    LevelId: HierarchyLevelId = null,
    Name: HierarchyGroupName = null
  ): HierarchyGroup = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (HierarchyPath != null) __obj.updateDynamic("HierarchyPath")(HierarchyPath.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (LevelId != null) __obj.updateDynamic("LevelId")(LevelId.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HierarchyGroup]
  }
}

