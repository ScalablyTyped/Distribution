package typings.awsDashSdk.clientsMigrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeMigrationTaskRequest extends js.Object {
  /**
    * The identifier given to the MigrationTask.
    */
  var MigrationTaskName: typings.awsDashSdk.clientsMigrationhubMod.MigrationTaskName
  /**
    * The name of the ProgressUpdateStream. 
    */
  var ProgressUpdateStream: typings.awsDashSdk.clientsMigrationhubMod.ProgressUpdateStream
}

object DescribeMigrationTaskRequest {
  @scala.inline
  def apply(MigrationTaskName: MigrationTaskName, ProgressUpdateStream: ProgressUpdateStream): DescribeMigrationTaskRequest = {
    val __obj = js.Dynamic.literal(MigrationTaskName = MigrationTaskName, ProgressUpdateStream = ProgressUpdateStream)
  
    __obj.asInstanceOf[DescribeMigrationTaskRequest]
  }
}

