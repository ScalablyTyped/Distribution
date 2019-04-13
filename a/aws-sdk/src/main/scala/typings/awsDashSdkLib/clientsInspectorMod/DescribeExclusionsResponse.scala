package typings
package awsDashSdkLib.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeExclusionsResponse extends js.Object {
  /**
    * Information about the exclusions.
    */
  var exclusions: ExclusionMap
  /**
    * Exclusion details that cannot be described. An error code is provided for each failed item.
    */
  var failedItems: FailedItems
}

object DescribeExclusionsResponse {
  @scala.inline
  def apply(exclusions: ExclusionMap, failedItems: FailedItems): DescribeExclusionsResponse = {
    val __obj = js.Dynamic.literal(exclusions = exclusions, failedItems = failedItems)
  
    __obj.asInstanceOf[DescribeExclusionsResponse]
  }
}

