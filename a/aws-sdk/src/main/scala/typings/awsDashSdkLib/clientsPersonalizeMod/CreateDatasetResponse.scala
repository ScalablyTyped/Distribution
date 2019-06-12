package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDatasetResponse extends js.Object {
  /**
    * The ARN of the dataset.
    */
  var datasetArn: js.UndefOr[Arn] = js.undefined
}

object CreateDatasetResponse {
  @scala.inline
  def apply(datasetArn: Arn = null): CreateDatasetResponse = {
    val __obj = js.Dynamic.literal()
    if (datasetArn != null) __obj.updateDynamic("datasetArn")(datasetArn)
    __obj.asInstanceOf[CreateDatasetResponse]
  }
}

