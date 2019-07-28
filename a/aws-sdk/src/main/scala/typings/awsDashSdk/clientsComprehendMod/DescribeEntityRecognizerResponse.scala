package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEntityRecognizerResponse extends js.Object {
  /**
    * Describes information associated with an entity recognizer.
    */
  var EntityRecognizerProperties: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.EntityRecognizerProperties] = js.undefined
}

object DescribeEntityRecognizerResponse {
  @scala.inline
  def apply(EntityRecognizerProperties: EntityRecognizerProperties = null): DescribeEntityRecognizerResponse = {
    val __obj = js.Dynamic.literal()
    if (EntityRecognizerProperties != null) __obj.updateDynamic("EntityRecognizerProperties")(EntityRecognizerProperties)
    __obj.asInstanceOf[DescribeEntityRecognizerResponse]
  }
}

