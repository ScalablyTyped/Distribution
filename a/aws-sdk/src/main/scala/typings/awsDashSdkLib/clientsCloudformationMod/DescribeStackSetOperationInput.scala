package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStackSetOperationInput extends js.Object {
  /**
    * The unique ID of the stack set operation. 
    */
  var OperationId: ClientRequestToken
  /**
    * The name or the unique stack ID of the stack set for the stack operation.
    */
  var StackSetName: awsDashSdkLib.clientsCloudformationMod.StackSetName
}

object DescribeStackSetOperationInput {
  @scala.inline
  def apply(OperationId: ClientRequestToken, StackSetName: StackSetName): DescribeStackSetOperationInput = {
    val __obj = js.Dynamic.literal(OperationId = OperationId, StackSetName = StackSetName)
  
    __obj.asInstanceOf[DescribeStackSetOperationInput]
  }
}

