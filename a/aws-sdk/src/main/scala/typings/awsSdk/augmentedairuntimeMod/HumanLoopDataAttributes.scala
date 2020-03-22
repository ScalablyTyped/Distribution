package typings.awsSdk.augmentedairuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HumanLoopDataAttributes extends js.Object {
  /**
    * Declares that your content is free of personally identifiable information or adult content. Amazon SageMaker can restrict the Amazon Mechanical Turk workers who can view your task based on this information.
    */
  var ContentClassifiers: typings.awsSdk.augmentedairuntimeMod.ContentClassifiers = js.native
}

object HumanLoopDataAttributes {
  @scala.inline
  def apply(ContentClassifiers: ContentClassifiers): HumanLoopDataAttributes = {
    val __obj = js.Dynamic.literal(ContentClassifiers = ContentClassifiers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HumanLoopDataAttributes]
  }
}

