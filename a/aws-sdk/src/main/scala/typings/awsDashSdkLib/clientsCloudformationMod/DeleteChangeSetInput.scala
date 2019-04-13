package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteChangeSetInput extends js.Object {
  /**
    * The name or Amazon Resource Name (ARN) of the change set that you want to delete.
    */
  var ChangeSetName: ChangeSetNameOrId
  /**
    * If you specified the name of a change set to delete, specify the stack name or ID (ARN) that is associated with it.
    */
  var StackName: js.UndefOr[StackNameOrId] = js.undefined
}

object DeleteChangeSetInput {
  @scala.inline
  def apply(ChangeSetName: ChangeSetNameOrId, StackName: StackNameOrId = null): DeleteChangeSetInput = {
    val __obj = js.Dynamic.literal(ChangeSetName = ChangeSetName)
    if (StackName != null) __obj.updateDynamic("StackName")(StackName)
    __obj.asInstanceOf[DeleteChangeSetInput]
  }
}

