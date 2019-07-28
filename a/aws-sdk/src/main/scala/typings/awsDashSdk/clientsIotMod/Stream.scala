package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stream extends js.Object {
  /**
    * The ID of a file associated with a stream.
    */
  var fileId: js.UndefOr[FileId] = js.undefined
  /**
    * The stream ID.
    */
  var streamId: js.UndefOr[StreamId] = js.undefined
}

object Stream {
  @scala.inline
  def apply(fileId: js.UndefOr[FileId] = js.undefined, streamId: StreamId = null): Stream = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fileId)) __obj.updateDynamic("fileId")(fileId)
    if (streamId != null) __obj.updateDynamic("streamId")(streamId)
    __obj.asInstanceOf[Stream]
  }
}

