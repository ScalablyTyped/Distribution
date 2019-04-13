package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStackInstanceInput extends js.Object {
  /**
    * The ID of an AWS account that's associated with this stack instance.
    */
  var StackInstanceAccount: Account
  /**
    * The name of a region that's associated with this stack instance.
    */
  var StackInstanceRegion: Region
  /**
    * The name or the unique stack ID of the stack set that you want to get stack instance information for.
    */
  var StackSetName: awsDashSdkLib.clientsCloudformationMod.StackSetName
}

object DescribeStackInstanceInput {
  @scala.inline
  def apply(StackInstanceAccount: Account, StackInstanceRegion: Region, StackSetName: StackSetName): DescribeStackInstanceInput = {
    val __obj = js.Dynamic.literal(StackInstanceAccount = StackInstanceAccount, StackInstanceRegion = StackInstanceRegion, StackSetName = StackSetName)
  
    __obj.asInstanceOf[DescribeStackInstanceInput]
  }
}

