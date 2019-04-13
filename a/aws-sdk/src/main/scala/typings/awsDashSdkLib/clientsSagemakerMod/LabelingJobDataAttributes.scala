package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelingJobDataAttributes extends js.Object {
  /**
    * Declares that your content is free of personally identifiable information or adult content. Amazon SageMaker may restrict the Amazon Mechanical Turk workers that can view your task based on this information.
    */
  var ContentClassifiers: js.UndefOr[ContentClassifiers] = js.undefined
}

object LabelingJobDataAttributes {
  @scala.inline
  def apply(ContentClassifiers: ContentClassifiers = null): LabelingJobDataAttributes = {
    val __obj = js.Dynamic.literal()
    if (ContentClassifiers != null) __obj.updateDynamic("ContentClassifiers")(ContentClassifiers)
    __obj.asInstanceOf[LabelingJobDataAttributes]
  }
}

