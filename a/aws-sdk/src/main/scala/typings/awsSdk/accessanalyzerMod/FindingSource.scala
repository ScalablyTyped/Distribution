package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindingSource extends js.Object {
  /**
    * Includes details about how the access that generated the finding is granted. This is populated for Amazon S3 bucket findings.
    */
  var detail: js.UndefOr[FindingSourceDetail] = js.native
  /**
    * Indicates the type of access that generated the finding.
    */
  var `type`: FindingSourceType = js.native
}

object FindingSource {
  @scala.inline
  def apply(`type`: FindingSourceType, detail: FindingSourceDetail = null): FindingSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindingSource]
  }
}

