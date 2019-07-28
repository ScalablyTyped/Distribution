package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFolderResponse extends js.Object {
  /**
    * The metadata of the folder.
    */
  var Metadata: js.UndefOr[FolderMetadata] = js.undefined
}

object CreateFolderResponse {
  @scala.inline
  def apply(Metadata: FolderMetadata = null): CreateFolderResponse = {
    val __obj = js.Dynamic.literal()
    if (Metadata != null) __obj.updateDynamic("Metadata")(Metadata)
    __obj.asInstanceOf[CreateFolderResponse]
  }
}

