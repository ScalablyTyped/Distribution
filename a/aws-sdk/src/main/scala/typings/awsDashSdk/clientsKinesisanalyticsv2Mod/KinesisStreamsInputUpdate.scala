package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisStreamsInputUpdate extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the input Kinesis data stream to read.
    */
  var ResourceARNUpdate: ResourceARN = js.native
}

object KinesisStreamsInputUpdate {
  @scala.inline
  def apply(ResourceARNUpdate: ResourceARN): KinesisStreamsInputUpdate = {
    val __obj = js.Dynamic.literal(ResourceARNUpdate = ResourceARNUpdate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KinesisStreamsInputUpdate]
  }
}

