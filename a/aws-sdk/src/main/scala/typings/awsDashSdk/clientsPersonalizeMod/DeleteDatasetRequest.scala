package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDatasetRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset to delete.
    */
  var datasetArn: Arn
}

object DeleteDatasetRequest {
  @scala.inline
  def apply(datasetArn: Arn): DeleteDatasetRequest = {
    val __obj = js.Dynamic.literal(datasetArn = datasetArn)
  
    __obj.asInstanceOf[DeleteDatasetRequest]
  }
}

