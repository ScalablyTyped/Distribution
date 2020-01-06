package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TensorBoardOutputConfig extends js.Object {
  /**
    * Path to local storage location for tensorBoard output. Defaults to /opt/ml/output/tensorboard.
    */
  var LocalPath: js.UndefOr[DirectoryPath] = js.native
  /**
    * Path to Amazon S3 storage location for TensorBoard output.
    */
  var S3OutputPath: S3Uri = js.native
}

object TensorBoardOutputConfig {
  @scala.inline
  def apply(S3OutputPath: S3Uri, LocalPath: DirectoryPath = null): TensorBoardOutputConfig = {
    val __obj = js.Dynamic.literal(S3OutputPath = S3OutputPath.asInstanceOf[js.Any])
    if (LocalPath != null) __obj.updateDynamic("LocalPath")(LocalPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[TensorBoardOutputConfig]
  }
}

