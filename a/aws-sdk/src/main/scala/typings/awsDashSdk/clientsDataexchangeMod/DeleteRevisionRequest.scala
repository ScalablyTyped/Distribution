package typings.awsDashSdk.clientsDataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRevisionRequest extends js.Object {
  /**
    * The unique identifier for a data set.
    */
  var DataSetId: __string = js.native
  /**
    * The unique identifier for a revision.
    */
  var RevisionId: __string = js.native
}

object DeleteRevisionRequest {
  @scala.inline
  def apply(DataSetId: __string, RevisionId: __string): DeleteRevisionRequest = {
    val __obj = js.Dynamic.literal(DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteRevisionRequest]
  }
}

