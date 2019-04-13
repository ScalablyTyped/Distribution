package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectStackDriftInput extends js.Object {
  /**
    * The logical names of any resources you want to use as filters.
    */
  var LogicalResourceIds: js.UndefOr[LogicalResourceIds] = js.undefined
  /**
    * The name of the stack for which you want to detect drift. 
    */
  var StackName: StackNameOrId
}

object DetectStackDriftInput {
  @scala.inline
  def apply(StackName: StackNameOrId, LogicalResourceIds: LogicalResourceIds = null): DetectStackDriftInput = {
    val __obj = js.Dynamic.literal(StackName = StackName)
    if (LogicalResourceIds != null) __obj.updateDynamic("LogicalResourceIds")(LogicalResourceIds)
    __obj.asInstanceOf[DetectStackDriftInput]
  }
}

