package typings.awsDashSdk.clientsAugmentedairuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HumanReviewDataAttributes extends js.Object {
  /**
    * Declares that your content is free of personally identifiable information or adult content. Amazon SageMaker may restrict the Amazon Mechanical Turk workers that can view your task based on this information.
    */
  var ContentClassifiers: typings.awsDashSdk.clientsAugmentedairuntimeMod.ContentClassifiers = js.native
}

object HumanReviewDataAttributes {
  @scala.inline
  def apply(ContentClassifiers: ContentClassifiers): HumanReviewDataAttributes = {
    val __obj = js.Dynamic.literal(ContentClassifiers = ContentClassifiers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HumanReviewDataAttributes]
  }
}

