package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelingJobInputConfig extends js.Object {
  /**
    * Attributes of the data specified by the customer.
    */
  var DataAttributes: js.UndefOr[LabelingJobDataAttributes] = js.undefined
  /**
    * The location of the input data.
    */
  var DataSource: LabelingJobDataSource
}

object LabelingJobInputConfig {
  @scala.inline
  def apply(DataSource: LabelingJobDataSource, DataAttributes: LabelingJobDataAttributes = null): LabelingJobInputConfig = {
    val __obj = js.Dynamic.literal(DataSource = DataSource)
    if (DataAttributes != null) __obj.updateDynamic("DataAttributes")(DataAttributes)
    __obj.asInstanceOf[LabelingJobInputConfig]
  }
}

