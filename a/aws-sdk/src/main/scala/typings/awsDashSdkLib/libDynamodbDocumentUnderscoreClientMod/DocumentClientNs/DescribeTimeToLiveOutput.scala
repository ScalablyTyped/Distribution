package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTimeToLiveOutput extends js.Object {
  /**
    * 
    */
  var TimeToLiveDescription: js.UndefOr[TimeToLiveDescription] = js.undefined
}

object DescribeTimeToLiveOutput {
  @scala.inline
  def apply(TimeToLiveDescription: TimeToLiveDescription = null): DescribeTimeToLiveOutput = {
    val __obj = js.Dynamic.literal()
    if (TimeToLiveDescription != null) __obj.updateDynamic("TimeToLiveDescription")(TimeToLiveDescription)
    __obj.asInstanceOf[DescribeTimeToLiveOutput]
  }
}

