package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KinesisStreamsOutputUpdate extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Kinesis data stream where you want to write the output.
    */
  var ResourceARNUpdate: ResourceARN
}

object KinesisStreamsOutputUpdate {
  @scala.inline
  def apply(ResourceARNUpdate: ResourceARN): KinesisStreamsOutputUpdate = {
    val __obj = js.Dynamic.literal(ResourceARNUpdate = ResourceARNUpdate)
  
    __obj.asInstanceOf[KinesisStreamsOutputUpdate]
  }
}

