package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEnvironmentManagedActionsResult extends js.Object {
  /**
    * A list of upcoming and in-progress managed actions.
    */
  var ManagedActions: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.ManagedActions] = js.native
}

object DescribeEnvironmentManagedActionsResult {
  @scala.inline
  def apply(ManagedActions: ManagedActions = null): DescribeEnvironmentManagedActionsResult = {
    val __obj = js.Dynamic.literal()
    if (ManagedActions != null) __obj.updateDynamic("ManagedActions")(ManagedActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEnvironmentManagedActionsResult]
  }
}

