package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisFirehoseOutputUpdate extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the delivery stream to write to. 
    */
  var ResourceARNUpdate: ResourceARN = js.native
}

object KinesisFirehoseOutputUpdate {
  @scala.inline
  def apply(ResourceARNUpdate: ResourceARN): KinesisFirehoseOutputUpdate = {
    val __obj = js.Dynamic.literal(ResourceARNUpdate = ResourceARNUpdate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[KinesisFirehoseOutputUpdate]
  }
}

