package typings.awsDashSdk.clientsKinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMediaForFragmentListOutput extends js.Object {
  /**
    * The content type of the requested media.
    */
  var ContentType: js.UndefOr[typings.awsDashSdk.clientsKinesisvideoarchivedmediaMod.ContentType] = js.undefined
  /**
    * The payload that Kinesis Video Streams returns is a sequence of chunks from the specified stream. For information about the chunks, see PutMedia. The chunks that Kinesis Video Streams returns in the GetMediaForFragmentList call also include the following additional Matroska (MKV) tags:    AWS_KINESISVIDEO_FRAGMENT_NUMBER - Fragment number returned in the chunk.   AWS_KINESISVIDEO_SERVER_SIDE_TIMESTAMP - Server-side timestamp of the fragment.   AWS_KINESISVIDEO_PRODUCER_SIDE_TIMESTAMP - Producer-side timestamp of the fragment.   The following tags will be included if an exception occurs:   AWS_KINESISVIDEO_FRAGMENT_NUMBER - The number of the fragment that threw the exception   AWS_KINESISVIDEO_EXCEPTION_ERROR_CODE - The integer code of the exception   AWS_KINESISVIDEO_EXCEPTION_MESSAGE - A text description of the exception  
    */
  var Payload: js.UndefOr[typings.awsDashSdk.clientsKinesisvideoarchivedmediaMod.Payload] = js.undefined
}

object GetMediaForFragmentListOutput {
  @scala.inline
  def apply(ContentType: ContentType = null, Payload: Payload = null): GetMediaForFragmentListOutput = {
    val __obj = js.Dynamic.literal()
    if (ContentType != null) __obj.updateDynamic("ContentType")(ContentType)
    if (Payload != null) __obj.updateDynamic("Payload")(Payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMediaForFragmentListOutput]
  }
}

