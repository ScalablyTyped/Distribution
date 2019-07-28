package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDatasetGroupResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the new dataset group.
    */
  var datasetGroupArn: js.UndefOr[Arn] = js.undefined
}

object CreateDatasetGroupResponse {
  @scala.inline
  def apply(datasetGroupArn: Arn = null): CreateDatasetGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (datasetGroupArn != null) __obj.updateDynamic("datasetGroupArn")(datasetGroupArn)
    __obj.asInstanceOf[CreateDatasetGroupResponse]
  }
}

