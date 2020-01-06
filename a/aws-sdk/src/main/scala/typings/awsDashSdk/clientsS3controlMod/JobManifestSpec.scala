package typings.awsDashSdk.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobManifestSpec extends js.Object {
  /**
    * If the specified manifest object is in the S3BatchOperations_CSV_20180820 format, this element describes which columns contain the required data.
    */
  var Fields: js.UndefOr[JobManifestFieldList] = js.native
  /**
    * Indicates which of the available formats the specified manifest uses.
    */
  var Format: JobManifestFormat = js.native
}

object JobManifestSpec {
  @scala.inline
  def apply(Format: JobManifestFormat, Fields: JobManifestFieldList = null): JobManifestSpec = {
    val __obj = js.Dynamic.literal(Format = Format.asInstanceOf[js.Any])
    if (Fields != null) __obj.updateDynamic("Fields")(Fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobManifestSpec]
  }
}

