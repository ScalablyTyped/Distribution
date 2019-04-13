package typings
package awsDashSdkLib.clientsKinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateStreamInput extends js.Object {
  /**
    * The version of the stream whose metadata you want to update.
    */
  var CurrentVersion: Version
  /**
    * The name of the device that is writing to the stream.    In the current implementation, Kinesis Video Streams does not use this name.  
    */
  var DeviceName: js.UndefOr[DeviceName] = js.undefined
  /**
    * The stream's media type. Use MediaType to specify the type of content that the stream contains to the consumers of the stream. For more information about media types, see Media Types. If you choose to specify the MediaType, see Naming Requirements. To play video on the console, you must specify the correct video type. For example, if the video in the stream is H.264, specify video/h264 as the MediaType.
    */
  var MediaType: js.UndefOr[MediaType] = js.undefined
  /**
    * The ARN of the stream whose metadata you want to update.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.undefined
  /**
    * The name of the stream whose metadata you want to update. The stream name is an identifier for the stream, and must be unique for each account and region.
    */
  var StreamName: js.UndefOr[StreamName] = js.undefined
}

object UpdateStreamInput {
  @scala.inline
  def apply(
    CurrentVersion: Version,
    DeviceName: DeviceName = null,
    MediaType: MediaType = null,
    StreamARN: ResourceARN = null,
    StreamName: StreamName = null
  ): UpdateStreamInput = {
    val __obj = js.Dynamic.literal(CurrentVersion = CurrentVersion)
    if (DeviceName != null) __obj.updateDynamic("DeviceName")(DeviceName)
    if (MediaType != null) __obj.updateDynamic("MediaType")(MediaType)
    if (StreamARN != null) __obj.updateDynamic("StreamARN")(StreamARN)
    if (StreamName != null) __obj.updateDynamic("StreamName")(StreamName)
    __obj.asInstanceOf[UpdateStreamInput]
  }
}

