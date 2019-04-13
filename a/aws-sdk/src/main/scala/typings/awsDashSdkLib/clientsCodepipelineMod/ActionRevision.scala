package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionRevision extends js.Object {
  /**
    * The date and time when the most recent version of the action was created, in timestamp format.
    */
  var created: Timestamp
  /**
    * The unique identifier of the change that set the state to this revision, for example a deployment ID or timestamp.
    */
  var revisionChangeId: RevisionChangeIdentifier
  /**
    * The system-generated unique ID that identifies the revision number of the action.
    */
  var revisionId: Revision
}

object ActionRevision {
  @scala.inline
  def apply(created: Timestamp, revisionChangeId: RevisionChangeIdentifier, revisionId: Revision): ActionRevision = {
    val __obj = js.Dynamic.literal(created = created, revisionChangeId = revisionChangeId, revisionId = revisionId)
  
    __obj.asInstanceOf[ActionRevision]
  }
}

