package typings
package awsDashSdkLib.clientsMigrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeMigrationTaskRequest extends js.Object {
  /**
    * The identifier given to the MigrationTask.
    */
  var MigrationTaskName: awsDashSdkLib.clientsMigrationhubMod.MigrationTaskName
  /**
    * The name of the ProgressUpdateStream. 
    */
  var ProgressUpdateStream: awsDashSdkLib.clientsMigrationhubMod.ProgressUpdateStream
}

object DescribeMigrationTaskRequest {
  @scala.inline
  def apply(MigrationTaskName: MigrationTaskName, ProgressUpdateStream: ProgressUpdateStream): DescribeMigrationTaskRequest = {
    val __obj = js.Dynamic.literal(MigrationTaskName = MigrationTaskName, ProgressUpdateStream = ProgressUpdateStream)
  
    __obj.asInstanceOf[DescribeMigrationTaskRequest]
  }
}

