package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectStackResourceDriftInput extends js.Object {
  /**
    * The logical name of the resource for which to return drift information.
    */
  var LogicalResourceId: awsDashSdkLib.clientsCloudformationMod.LogicalResourceId
  /**
    * The name of the stack to which the resource belongs.
    */
  var StackName: StackNameOrId
}

object DetectStackResourceDriftInput {
  @scala.inline
  def apply(LogicalResourceId: LogicalResourceId, StackName: StackNameOrId): DetectStackResourceDriftInput = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId, StackName = StackName)
  
    __obj.asInstanceOf[DetectStackResourceDriftInput]
  }
}

