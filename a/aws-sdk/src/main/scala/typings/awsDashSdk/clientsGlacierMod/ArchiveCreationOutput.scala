package typings.awsDashSdk.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArchiveCreationOutput extends js.Object {
  /**
    * The ID of the archive. This value is also included as part of the location.
    */
  var archiveId: js.UndefOr[String] = js.native
  /**
    * The checksum of the archive computed by Amazon S3 Glacier.
    */
  var checksum: js.UndefOr[String] = js.native
  /**
    * The relative URI path of the newly added archive resource.
    */
  var location: js.UndefOr[String] = js.native
}

object ArchiveCreationOutput {
  @scala.inline
  def apply(archiveId: String = null, checksum: String = null, location: String = null): ArchiveCreationOutput = {
    val __obj = js.Dynamic.literal()
    if (archiveId != null) __obj.updateDynamic("archiveId")(archiveId.asInstanceOf[js.Any])
    if (checksum != null) __obj.updateDynamic("checksum")(checksum.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArchiveCreationOutput]
  }
}

