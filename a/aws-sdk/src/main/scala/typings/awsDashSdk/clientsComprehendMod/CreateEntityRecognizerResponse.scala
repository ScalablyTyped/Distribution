package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateEntityRecognizerResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that identifies the entity recognizer.
    */
  var EntityRecognizerArn: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.EntityRecognizerArn] = js.undefined
}

object CreateEntityRecognizerResponse {
  @scala.inline
  def apply(EntityRecognizerArn: EntityRecognizerArn = null): CreateEntityRecognizerResponse = {
    val __obj = js.Dynamic.literal()
    if (EntityRecognizerArn != null) __obj.updateDynamic("EntityRecognizerArn")(EntityRecognizerArn)
    __obj.asInstanceOf[CreateEntityRecognizerResponse]
  }
}

