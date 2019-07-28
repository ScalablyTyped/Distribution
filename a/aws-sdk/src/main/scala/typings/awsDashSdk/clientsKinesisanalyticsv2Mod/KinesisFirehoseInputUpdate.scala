package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KinesisFirehoseInputUpdate extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the input delivery stream to read.
    */
  var ResourceARNUpdate: ResourceARN
}

object KinesisFirehoseInputUpdate {
  @scala.inline
  def apply(ResourceARNUpdate: ResourceARN): KinesisFirehoseInputUpdate = {
    val __obj = js.Dynamic.literal(ResourceARNUpdate = ResourceARNUpdate)
  
    __obj.asInstanceOf[KinesisFirehoseInputUpdate]
  }
}

