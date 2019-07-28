package typings.awsDashSdk.clientsMigrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateDiscoveredResourceRequest extends js.Object {
  /**
    * Object representing a Resource.
    */
  var DiscoveredResource: typings.awsDashSdk.clientsMigrationhubMod.DiscoveredResource
  /**
    * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission to make the call.
    */
  var DryRun: js.UndefOr[typings.awsDashSdk.clientsMigrationhubMod.DryRun] = js.undefined
  /**
    * The identifier given to the MigrationTask.
    */
  var MigrationTaskName: typings.awsDashSdk.clientsMigrationhubMod.MigrationTaskName
  /**
    * The name of the ProgressUpdateStream.
    */
  var ProgressUpdateStream: typings.awsDashSdk.clientsMigrationhubMod.ProgressUpdateStream
}

object AssociateDiscoveredResourceRequest {
  @scala.inline
  def apply(
    DiscoveredResource: DiscoveredResource,
    MigrationTaskName: MigrationTaskName,
    ProgressUpdateStream: ProgressUpdateStream,
    DryRun: js.UndefOr[DryRun] = js.undefined
  ): AssociateDiscoveredResourceRequest = {
    val __obj = js.Dynamic.literal(DiscoveredResource = DiscoveredResource, MigrationTaskName = MigrationTaskName, ProgressUpdateStream = ProgressUpdateStream)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[AssociateDiscoveredResourceRequest]
  }
}

