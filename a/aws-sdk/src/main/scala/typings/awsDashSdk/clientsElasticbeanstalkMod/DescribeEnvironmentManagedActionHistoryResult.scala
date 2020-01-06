package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEnvironmentManagedActionHistoryResult extends js.Object {
  /**
    * A list of completed and failed managed actions.
    */
  var ManagedActionHistoryItems: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.ManagedActionHistoryItems] = js.native
  /**
    * A pagination token that you pass to DescribeEnvironmentManagedActionHistory to get the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeEnvironmentManagedActionHistoryResult {
  @scala.inline
  def apply(ManagedActionHistoryItems: ManagedActionHistoryItems = null, NextToken: String = null): DescribeEnvironmentManagedActionHistoryResult = {
    val __obj = js.Dynamic.literal()
    if (ManagedActionHistoryItems != null) __obj.updateDynamic("ManagedActionHistoryItems")(ManagedActionHistoryItems.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEnvironmentManagedActionHistoryResult]
  }
}

