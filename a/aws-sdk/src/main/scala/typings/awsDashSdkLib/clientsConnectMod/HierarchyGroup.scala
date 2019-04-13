package typings
package awsDashSdkLib.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HierarchyGroup extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the hierarchy group.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  /**
    * A HierarchyPath object that contains information about the levels in the hierarchy group.
    */
  var HierarchyPath: js.UndefOr[HierarchyPath] = js.undefined
  /**
    * The identifier for the hierarchy group.
    */
  var Id: js.UndefOr[HierarchyGroupId] = js.undefined
  /**
    * The identifier for the level in the hierarchy group.
    */
  var LevelId: js.UndefOr[HierarchyLevelId] = js.undefined
  /**
    * The name of the hierarchy group in your instance.
    */
  var Name: js.UndefOr[HierarchyGroupName] = js.undefined
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
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (HierarchyPath != null) __obj.updateDynamic("HierarchyPath")(HierarchyPath)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (LevelId != null) __obj.updateDynamic("LevelId")(LevelId)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[HierarchyGroup]
  }
}

