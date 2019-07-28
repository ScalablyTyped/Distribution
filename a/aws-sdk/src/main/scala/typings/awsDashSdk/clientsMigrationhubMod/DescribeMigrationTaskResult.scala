package typings.awsDashSdk.clientsMigrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeMigrationTaskResult extends js.Object {
  /**
    * Object encapsulating information about the migration task.
    */
  var MigrationTask: js.UndefOr[typings.awsDashSdk.clientsMigrationhubMod.MigrationTask] = js.undefined
}

object DescribeMigrationTaskResult {
  @scala.inline
  def apply(MigrationTask: MigrationTask = null): DescribeMigrationTaskResult = {
    val __obj = js.Dynamic.literal()
    if (MigrationTask != null) __obj.updateDynamic("MigrationTask")(MigrationTask)
    __obj.asInstanceOf[DescribeMigrationTaskResult]
  }
}

