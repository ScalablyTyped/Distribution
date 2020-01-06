package typings.awsDashSdk.clientsDataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDataSetRequest extends js.Object {
  /**
    * The unique identifier for a data set.
    */
  var DataSetId: __string = js.native
  /**
    * The description for the data set.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsDataexchangeMod.Description] = js.native
  /**
    * The name of the data set.
    */
  var Name: js.UndefOr[typings.awsDashSdk.clientsDataexchangeMod.Name] = js.native
}

object UpdateDataSetRequest {
  @scala.inline
  def apply(DataSetId: __string, Description: Description = null, Name: Name = null): UpdateDataSetRequest = {
    val __obj = js.Dynamic.literal(DataSetId = DataSetId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDataSetRequest]
  }
}

