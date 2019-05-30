package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFindingsRequest extends js.Object {
  /**
    * A collection of attributes that specify which findings you want to update.
    */
  var Filters: AwsSecurityFindingFilters
  /**
    * The updated note for the finding.
    */
  var Note: js.UndefOr[NoteUpdate] = js.undefined
  /**
    * The updated record state for the finding.
    */
  var RecordState: js.UndefOr[RecordState] = js.undefined
}

object UpdateFindingsRequest {
  @scala.inline
  def apply(Filters: AwsSecurityFindingFilters, Note: NoteUpdate = null, RecordState: RecordState = null): UpdateFindingsRequest = {
    val __obj = js.Dynamic.literal(Filters = Filters)
    if (Note != null) __obj.updateDynamic("Note")(Note)
    if (RecordState != null) __obj.updateDynamic("RecordState")(RecordState.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFindingsRequest]
  }
}

