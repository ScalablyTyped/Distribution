package typings.awsDashSdk.clientsAugmentedairuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HumanLoopOutputContent extends js.Object {
  /**
    * The location of the Amazon S3 object where Amazon Augmented AI stores your human loop output. The output is stored at the following location: s3://S3OutputPath/HumanLoopName/CreationTime/output.json.
    */
  var OutputS3Uri: String = js.native
}

object HumanLoopOutputContent {
  @scala.inline
  def apply(OutputS3Uri: String): HumanLoopOutputContent = {
    val __obj = js.Dynamic.literal(OutputS3Uri = OutputS3Uri.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HumanLoopOutputContent]
  }
}

