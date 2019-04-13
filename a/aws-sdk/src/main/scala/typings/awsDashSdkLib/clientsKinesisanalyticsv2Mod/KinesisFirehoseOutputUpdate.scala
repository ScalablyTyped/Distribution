package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KinesisFirehoseOutputUpdate extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the delivery stream to write to. 
    */
  var ResourceARNUpdate: ResourceARN
}

object KinesisFirehoseOutputUpdate {
  @scala.inline
  def apply(ResourceARNUpdate: ResourceARN): KinesisFirehoseOutputUpdate = {
    val __obj = js.Dynamic.literal(ResourceARNUpdate = ResourceARNUpdate)
  
    __obj.asInstanceOf[KinesisFirehoseOutputUpdate]
  }
}

