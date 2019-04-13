package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEnvironmentManagedActionHistoryResult extends js.Object {
  /**
    * A list of completed and failed managed actions.
    */
  var ManagedActionHistoryItems: js.UndefOr[ManagedActionHistoryItems] = js.undefined
  /**
    * A pagination token that you pass to DescribeEnvironmentManagedActionHistory to get the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeEnvironmentManagedActionHistoryResult {
  @scala.inline
  def apply(ManagedActionHistoryItems: ManagedActionHistoryItems = null, NextToken: String = null): DescribeEnvironmentManagedActionHistoryResult = {
    val __obj = js.Dynamic.literal()
    if (ManagedActionHistoryItems != null) __obj.updateDynamic("ManagedActionHistoryItems")(ManagedActionHistoryItems)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeEnvironmentManagedActionHistoryResult]
  }
}

