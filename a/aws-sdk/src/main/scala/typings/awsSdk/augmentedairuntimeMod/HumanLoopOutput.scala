package typings.awsSdk.augmentedairuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HumanLoopOutput extends js.Object {
  /**
    * The location of the Amazon S3 object where Amazon Augmented AI stores your human loop output.
    */
  var OutputS3Uri: String = js.native
}

object HumanLoopOutput {
  @scala.inline
  def apply(OutputS3Uri: String): HumanLoopOutput = {
    val __obj = js.Dynamic.literal(OutputS3Uri = OutputS3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumanLoopOutput]
  }
}

