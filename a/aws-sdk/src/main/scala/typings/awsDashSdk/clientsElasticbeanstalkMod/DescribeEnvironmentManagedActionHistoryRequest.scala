package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEnvironmentManagedActionHistoryRequest extends js.Object {
  /**
    * The environment ID of the target environment.
    */
  var EnvironmentId: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.EnvironmentId] = js.native
  /**
    * The name of the target environment.
    */
  var EnvironmentName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.EnvironmentName] = js.native
  /**
    * The maximum number of items to return for a single request.
    */
  var MaxItems: js.UndefOr[Integer] = js.native
  /**
    * The pagination token returned by a previous request.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeEnvironmentManagedActionHistoryRequest {
  @scala.inline
  def apply(
    EnvironmentId: EnvironmentId = null,
    EnvironmentName: EnvironmentName = null,
    MaxItems: Int | Double = null,
    NextToken: String = null
  ): DescribeEnvironmentManagedActionHistoryRequest = {
    val __obj = js.Dynamic.literal()
    if (EnvironmentId != null) __obj.updateDynamic("EnvironmentId")(EnvironmentId.asInstanceOf[js.Any])
    if (EnvironmentName != null) __obj.updateDynamic("EnvironmentName")(EnvironmentName.asInstanceOf[js.Any])
    if (MaxItems != null) __obj.updateDynamic("MaxItems")(MaxItems.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEnvironmentManagedActionHistoryRequest]
  }
}

