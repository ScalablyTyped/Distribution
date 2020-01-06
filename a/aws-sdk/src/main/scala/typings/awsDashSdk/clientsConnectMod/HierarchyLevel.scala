package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HierarchyLevel extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the hierarchy level.
    */
  var Arn: js.UndefOr[ARN] = js.native
  /**
    * The identifier of the hierarchy level.
    */
  var Id: js.UndefOr[HierarchyLevelId] = js.native
  /**
    * The name of the hierarchy level.
    */
  var Name: js.UndefOr[HierarchyLevelName] = js.native
}

object HierarchyLevel {
  @scala.inline
  def apply(Arn: ARN = null, Id: HierarchyLevelId = null, Name: HierarchyLevelName = null): HierarchyLevel = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HierarchyLevel]
  }
}

