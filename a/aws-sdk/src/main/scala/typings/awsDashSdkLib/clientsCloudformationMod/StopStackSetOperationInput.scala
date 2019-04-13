package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopStackSetOperationInput extends js.Object {
  /**
    * The ID of the stack operation. 
    */
  var OperationId: ClientRequestToken
  /**
    * The name or unique ID of the stack set that you want to stop the operation for.
    */
  var StackSetName: awsDashSdkLib.clientsCloudformationMod.StackSetName
}

object StopStackSetOperationInput {
  @scala.inline
  def apply(OperationId: ClientRequestToken, StackSetName: StackSetName): StopStackSetOperationInput = {
    val __obj = js.Dynamic.literal(OperationId = OperationId, StackSetName = StackSetName)
  
    __obj.asInstanceOf[StopStackSetOperationInput]
  }
}

