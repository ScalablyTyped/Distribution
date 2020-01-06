package typings.awsDashSdk.clientsDataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRevisionRequest extends js.Object {
  /**
    * The unique identifier for a data set.
    */
  var DataSetId: __string = js.native
  /**
    * The unique identifier for a revision.
    */
  var RevisionId: __string = js.native
}

object GetRevisionRequest {
  @scala.inline
  def apply(DataSetId: __string, RevisionId: __string): GetRevisionRequest = {
    val __obj = js.Dynamic.literal(DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetRevisionRequest]
  }
}

