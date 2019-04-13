package typings
package awsDashSdkLib.clientsKinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteStreamInput extends js.Object {
  /**
    * Optional: The version of the stream that you want to delete.  Specify the version as a safeguard to ensure that your are deleting the correct stream. To get the stream version, use the DescribeStream API. If not specified, only the CreationTime is checked before deleting the stream.
    */
  var CurrentVersion: js.UndefOr[Version] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the stream that you want to delete. 
    */
  var StreamARN: ResourceARN
}

object DeleteStreamInput {
  @scala.inline
  def apply(StreamARN: ResourceARN, CurrentVersion: Version = null): DeleteStreamInput = {
    val __obj = js.Dynamic.literal(StreamARN = StreamARN)
    if (CurrentVersion != null) __obj.updateDynamic("CurrentVersion")(CurrentVersion)
    __obj.asInstanceOf[DeleteStreamInput]
  }
}

