package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatasetContentVersionValue extends js.Object {
  /**
    * The name of the data set whose latest contents are used as input to the notebook or application.
    */
  var datasetName: DatasetName
}

object DatasetContentVersionValue {
  @scala.inline
  def apply(datasetName: DatasetName): DatasetContentVersionValue = {
    val __obj = js.Dynamic.literal(datasetName = datasetName)
  
    __obj.asInstanceOf[DatasetContentVersionValue]
  }
}

