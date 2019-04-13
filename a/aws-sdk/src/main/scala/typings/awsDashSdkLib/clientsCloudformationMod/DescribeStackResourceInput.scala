package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStackResourceInput extends js.Object {
  /**
    * The logical name of the resource as specified in the template. Default: There is no default value.
    */
  var LogicalResourceId: awsDashSdkLib.clientsCloudformationMod.LogicalResourceId
  /**
    * The name or the unique stack ID that is associated with the stack, which are not always interchangeable:   Running stacks: You can specify either the stack's name or its unique stack ID.   Deleted stacks: You must specify the unique stack ID.   Default: There is no default value.
    */
  var StackName: awsDashSdkLib.clientsCloudformationMod.StackName
}

object DescribeStackResourceInput {
  @scala.inline
  def apply(LogicalResourceId: LogicalResourceId, StackName: StackName): DescribeStackResourceInput = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId, StackName = StackName)
  
    __obj.asInstanceOf[DescribeStackResourceInput]
  }
}

