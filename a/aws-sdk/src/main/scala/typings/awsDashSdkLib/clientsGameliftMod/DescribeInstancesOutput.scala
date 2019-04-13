package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeInstancesOutput extends js.Object {
  /**
    * Collection of objects containing properties for each instance returned.
    */
  var Instances: js.UndefOr[InstanceList] = js.undefined
  /**
    * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
}

object DescribeInstancesOutput {
  @scala.inline
  def apply(Instances: InstanceList = null, NextToken: NonZeroAndMaxString = null): DescribeInstancesOutput = {
    val __obj = js.Dynamic.literal()
    if (Instances != null) __obj.updateDynamic("Instances")(Instances)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeInstancesOutput]
  }
}

