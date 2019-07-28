package typings.awsDashSdk.clientsMigrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateCreatedArtifactRequest extends js.Object {
  /**
    * An ARN of the AWS resource related to the migration (e.g., AMI, EC2 instance, RDS instance, etc.) 
    */
  var CreatedArtifact: typings.awsDashSdk.clientsMigrationhubMod.CreatedArtifact
  /**
    * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission to make the call.
    */
  var DryRun: js.UndefOr[typings.awsDashSdk.clientsMigrationhubMod.DryRun] = js.undefined
  /**
    * Unique identifier that references the migration task.
    */
  var MigrationTaskName: typings.awsDashSdk.clientsMigrationhubMod.MigrationTaskName
  /**
    * The name of the ProgressUpdateStream. 
    */
  var ProgressUpdateStream: typings.awsDashSdk.clientsMigrationhubMod.ProgressUpdateStream
}

object AssociateCreatedArtifactRequest {
  @scala.inline
  def apply(
    CreatedArtifact: CreatedArtifact,
    MigrationTaskName: MigrationTaskName,
    ProgressUpdateStream: ProgressUpdateStream,
    DryRun: js.UndefOr[DryRun] = js.undefined
  ): AssociateCreatedArtifactRequest = {
    val __obj = js.Dynamic.literal(CreatedArtifact = CreatedArtifact, MigrationTaskName = MigrationTaskName, ProgressUpdateStream = ProgressUpdateStream)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[AssociateCreatedArtifactRequest]
  }
}

