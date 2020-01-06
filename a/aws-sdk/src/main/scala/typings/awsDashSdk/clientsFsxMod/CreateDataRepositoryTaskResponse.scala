package typings.awsDashSdk.clientsFsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDataRepositoryTaskResponse extends js.Object {
  /**
    * The description of the data repository task that you just created.
    */
  var DataRepositoryTask: js.UndefOr[typings.awsDashSdk.clientsFsxMod.DataRepositoryTask] = js.native
}

object CreateDataRepositoryTaskResponse {
  @scala.inline
  def apply(DataRepositoryTask: DataRepositoryTask = null): CreateDataRepositoryTaskResponse = {
    val __obj = js.Dynamic.literal()
    if (DataRepositoryTask != null) __obj.updateDynamic("DataRepositoryTask")(DataRepositoryTask.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDataRepositoryTaskResponse]
  }
}

