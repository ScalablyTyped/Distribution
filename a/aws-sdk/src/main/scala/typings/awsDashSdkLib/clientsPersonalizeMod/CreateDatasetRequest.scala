package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDatasetRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset group to add the dataset to.
    */
  var datasetGroupArn: Arn
  /**
    * The type of dataset. One of the following (case insensitive) values:   Interactions   Items   Users  
    */
  var datasetType: DatasetType
  /**
    * The name for the dataset.
    */
  var name: Name
  /**
    * The ARN of the schema to associate with the dataset. The schema defines the dataset fields.
    */
  var schemaArn: Arn
}

object CreateDatasetRequest {
  @scala.inline
  def apply(datasetGroupArn: Arn, datasetType: DatasetType, name: Name, schemaArn: Arn): CreateDatasetRequest = {
    val __obj = js.Dynamic.literal(datasetGroupArn = datasetGroupArn, datasetType = datasetType, name = name, schemaArn = schemaArn)
  
    __obj.asInstanceOf[CreateDatasetRequest]
  }
}

