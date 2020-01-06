package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckpointConfig extends js.Object {
  /**
    * (Optional) The local directory where checkpoints are written. The default directory is /opt/ml/checkpoints/. 
    */
  var LocalPath: js.UndefOr[DirectoryPath] = js.native
  /**
    * Identifies the S3 path where you want Amazon SageMaker to store checkpoints. For example, s3://bucket-name/key-name-prefix.
    */
  var S3Uri: typings.awsDashSdk.clientsSagemakerMod.S3Uri = js.native
}

object CheckpointConfig {
  @scala.inline
  def apply(S3Uri: S3Uri, LocalPath: DirectoryPath = null): CheckpointConfig = {
    val __obj = js.Dynamic.literal(S3Uri = S3Uri.asInstanceOf[js.Any])
    if (LocalPath != null) __obj.updateDynamic("LocalPath")(LocalPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckpointConfig]
  }
}

