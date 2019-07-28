package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEnvironmentManagedActionsResult extends js.Object {
  /**
    * A list of upcoming and in-progress managed actions.
    */
  var ManagedActions: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.ManagedActions] = js.undefined
}

object DescribeEnvironmentManagedActionsResult {
  @scala.inline
  def apply(ManagedActions: ManagedActions = null): DescribeEnvironmentManagedActionsResult = {
    val __obj = js.Dynamic.literal()
    if (ManagedActions != null) __obj.updateDynamic("ManagedActions")(ManagedActions)
    __obj.asInstanceOf[DescribeEnvironmentManagedActionsResult]
  }
}

