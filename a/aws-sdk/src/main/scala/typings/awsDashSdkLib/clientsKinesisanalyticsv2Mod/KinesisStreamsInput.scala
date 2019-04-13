package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KinesisStreamsInput extends js.Object {
  /**
    * The ARN of the input Kinesis data stream to read.
    */
  var ResourceARN: awsDashSdkLib.clientsKinesisanalyticsv2Mod.ResourceARN
}

object KinesisStreamsInput {
  @scala.inline
  def apply(ResourceARN: ResourceARN): KinesisStreamsInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN)
  
    __obj.asInstanceOf[KinesisStreamsInput]
  }
}

