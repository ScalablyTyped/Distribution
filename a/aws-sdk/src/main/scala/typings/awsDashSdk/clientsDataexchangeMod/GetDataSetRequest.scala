package typings.awsDashSdk.clientsDataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDataSetRequest extends js.Object {
  /**
    * The unique identifier for a data set.
    */
  var DataSetId: __string = js.native
}

object GetDataSetRequest {
  @scala.inline
  def apply(DataSetId: __string): GetDataSetRequest = {
    val __obj = js.Dynamic.literal(DataSetId = DataSetId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDataSetRequest]
  }
}

