package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArchiveCreationOutput extends js.Object {
  /**
    * The ID of the archive. This value is also included as part of the location.
    */
  var archiveId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The checksum of the archive computed by Amazon S3 Glacier.
    */
  var checksum: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The relative URI path of the newly added archive resource.
    */
  var location: js.UndefOr[java.lang.String] = js.undefined
}

object ArchiveCreationOutput {
  @scala.inline
  def apply(
    archiveId: java.lang.String = null,
    checksum: java.lang.String = null,
    location: java.lang.String = null
  ): ArchiveCreationOutput = {
    val __obj = js.Dynamic.literal()
    if (archiveId != null) __obj.updateDynamic("archiveId")(archiveId)
    if (checksum != null) __obj.updateDynamic("checksum")(checksum)
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[ArchiveCreationOutput]
  }
}

