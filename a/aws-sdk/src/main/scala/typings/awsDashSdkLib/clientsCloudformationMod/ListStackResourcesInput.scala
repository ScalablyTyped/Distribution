package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListStackResourcesInput extends js.Object {
  /**
    * A string that identifies the next page of stack resources that you want to retrieve.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The name or the unique stack ID that is associated with the stack, which are not always interchangeable:   Running stacks: You can specify either the stack's name or its unique stack ID.   Deleted stacks: You must specify the unique stack ID.   Default: There is no default value.
    */
  var StackName: awsDashSdkLib.clientsCloudformationMod.StackName
}

object ListStackResourcesInput {
  @scala.inline
  def apply(StackName: StackName, NextToken: NextToken = null): ListStackResourcesInput = {
    val __obj = js.Dynamic.literal(StackName = StackName)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListStackResourcesInput]
  }
}

