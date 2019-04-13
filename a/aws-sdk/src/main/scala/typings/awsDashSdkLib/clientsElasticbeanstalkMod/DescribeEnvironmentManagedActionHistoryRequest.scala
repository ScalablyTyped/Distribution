package typings
package awsDashSdkLib.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEnvironmentManagedActionHistoryRequest extends js.Object {
  /**
    * The environment ID of the target environment.
    */
  var EnvironmentId: js.UndefOr[EnvironmentId] = js.undefined
  /**
    * The name of the target environment.
    */
  var EnvironmentName: js.UndefOr[EnvironmentName] = js.undefined
  /**
    * The maximum number of items to return for a single request.
    */
  var MaxItems: js.UndefOr[Integer] = js.undefined
  /**
    * The pagination token returned by a previous request.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeEnvironmentManagedActionHistoryRequest {
  @scala.inline
  def apply(
    EnvironmentId: EnvironmentId = null,
    EnvironmentName: EnvironmentName = null,
    MaxItems: js.UndefOr[Integer] = js.undefined,
    NextToken: String = null
  ): DescribeEnvironmentManagedActionHistoryRequest = {
    val __obj = js.Dynamic.literal()
    if (EnvironmentId != null) __obj.updateDynamic("EnvironmentId")(EnvironmentId)
    if (EnvironmentName != null) __obj.updateDynamic("EnvironmentName")(EnvironmentName)
    if (!js.isUndefined(MaxItems)) __obj.updateDynamic("MaxItems")(MaxItems)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeEnvironmentManagedActionHistoryRequest]
  }
}

