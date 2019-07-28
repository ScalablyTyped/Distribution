package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KinesisFirehoseOutput extends js.Object {
  /**
    * The ARN of the destination delivery stream to write to.
    */
  var ResourceARN: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ResourceARN
}

object KinesisFirehoseOutput {
  @scala.inline
  def apply(ResourceARN: ResourceARN): KinesisFirehoseOutput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN)
  
    __obj.asInstanceOf[KinesisFirehoseOutput]
  }
}

