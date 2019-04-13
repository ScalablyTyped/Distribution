package typings
package awsDashSdkLib.clientsKinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeStreamInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the stream.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.undefined
  /**
    * The name of the stream.
    */
  var StreamName: js.UndefOr[StreamName] = js.undefined
}

object DescribeStreamInput {
  @scala.inline
  def apply(StreamARN: ResourceARN = null, StreamName: StreamName = null): DescribeStreamInput = {
    val __obj = js.Dynamic.literal()
    if (StreamARN != null) __obj.updateDynamic("StreamARN")(StreamARN)
    if (StreamName != null) __obj.updateDynamic("StreamName")(StreamName)
    __obj.asInstanceOf[DescribeStreamInput]
  }
}

