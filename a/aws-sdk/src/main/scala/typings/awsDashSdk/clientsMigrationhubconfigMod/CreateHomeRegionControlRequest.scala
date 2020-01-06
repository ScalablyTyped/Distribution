package typings.awsDashSdk.clientsMigrationhubconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateHomeRegionControlRequest extends js.Object {
  /**
    * Optional Boolean flag to indicate whether any effect should take place. It tests whether the caller has permission to make the call.
    */
  var DryRun: js.UndefOr[typings.awsDashSdk.clientsMigrationhubconfigMod.DryRun] = js.native
  /**
    * The name of the home region of the calling account.
    */
  var HomeRegion: typings.awsDashSdk.clientsMigrationhubconfigMod.HomeRegion = js.native
  /**
    * The account for which this command sets up a home region control. The Target is always of type ACCOUNT.
    */
  var Target: typings.awsDashSdk.clientsMigrationhubconfigMod.Target = js.native
}

object CreateHomeRegionControlRequest {
  @scala.inline
  def apply(HomeRegion: HomeRegion, Target: Target, DryRun: js.UndefOr[Boolean] = js.undefined): CreateHomeRegionControlRequest = {
    val __obj = js.Dynamic.literal(HomeRegion = HomeRegion.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateHomeRegionControlRequest]
  }
}

