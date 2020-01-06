package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisFirehoseInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the delivery stream.
    */
  var ResourceARN: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ResourceARN = js.native
}

object KinesisFirehoseInput {
  @scala.inline
  def apply(ResourceARN: ResourceARN): KinesisFirehoseInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KinesisFirehoseInput]
  }
}

