package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KinesisFirehoseInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the delivery stream.
    */
  var ResourceARN: awsDashSdkLib.clientsKinesisanalyticsv2Mod.ResourceARN
}

object KinesisFirehoseInput {
  @scala.inline
  def apply(ResourceARN: ResourceARN): KinesisFirehoseInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN)
  
    __obj.asInstanceOf[KinesisFirehoseInput]
  }
}

