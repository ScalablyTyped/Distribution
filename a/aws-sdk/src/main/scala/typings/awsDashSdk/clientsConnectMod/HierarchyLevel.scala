package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HierarchyLevel extends js.Object {
  /**
    * The ARN for the hierarchy group level.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  /**
    * The identifier for the hierarchy group level.
    */
  var Id: js.UndefOr[HierarchyLevelId] = js.undefined
  /**
    * The name of the hierarchy group level.
    */
  var Name: js.UndefOr[HierarchyLevelName] = js.undefined
}

object HierarchyLevel {
  @scala.inline
  def apply(Arn: ARN = null, Id: HierarchyLevelId = null, Name: HierarchyLevelName = null): HierarchyLevel = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[HierarchyLevel]
  }
}

