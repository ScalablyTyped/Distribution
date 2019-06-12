package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDatasetGroupRequest extends js.Object {
  /**
    * The ARN of the dataset group to delete.
    */
  var datasetGroupArn: Arn
}

object DeleteDatasetGroupRequest {
  @scala.inline
  def apply(datasetGroupArn: Arn): DeleteDatasetGroupRequest = {
    val __obj = js.Dynamic.literal(datasetGroupArn = datasetGroupArn)
  
    __obj.asInstanceOf[DeleteDatasetGroupRequest]
  }
}

