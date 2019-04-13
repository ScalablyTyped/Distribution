package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStackSetInput extends js.Object {
  /**
    * The name or unique ID of the stack set whose description you want.
    */
  var StackSetName: awsDashSdkLib.clientsCloudformationMod.StackSetName
}

object DescribeStackSetInput {
  @scala.inline
  def apply(StackSetName: StackSetName): DescribeStackSetInput = {
    val __obj = js.Dynamic.literal(StackSetName = StackSetName)
  
    __obj.asInstanceOf[DescribeStackSetInput]
  }
}

