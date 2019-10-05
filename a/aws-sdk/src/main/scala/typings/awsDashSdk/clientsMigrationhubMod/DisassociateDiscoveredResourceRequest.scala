package typings.awsDashSdk.clientsMigrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateDiscoveredResourceRequest extends js.Object {
  /**
    * ConfigurationId of the ADS resource to be disassociated.
    */
  var ConfigurationId: typings.awsDashSdk.clientsMigrationhubMod.ConfigurationId
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

object DisassociateDiscoveredResourceRequest {
  @scala.inline
  def apply(
    ConfigurationId: ConfigurationId,
    MigrationTaskName: MigrationTaskName,
    ProgressUpdateStream: ProgressUpdateStream,
    DryRun: js.UndefOr[Boolean] = js.undefined
  ): DisassociateDiscoveredResourceRequest = {
    val __obj = js.Dynamic.literal(ConfigurationId = ConfigurationId, MigrationTaskName = MigrationTaskName, ProgressUpdateStream = ProgressUpdateStream)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[DisassociateDiscoveredResourceRequest]
  }
}

